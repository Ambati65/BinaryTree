public class SumTransform {
    public static int transform(BinaryTree.Node root){
        if(root==null){
            return 0;
        }

        int leftSum=transform(root.left);
        int rightSum=transform(root.right);

        int data=root.data;

        int newLeft=root.left==null ? 0 : root.left.data;
        int newRight=root.right==null ? 0: root.right.data;

        root.data=leftSum + rightSum + newLeft + newRight;

        return data;

    }

    public static void main (String[] args){
        int node[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        BinaryTree.Node root=tree.buildTree(node);
        transform(root);
        DFSTtree.preorder(root);
    }
}
