
public class DFSTtree {
    public static void preorder(BinaryTree.Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(BinaryTree.Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    public static void postorder(BinaryTree.Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +" ");
    }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        BinaryTree tree=new BinaryTree();
        BinaryTree.Node root=tree.buildTree(node);

         System.out.println("root element");
        System.out.println(root.data);

         System.out.println("Preorder Traversal:");
        preorder(root);

         System.out.println();

         System.out.println("inorder Traversal:");
        inorder(root);

        System.out.println();

         System.out.println("Postorder Traversal:");
        postorder(root);
    }
}
