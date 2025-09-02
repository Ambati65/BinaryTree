public class LCA {
    public static BinaryTree.Node lca(BinaryTree.Node root,int n1,int n2){
        if(root==null){
            return null;
        }
        if(root.data==n1 || root.data == n2){
            return root;
        }

        BinaryTree.Node leftlca=lca(root.left,n1,n2);
        BinaryTree.Node Rightlca=lca(root.left,n1,n2);

        if(leftlca==null){
            return Rightlca;
        }
        if(Rightlca==null){
            return leftlca;
        }

        return root;
    }

      public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();

        BinaryTree.Node root=tree.buildTree(node);

        System.out.println(lca(root,4,6).data);
      }
}
