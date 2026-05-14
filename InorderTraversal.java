import java.util.*;
class InorderTraversal
{
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    void dfs(Node root, ArrayList<Integer> ans)
    {
        if(root==null)
            return;
        dfs(root.left, ans);
        ans.add(root.val);
        dfs(root.right, ans);
    }
}