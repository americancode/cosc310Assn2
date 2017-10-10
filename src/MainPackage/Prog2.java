package MainPackage;
/**
 * COSC 310  Assignment 2
 * Prog2.java
 * 
 * 
 * This class is the main class for project 2 and makes use of the LinkedList class in java.
 * 
 * @author Nathaniel Churchill
 * Date: 2/22/17
 * Professor: Waleed Farag
 *
 */
import java.util.*;
import java.io.*;
public class Prog2 {

	public static void main(String[] args) {
		//creating the console scanner 
		Scanner in = new Scanner(System.in);
		//creating the linked list
		LinkedList<String> studentList = new LinkedList<>();
		
		
		try {
			Scanner fileIn = new Scanner(new File("StudentData.txt"));
			
			//loop for getting the data from the file
			while (fileIn.hasNextLine()){
				studentList.add(fileIn.next());// adding the string to the list
			}
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		//Output
		System.out.println("                  ################################################################################");
		System.out.println("                  ###############This program was written by Nathaniel Churchill##################");
		System.out.println("                  ################################################################################");

		System.out.println("       Displaying list content using traditional loop");
		for (int i = studentList.size() - 1; i >= 0; i--){
			System.out.println("Name of student #" + i + " is " + studentList.get(i));
		}
		
		//printing the last element in the list 
		System.out.println("The last element in the list is: " + studentList.getLast());
		//printing the first element in the list 
		System.out.println("The first element in the list is: " + studentList.getFirst());
		
		//getting the name to remove
		System.out.print("Enter the name of student to be removed: ");
		String query = in.next();
		
		
		// search for the query
		if (!studentList.remove(query)){
			System.out.println("The name could not be found and the program is being shut down.");
			System.exit(0);
		} else {
			System.out.println("Name " + query + " was found in the list and then it was removed");
			System.out.println("The size of the list after the removal is: " + studentList.size());
		}
		
		System.out.println("       Displaying list content using enhanced for loop");
		
		//printing with the enhanced for loop
		for(String element : studentList){
			System.out.println(element);
		}

		
		ListIterator iter = studentList.listIterator();
		String temp = null;
		
		//advancing the iterator ahead 3 positions
		for (int i = 0; i < 2; i++){
		iter.next();
		}
		//printing after advancing the iterator ahead
		System.out.println("The current employee after advancing the iter three times is: " + iter.next().toString());
		
		
		
		//inserting Edward
		iter.add("Edward");	
		//printing the list
		System.out.println("        Displaying List after inserting the Edward after the third position");
		System.out.println(studentList.toString());
		
		
		
		//iterating to the previous element and setting it to George
		iter.previous();
		iter.set("George");
		//printing the list
		System.out.println("        Displaying List after setting the current element to George");
		System.out.println(studentList.toString());
		
		
		
		
		// moving the iterator back and removing an element
		iter.previous();
		iter.remove();
		//printing the list
		System.out.println("        Displaying List after previous then remove");
		System.out.println(studentList.toString());


		//creating a HelpLists object
		HelpLists hl = new HelpLists();
		//rotating right 3 times
		hl.rotateRight(studentList, 3);
		//printing the list
		System.out.println("        Displaying List after calling the rotateRight() method");
		System.out.println(studentList.toString());

		//rotating right 6 more times
		hl.rotateRight(studentList, 6);
		//printing the list
		System.out.println("        Displaying List after calling the rotateRight() method one more time");
		System.out.println(studentList.toString());

		//finding the index of Robert
		int index =  hl.locateItem(studentList, "Robert");
		//printing the list
		if (index != -1){
			System.out.println("        The student named Robert was found and its last occurance is at location: " + index);
			System.out.println(studentList.toString());
		} else {
			System.out.println("The query 'Robert' was not found in the list");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
