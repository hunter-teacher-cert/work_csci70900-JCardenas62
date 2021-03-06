import java.io.*;
import java.util.*;

public class TreeNode{
  private int data;
  private TreeNode left,right;

  public TreeNode(){
    this(0);
    left = null;
    right = null;
  }//end TreeNode()

  public TreeNode(int data){
	  this.data = data;
	  left = null;
	  right = null;
  }//end TreeNode(int)

  public void setData(int data){
	  this.data = data;
  }//end setData

  public void setLeft(TreeNode left){
	  this.left = left;
  }//end setLeft

  public void setRight(TreeNode right){
	  this.right = right;
  }//end setRight

  public int getData(){
	  return data;
  }//end getData

  public TreeNode getLeft(){
	  return left;
  }//end getLeft

  public TreeNode getRight(){
	  return right;
  }//end getRight

}//end class
