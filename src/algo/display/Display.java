package algo.display;

public class Display {
	public static void print(int[] array) {
		for(int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void print(String[] array) {
		for(String element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
