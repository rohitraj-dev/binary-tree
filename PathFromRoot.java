import java.util.*;
class PathFromRoot
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr, ans, sum);
        return ans;
    }
    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, int sum)
    {
        arr.add(root.data);
        if(sum == root.data);
        {
            ans.add(new ArrayList<>(arr));
        }
        if(root.left!=null)
            dfs(root.left, arr, ans sum - root.data);
        if(root.right != null)
            dfs(root.right, arr, ans, sum - root.data);
        arr.remove(arr.size() - 1);
    }
}