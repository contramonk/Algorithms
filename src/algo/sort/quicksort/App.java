package algo.sort.quicksort;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] array = {5,6,3,4,8,0,1,4,7,12,9};
		int[] test = {0,1,3,4,4,5,6,7,8,9,12};
		QuickSort sorter = new QuickSort();
		sorter.sort(array, 0, array.length - 1);
			if(Arrays.equals(array, test)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
	}
}
