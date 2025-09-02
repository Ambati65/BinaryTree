public class BinaryTree {
    static class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
       }
    }

        public Node buildTree(int node[]){
             
            return buildhelper(node,new int[]{-1});
        }

        private Node buildhelper(int [] node,int[] idx){
            idx[0]++;

             if( idx[0]>=node.length || node[idx[0]]==-1){
                return null;
            }
            Node newNode=new Node(node[idx[0]]);
            newNode.left=buildhelper(node,idx);
            newNode.right=buildhelper(node,idx);

            return newNode;
        }

    public static void main(String[] args) {
        int node[]={2,4,-1,-1,5,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(node);
        System.out.println(root.data);
    }
}
