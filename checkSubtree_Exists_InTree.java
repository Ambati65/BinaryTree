public class checkSubtree_Exists_InTree {
    public static boolean isSubtree(BinaryTree.Node root, BinaryTree.Node subroot){
        if(root==null){
            return false;
        }
        if(root.data == subroot.data){
            return isIdentical(root.left,subroot.left);
        }

        return isSubtree(root.left, subroot) || isSubtree(root.left, subroot);
    }

    public static boolean isIdentical(BinaryTree.Node root , BinaryTree.Node subNode){
        if(root == null && subNode==null){
            return true;
        }else if(root == null || subNode==null || root.data != subNode.data){
            return false;
        }

        if(!isIdentical(root.left, subNode.left)){
            return false;
        }
        if(!isIdentical(root.right, subNode.right)){
            return false;
        }
        return true;
    }

     public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        BinaryTree tree=new BinaryTree();
        BinaryTree.Node root=tree.buildTree(node);
        
        int subnode[]={2,4,-1,-1};
        BinaryTree.Node subroot=tree.buildTree(subnode);

        System.out.println("Trees are " + isSubtree(root,subroot));
     }
}
