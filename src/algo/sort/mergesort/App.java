package algo.sort.mergesort;

import algo.display.Display;

public class App {
	public static void main(String[] args) {
		
		// Test mergeSort
		System.out.println("**********Test mergeSort***********");
		int[] mergeSortArray = {4,9,1,2,0,7,5,3,5,7,9,1,4,5,3,8,9,12,4,9};
		MergeSort sorter = new MergeSort();
		sorter.sort(mergeSortArray, 0, mergeSortArray.length - 1);
		Display.print(mergeSortArray);
	}
}

