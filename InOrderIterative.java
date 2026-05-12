import java.util.*;
class InOrderIterative
{
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(st.size()>0 || curr!=null)
        {
            if(curr!=null)
            {
                if(curr.left!=null)
                {
                    st.push(curr);
                    curr = curr.left;
                }
                else
                {
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            else
            {
                Node top = st.pop();
                ans.add(top.data);
                curr = top.right;
            }
        }
        return ans;
    }
}