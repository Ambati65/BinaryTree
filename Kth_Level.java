public class Kth_Level {
    public static void PrintKlevel(BinaryTree.Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data + " ");
            return;
        }

        PrintKlevel(root.left, level+1, k);
        PrintKlevel(root.right, level+1, k);
    }

    public static void main(String[] args){
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        BinaryTree tree=new BinaryTree();
        BinaryTree.Node root=tree.buildTree(node);

        int k=2;
        PrintKlevel(root,0,k);
    }
}
