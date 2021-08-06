public class BarGraphCode
{
	/* DIRECTIONS
	Name:
	Date:
	1. Change the name of the method below  on line 11 from NAMETHIS to barGraphify.
	2. In the parameters of line 11, change *x* to the appropriate notation for an
		 array. Use your notebook as reference.
	3. On line 14, explain the for loop in complete sentences.
	4. On line 47, correctly change the parameters for main.
		 Hint: Look at past programs we have done and see what is written next to main.
	5. Make sure you complete steps 1-4 correctly. Run the program in the terminal.
		Make sure you are in the correct directory to run the program.
		Remember the order and process necessary to run the program.
	6. Describe what you see in 1-2 sentences on line 61. Describe the limitations of this graph.
	7. Create a new array called nums2 on line 48. Inside the array include the numbers: 5,2,1,4.
		 Look at how it is written in the example as a reference.
	8. Make a call to barGraphify with the new array you made on line 53. Run the program to make sure your graph prints.
		 Look at how it is written in the example as a reference.
	9. On line 49 create a new array and call it nums3. In this array count the number of books on each shelf.
		 Start at the bottom shelf as element 0, and go up. It might be difficult to see the two most bottom shelves so
		 I'll give you that one. There are 15 books in the bottom shelf. The one on top has 20 books.
		 [NB: The shelf has 6 levels. Level 0: 15 books, level 1: 20 books
		 level 2:15 books, level 3:20 books, level 4 10 books, level 5 16 books. Although the numbers here don't really
		 matter. What matter is the gathering of some sort of data and plotting it in a histogram.]
	10. Make a call to barGraphify with the new array on line 54. Run the program to make sure your graph prints.

	EXTRA CREDIT:
	If you are done with the above you may commplete the following tasks:
	1. Add titles to all your graphs. HINT: Think about how it prints, and how you can insert a line above the graph.
	2. Gather your own data from your classmates and create your own graph with a title on line 50 and make a call for it on line 55.
	*/

	public static void NAMETHIS (int*x* nums)
	{
		/*
			Explain the for loop here. Sentence Starter:
			For integer ____ (variable) starts at 0 ; as long as i is _____ (greater/ less) than the length of numbers;
			i is ______(increasing/decreasing).
		*/
		for(int i=0; i < nums.length; i++)
		{
			System.out.println(i + ": " + "=".repeat(nums[i]));
		}
	}

	public staticvoid main(CHANGETHIS)
	{
		int[]nums1 = {0,1,2,3}; // provided example
		//MAKE NEW ARRAY HERE: . LOOK AT EXAMPLE ABOVE.
		//MAKE 3rd ARRAY HERE. LOOK AT EXAMPLE ABOVE.
		//CHALLENGE ARRAY HERE

		barGraphify(nums1); //provided example
		//MAKE NEW CALL HERE. LOOK AT EXAMPLE ABOVE.
		//MAKE 3rd CALL HERE. LOOK AT EXAMPLE ABOVE.
		//CHALLENGE ARRAY HERE
	}
}

/*
Write down what you see here when you run the program.




Vocabulary Words:
English - Espanol
Array - Formacion
Element - Elemento
Shelf - Estante
*/
