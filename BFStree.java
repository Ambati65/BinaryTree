import java.util.LinkedList;
import java.util.Queue;

public class BFStree {
    public static void levelOrder(BinaryTree.Node root){
        if(root==null){
            return;
        }

        Queue<BinaryTree.Node> q=new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            BinaryTree.Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
              if(q.isEmpty()){
                break;
               }else{
                q.add(null);
            } 
        }else{
            System.out.print(currNode.data);
            if(currNode.left !=null){
                q.add(currNode.left);
            }
            if(currNode.right != null){
                q.add(currNode.right);
            }
        }
        }
    }

     public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        BinaryTree tree=new BinaryTree();
        BinaryTree.Node root=tree.buildTree(node);

        levelOrder(root);
     }
}
