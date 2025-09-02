public class MinDistBtwNodes {
    public static int min(BinaryTree.Node root,int a,int b){
        BinaryTree.Node lca = LCA.lca(root,a,b);

        int dist1= findDist(lca,a);

        int dist2=findDist(lca,b);

         return dist1 + dist2;

    }

    public static int findDist(BinaryTree.Node root,int k){
        if(root==null){
            return -1;
        }
        if(root.data==k){
            return 0;
        }

        int left=findDist(root.left,k);
        int right=findDist(root.right,k);

        if(left==-1 && right==-1){
            return -1;
        }
        else if(left==-1){
            return right+1;
        }
        else{
            return left+1;
        }
    }

    public static void main(String[] args){
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        BinaryTree tree=new BinaryTree();

        BinaryTree.Node root=tree.buildTree(node);

        System.out.println(min(root,4,6));
    }
}
