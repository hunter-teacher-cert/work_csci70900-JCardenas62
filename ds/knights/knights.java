import java.io.*;
import java.util.*;

public class knights{

/* Goal: Have the knight move legally across the board until it has stepped on
each square once and does not repeat a square.*/

//create a playable board of 5x5. This is where the knight can legally move
  private int[][] board;
  private int rows = 5;
  private int cols = 5;

  private int size=8;
  private String clearScreen="[0;0H\n";
  private int possibilitiesAttempted = 0;

  private void delay(int n)
  {
    try
    {
      Thread.sleep(n);
    }
    catch(InterruptedException e)
    {

    }

  }


  public knights(int size){
    rows = size;
    cols = size;
    this.size=size;
    int row,col;

    // Notice that the board is 4 bigger in both directions with 0's
    // in the middle and a 2 row/col border of -1.
    // Why are we doing this?
    // This is to create an "out of bounds" area. The knight can now identify
    //the area it isn't supposed to enter and thus make legal moves only.
    board = new int[cols+4][rows+4];
//fill entire board including new rows and columns with -1
    for (row = 0; row < rows+4; row++){
      for (col = 0; col < cols+4 ; col++){
        board[col][row] = -1;
      }
    }
    //rewrite the -1 into 0 between rows/columns 2 and 6
    for (row = 2; row < rows+2; row++){
      for (col = 2; col < cols+2 ; col++){
        board[col][row] = 0;
      }
    }
//board has -1 in columns 0,1,7 and 8; rows 0 through 8.
//board has 0 in columns 2 through 6 and rows 2 through 6.

  }

  public String toString(){
    int row,col;
    int value;
    String result = "";
    for (row = 0; row < rows+4; row++){
      for (col = 0; col < cols+4; col++){
        value = board[col][row];

        // Why do we have this if as opposed to
        // just adding the next value to the string?
        //We have this because we need to keep track of which spaces the knight
        //has visited, and overwrite that while preserving the border of 0's
        if (value < 10 && value >= 0){
          result = result + "0" + value+ " ";
        } else {
          result = result + value + " ";
        }
      }
      result = result +"\n";
    }
    return result;
  }

  public boolean solve(int col,int row, int count){
    boolean solved = false;
//added a print statement to see if it is trying multiple attempts.
    possibilitiesAttempted++;
    System.out.println("Number of attempts: " + possibilitiesAttempted);

    System.out.println(clearScreen+this);
    delay(50);


    // This should return true when we've solved the problem
    // What should CHANGETHIS be?
    // in the maze we knew we were done when we found the exit
    // here, when do we know when we're done?
    // HINT: you have an nxn board and are done when you've visited
    // every board location
    if (count > rows*cols){
      System.out.println(clearScreen+this);
      System.out.println("Number of attempts:" + possibilitiesAttempted);
      return true;
    }


    // this should return false when we're at an illegal location
    // change CHANGETHIS to the appropriate boolean
    // HINT: we are tracking our moves in the board
    // and also built that border of -1 values.
    if (board[col][row] == -1 || board[col][row] != 0){
      return false;
    }


    // what do we put into the board
    // Change CHANGETHIS
    board[col][row] = count;

    delay(100);
    System.out.println(clearScreen+this);


    // Here we need to do try to do the 8 recursive calls
    // one for each knight's move.
    // It should be almost the same as the maze routine except:
    // 1. The maze had only four calls.
    // 2. The parameters for the call are a little different.
    // Add the recursive calls here
    //the different possible movements the knight can do regardless of boundary.

    if(!solved){
      solved = solve(col+2,row+1,count+1); // knight moves 2 to the right and 1 down
    }
    if(!solved){
      solved = solve(col+2,row-1,count+1); // knight moves 2 to the right and 1 up
    }
    if(!solved){
      solved = solve(col+1,row+2,count+1); // knight moves 1 to the right, and 2 down
    }
    if(!solved){
      solved = solve(col+1,row-2,count+1); // knight moves 1 to the right and 2 up
        }
    if(!solved){
      solved = solve(col-2,row+1,count+1); // knight moves 2 left and 1 down
        }
    if(!solved){
      solved = solve(col-2,row-1,count+1); // knight moves 2 left and 1 up
        }
    if(!solved){
      solved = solve(col-1,row+2,count+1); // knight moves 1 left and 2 down
    }

    if(!solved){
      solved = solve(col-1,row-2,count+1); // knight moves 1 left and 2 up
    }

    // Here we unset where we were for the backtracking

    board[col][row]=0;
    return solved;
  }




}
