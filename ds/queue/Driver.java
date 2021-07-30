import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    //Queue represents a list of some of the video games I have purchased
    //and still have not opened and played with them but I have to play.

    // Have to set up a new queue
    Queue backLog = new Queue();
    //Have to print out the Queue
    System.out.println(" ");// add some space to make it easier to read.
    System.out.println("The start of the backLog should be empty: "+ backLog);
    System.out.println(" ");// add some space to make it easier to read.
    // enqueue(value) <-- add value to the end of the queue
    backLog.enqueue("Megaman Legacy Collection");
    backLog.enqueue("Xenoblade Chronicles 2");
    backLog.enqueue("Mass Effect Legendary Edition");
    backLog.enqueue("Fire Emblem: Three Houses");
    backLog.enqueue("Metal Gear Solid V: The Phantom Pain");
    backLog.enqueue("Dragon Ball Z: Kakarot");
    System.out.println("Queue: ");
    System.out.println(backLog);
    //list should print: Megaman--> Xenoblade-->Mass Effect-->Fire Emblem
    //-->Metal Gear Solid--> Dragon Ball Z--> null (end of enqueue)

    //x = dequeue() <-- remove and return the value at the front of the queue
    System.out.println(" ");// add some space to make it easier to read.
    System.out.println("First in the backlog is: " + backLog.dequeue()); // Megaman Legacy Collection
    System.out.println(" ");// add some space to make it easier to read.
    System.out.println("Next game in the backlog is: " + backLog.dequeue()); //Xenoblade Chronicles 2
    System.out.println(" ");// add some space to make it easier to read.
    System.out.println("The rest of my video game backlog are: " + backLog); // Mass Effect Legendary Edition
    System.out.println(" ");// add some space to make it easier to read.

    // // x = front() <-- return but don't remove the value at the front
    System.out.println("First game in my backlog: " + backLog.front());
    // First in queue is Megaman Legacy Collection; but only if dequeue is
    //commented out. If not then the first game is Mass Effect Legendary Edition

    // isEmpty() <-- returns true if the queue is empty
    System.out.println("Is the backlog empty?: " + backLog.isEmpty());
    // should receive false
    System.out.println(" ");// add some space to make it easier to read.
    //to test out if it returns true, must remove the rest of the queue
    System.out.println("Removing from backlog: " + backLog.dequeue());
    System.out.println("Removing from backlog: " + backLog.dequeue());
    System.out.println("Removing from backlog: " + backLog.dequeue());
    System.out.println("Removing from backlog: " + backLog.dequeue());
    System.out.println(" ");// add some space to make it easier to read.
    System.out.println("Is the backlog empty?: " + backLog.isEmpty()); // true

    // size() <-- returns the number of items in the queue
    System.out.println(" ");// add some space to make it easier to read.
    System.out.println("The number of video games in my backlog is: "+ backLog.size());
    //should print out 6 but because of dequeue it prints out 0.
    //To get 6 comment out the dequeue.
  }
}
