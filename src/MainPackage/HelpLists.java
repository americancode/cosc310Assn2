package MainPackage;

import java.util.LinkedList;

/**
 * COSC 310  Assignment 2
 * HelpLists.java
 * 
 * 
 * This class is a helper class for a List
 * 
 * @author Nathaniel Churchill
 * Date: 2/22/17
 * Professor: Waleed Farag
 *
 */
public class HelpLists {

	/**
	 * This method rotates the elements of a list right n number of times
	 * 
	 * @param studentNames
	 *            a list of student names
	 * @param n
	 *            The number of times to rotate right
	 */
	public void rotateRight(LinkedList<String> studentNames, int n) {
		for(int i = 1; i <= n; i++){
			String str = studentNames.getLast();
			studentNames.removeLast();
			studentNames.addFirst(str);
		}
	}
	
	/**
	 * This method returns the index of location of a query
	 * @param studentNames the list to locate the index in
	 * @param name the query
	 * @return the index or -1 if not in the list
	 */
	public int locateItem(LinkedList<String> studentNames, String name){
		int index = studentNames.indexOf(name);
		return index;
	}
	
}
