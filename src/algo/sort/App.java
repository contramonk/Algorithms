package algo.sort;

public class App {
	public static void main(String[] args) {
		
		// Test selectionSort
		System.out.println("**********Test selectionSort***********");
		int[] selectionArray = {5,2,8,7,4,9,14,23,65,1};
		Sort.selectionSort(selectionArray);
		display(selectionArray);
		
		// Test insertionSort
		System.out.println("**********Test insertionSort***********");
		int[] insertionArray = {6,4,3,8,9,10,2,3,15,1};
		Sort.insertionSort(insertionArray);
		display(insertionArray);
		
	}
	
	public static void display(int[] array) {
		for(int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
