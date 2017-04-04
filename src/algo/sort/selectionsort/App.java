package algo.sort.selectionsort;

import algo.display.Display;

public class App {
	public static void main(String[] args) {
		
		// Test selectionSort (int)
		System.out.println("**********Test selectionSort (int)***********");
		int[] selectionArray = {5,2,8,7,4,9,14,23,65,1};
		SelectionSort sorter = new SelectionSort();
		sorter.sort(selectionArray);
		Display.print(selectionArray);
		
		// Test selectionSort (String)
		System.out.println("**********Test selectionSort (String)***********");
		String[] selectionArrayString = {"hello", "Whatsup", "abba", "cadabra", "Cadabra", "altitude"};
		sorter.sort(selectionArrayString);
		Display.print(selectionArrayString);
	}
}
