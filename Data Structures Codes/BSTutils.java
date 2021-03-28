//this can be used by other calsses for making binary trees and insertion and searching made easy.
package Trees;

import java.util.*;

public class BSTutils {

    node root;

    BSTutils() {
        root = null;
    }

    public node createBST(int number_of_elements) {  // the n is number of elements in BST
        Random r = new Random();
        for (int i = 1; i <= number_of_elements; i++) {
            root = insert(root, r.nextInt(100));
        }
        return root;
    }

    public static node insert(node root, int data) {
        if (root == null) {
            return new node(data);
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public void postorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + " ");
    }

    public boolean search(node root, int n) {
        if (root == null) {
            return false;
        } else if (root.data == n) {
            return true;
        } else if (n <= root.data) {
            return search(root.left, n);
        } else {
            return search(root.right, n);
        }
    }

}
