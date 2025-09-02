import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
    static class Info{
        BinaryTree.Node node;
        int hd; //horizontal distance
        public  Info(BinaryTree.Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void Topview(BinaryTree.Node root){
        if(root == null) return;

        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,BinaryTree.Node> mpp=new HashMap<>();

        q.add(new Info(root,0));
        q.add(null);
        int min=0,max=0;

        while(!q.isEmpty()){
            Info currNode=q.remove();
            if(currNode==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!mpp.containsKey(currNode.hd)){
                    mpp.put(currNode.hd,currNode.node);
                }
                if(currNode.node.left !=null){
                    q.add(new Info(currNode.node.left,currNode.hd-1));
                    min=Math.min(min,currNode.hd-1);
                }
                if(currNode.node.right != null){
                    q.add(new Info(currNode.node.right,currNode.hd+1));
                    max=Math.max(max,currNode.hd+1);
                }
            }
        }

        for(int i=min;i<=max;i++){
            System.out.println(mpp.get(i).data);
        }
    }

      public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();

        BinaryTree.Node root=tree.buildTree(node);

        Topview(root);
    }
}
