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
        return currentValue;

      } else if (currentValue < key){
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



  public void seed(){
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    // System.out.println(root.getData());
    t = new TreeNode(5);
    root.setLeft(t);
    // System.out.println(root.getLeft().getData());
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight( new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);

  }


}
