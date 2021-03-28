//code for Binary search tree
package Trees;
import java.util.*;
public class BinarySearchTree {
     class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static node root=null;
    public node insert(node root,int data){
        if(root==null){
            node n=new node(data);
            return n;
        }else if(root.data<=data){
            root.right=insert(root.right,data);
        }else root.left=insert(root.left,data);
        return root;
    
    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);    
    }
    public static boolean search(node root,int data){
        if(root==null) return false;
        else if(root.data==data) return true;
        else if(data<=root.data)return search(root.left,data);
        else return search(root.right,data);
    }
    public static void main(String[] args) {
        BinarySearchTree bt=new BinarySearchTree();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        while(!"quit".equals(s)){        
            root=bt.insert(root, Integer.parseInt(s));
            s=sc.nextLine();
        }
        inorder(root);
        System.out.println(search(root,25255));
        /*
        root=bt.insert(root, 20);
        root=bt.insert(root, 190);
        root=bt.insert(root, 25);
        root=bt.insert(root, 47);
        root=bt.insert(root, 621);
        inorder(root);
        */
     
        
        
    }
    
}
