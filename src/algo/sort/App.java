package algo.sort;

public class App {
	public static void main(String[] args) {
		
		// Test selectionSort
		System.out.println("**********Test selectionSort***********");
		int[] array = {5,2,8,7,4,9,14,23,65,1};
		display(Sort.selectionSort(array));
	}
	
	public static void display(int[] array) {
		for(int element : array) {
			System.out.print(element + " ");
		}
	}
}
