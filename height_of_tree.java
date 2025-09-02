public class height_of_tree {
    public static int height(BinaryTree.Node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);

        int height=Math.max(lh,rh)+1;

        return height;
    }

     public static int count(BinaryTree.Node root){
        if(root==null){
            return 0;
        }

        int lc=count(root.left);
        int rc=count(root.right);

        int count=lc+rc+1;

        return count;
    }

    public static int SumofNodes(BinaryTree.Node root){
        if(root==null){
            return 0;
        }

        int lc=SumofNodes(root.left);
        int rc=SumofNodes(root.right);

        int sum=lc+rc+root.data;

        return sum;
    }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        BinaryTree tree=new BinaryTree();
        BinaryTree.Node root=tree.buildTree(node);

        System.out.println("height of tree" + " " +height(root));

        System.out.println("number of nodes in tree" + " "+ count(root));

        System.out.println("sum nodes in tree" +" " + SumofNodes(root));
     }
}
