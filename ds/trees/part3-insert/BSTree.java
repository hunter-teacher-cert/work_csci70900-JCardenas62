import java.io.*;
import java.util.*;
public class BSTree {
  private TreeNode root;
  public BSTree(){
    root = null;
  }
  public int search(int key){
    TreeNode current = root;
    // System.out.println(root.getData());
    while (current != null){
      int currentValue = current.getData();
      // System.out.println(currentValue);
      if (currentValue == key){
        System.out.println("Found value");
        return currentValue;      } else if (currentValue < key){
          System.out.println("Going to the right");
          current = current.getRight();
        } else{  //if currentValue > key)
          System.out.println("Going to the left");
          current = current.getLeft();
        }
      }
      // do we really want to return -1?
      throw new NullPointerException();
    }
    public void insert(int key){
      TreeNode newNode = new TreeNode(key);
      // if the tree is empty
      // manually insert the new node as the root
      if (root==null){
        root = newNode;
        return;
      }
      TreeNode front = root;
      TreeNode trailer = root;
      while (front != null){
        int frontValue = front.getData();
        if (frontValue == key){
          // if we're here, it means the key is
          // already in the tree so we can
          // update this node in some way
          // and then return
          return;
        } else if (frontValue < key){
          trailer = front;
          front = front.getRight();
        } else {
          trailer = front;
          front = front.getLeft();
        }
      }
      if (key > trailer.getData()){
        // insert on the right
        trailer.setRight(newNode);
      } else {
        // insert on left
        trailer.setLeft(newNode);
      }
    }
    public void seed(){
      TreeNode t;    t = new TreeNode(10);
      root = t;
      // System.out.println(root.getData());
      t = new TreeNode(5);
      root.setLeft(t);
      // System.out.println(root.getLeft().getData());
      t = new TreeNode(20);
      root.setRight(t);    root.getLeft().setRight( new TreeNode(8));    t = new TreeNode(15);
      root.getRight().setLeft(t);    t = new TreeNode(22);
      root.getRight().setRight(t);
    }
  }
