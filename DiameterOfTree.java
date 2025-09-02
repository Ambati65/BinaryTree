public class DiameterOfTree {
    static class Info{
        int dia;
        int ht;
        public Info(int dia,int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public static Info diameter(BinaryTree.Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo =diameter(root.left);
        Info rightInfo=diameter(root.right);

        int dia=Math.max(leftInfo.dia ,Math.max(rightInfo.dia, leftInfo.ht + rightInfo.ht +1 ));
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(dia,ht);
    }

     public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        BinaryTree tree=new BinaryTree();
        BinaryTree.Node root=tree.buildTree(node);
        System.out.println("Diameter and height of tree are " + diameter(root).dia);
     }
}
