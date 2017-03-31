package algo.search;

public class App {
	public static void main(String[] args) {
		
		// Linear Search Test
		int[] lsArray = { 77, 45, 43, 2, 88, 12, 5, 78, 22, 9 };
		System.out.println("**************Test linearSearch***************");
		int index = Search.linearSearch(lsArray, 2);
		System.out.println(index);
		index = Search.linearSearch(lsArray, 55);
		System.out.println(index);

		// Binary Search Test
		int[] bsArray = {2,4,6,8,10,11,12,13,22,55,56,59,60,100,123,122};
		System.out.println("**************Test binarySearch***************");
		index = Search.binarySearch(bsArray, 22);
		System.out.println(index);
		index = Search.binarySearch(bsArray, 99);
		System.out.println(index);
		
		// Recursive Linear Search Test
		System.out.println("**************Test recursive linearSearch***************");
		index = Search.recursiveLinearSearch(lsArray, 5, 78);
		System.out.println(index);
		index = Search.recursiveLinearSearch(lsArray, 5, 122);
		System.out.println(index);
		
		
		// Recursive Binary Search Test
		System.out.println("**************Test recursive binarySearch***************");
		index = Search.recursiveBinarySearch(bsArray, 0, bsArray.length, 4);
		System.out.println(index);
		index = Search.recursiveBinarySearch(bsArray, 0, bsArray.length, 60);
		System.out.println(index);
		index = Search.recursiveBinarySearch(bsArray, 0, bsArray.length, 99);
		System.out.println(index);
	}
	
	
}
