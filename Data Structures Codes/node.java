package Trees;
public class node {
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
        left=null;
        right=null;
    }
    node(int data,node left,node right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
}
