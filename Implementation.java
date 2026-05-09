import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        this.val = val;
    }
}
class Pair
{
    Node node;
    int level;
    Pair(Node node, int level)
    {
        this.node = node;
        this.level = level;
    }
}
public class Implementation
{
    public static void main(String[] args)
    {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        levelOrder(a);
        levelOrderLineWise(a);
        System.out.println();
    }
    private static void kThLevel(Node root, int level, int k)
    {
        if(root == null)
            return;
        if(level == k)
            System.out.print(root.val+" ");
        kThLevel(root.left, level+1, k);
        kThLevel(root.right, level+1, k);
    }
    private static void levelOrderLineWise(Node root)
    {
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root, 0));
        while(q.size()>0)
        {
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if(front.level!=currLevel)
            {
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(node.left!=null)
                q.add(new Pair(node.left, level+1));
            if(node.right!=null)
                q.add(new Pair(node.right, level+1));
        }
        System.out.println();
    }
    private static void levelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0)
        {
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null)
                q.add(front.left);
            if(front.right!=null)
                q.add(front.right);
        }
        System.out.println();
    }
}
        