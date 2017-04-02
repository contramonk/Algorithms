package algo.sort;

public class App {
	public static void main(String[] args) {
		
		// Test selectionSort (int)
		System.out.println("**********Test selectionSort (int)***********");
		int[] selectionArray = {5,2,8,7,4,9,14,23,65,1};
		Sort.selectionSort(selectionArray);
		display(selectionArray);
		
		// Test selectionSort (String)
		System.out.println("**********Test selectionSort (String)***********");
		String[] selectionArrayString = {"hello", "Whatsup", "abba", "cadabra", "Cadabra", "altitude"};
		Sort.selectionSort(selectionArrayString);
		display(selectionArrayString);
		
		// Test insertionSort (int)
		System.out.println("**********Test insertionSort (int)***********");
		int[] insertionArray = {6,4,3,8,9,10,2,3,15,1};
		Sort.insertionSort(insertionArray);
		display(insertionArray);
		
		// Test insertionSort (String)
		System.out.println("**********Test insertionSort (String)***********");
		String[] insertionArrayString = {"zeta", "gamma", "alpha", "Alpha", "cappa"};
		Sort.insertionSort(insertionArrayString);
		display(insertionArrayString);
	}
	
	public static void display(int[] array) {
		for(int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void display(String[] array) {
		for(String element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
