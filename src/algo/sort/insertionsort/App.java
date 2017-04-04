package algo.sort.insertionsort;

import algo.display.Display;

public class App {
	public static void main(String[] args) {
		
		// Test insertionSort (int)
		System.out.println("**********Test insertionSort (int)***********");
		int[] insertionArray = {6,4,3,8,9,10,2,3,15,1};
		InsertionSort sorter = new InsertionSort();
		sorter.sort(insertionArray);
		Display.print(insertionArray);
		
		// Test insertionSort (String)
		System.out.println("**********Test insertionSort (String)***********");
		String[] insertionArrayString = {"zeta", "gamma", "alpha", "Alpha", "cappa"};
		sorter.sort(insertionArrayString);
		Display.print(insertionArrayString);
	}
}
