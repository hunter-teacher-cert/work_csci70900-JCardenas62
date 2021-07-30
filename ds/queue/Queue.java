import java.io.*;
import java.util.*;

/*Need:
1. Class that reprents queue
2. Class linked to at least two pointers - has to be done in driver
List of methods that I need:
1. enqueue(value)- adds a value at the end of the Queue
2. x = dequeue() - removes and returns the value at the front of the queue
3. x = front()- returns but doesnt remove the value at the front.
4. isEmpty()- returns true if the queue is Empty
5. size()- returns the number of items in the queue

*/
public class Queue{
  private Node front; // first of queue
  private Node last; // last item in queue

  // setting of parameters front and back to null.
  public Queue(){
    front = null;
    last = null;
  }
  //start the methods listed above.
  // enqueue(value) <-- add value to the end of the queue
  /* must create a new node that will be added to queue
     must identify first null to be replaced by item in queue
     must set identify the previous node
     must use previous node as reference to set the next node.


Use an if statement for setting the first node.
Use an else statement to give alternative  of adding node to last node.
  */
  public void enqueue(String value){
    Node newNode = new Node(value);
    if(front == null){ // empty
      front = newNode;
      //had to also set the newNode to be last or else I get an exception error.
      //have to give last a different value other than null to work
      last = newNode;
    } else {
      last.setNext(newNode);
      last = newNode;
    }
  }

  // x = dequeue() <-- remove and return the value at the front of the queue
  /* need to get the first in line.
  then need to store the first in line to return it.
  need to reassign the first in line to the next in line

  */
  public Node dequeue(){
    //firstInQueue will hold onto the value of front
    //front will change to the next item in the queue
    //return the firstInQueue value.
    Node firstInQueue = front;
    front = front.getNext();
    return firstInQueue;
  }

  // x = front() <-- return but don't remove the value at the front
  //make reference to the front of the queue
  public Node front(){
    return front;
  }

  // isEmpty() <-- returns true if the queue is empty
  //must use a true/false statement to test if list empty.
  //can use if statement or boolean. Try to use boolean due to lack of practice
  public boolean isEmpty(){
    //boolean will check if the condition written is true or false.
    //return true if the front is equal to null
    //assumes false if the front is not equal to null
    return front == null;
  }

  // size() <-- returns the number of items in the queue
  //need a counter to keep count
  //counter needs to increase by 1 every time it cycles through the Queue
  public int size(){
    //must start counter at 0
    //must create currentNode variable to store location and starting point of queue
    int counter = 0;
    Node currentNode = front;
    //while loop to go through the queue until it hits the end signified by null
    //keep increasing the counter and change the currentNode to the next node.
    while(currentNode != null){
      counter++;
      currentNode = currentNode.getNext();
    }
    return counter;
  }
  //needed a toString to create a string representation of the Queue
  public String toString(){
    Node currentNode;
    currentNode = front;
    String result = "";
    while (currentNode != null){
      result = result + currentNode + "->";
      currentNode = currentNode.getNext();
    }
    result = result + "null";
    return result;
  }
}
