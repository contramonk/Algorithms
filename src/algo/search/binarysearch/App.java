package algo.search.binarysearch;

public class App {
	public static void main(String[] args) {
		// Binary Search Test
		int[] bsArray = {2,4,6,8,10,11,12,13,22,55,56,59,60,100,123,122};
		System.out.println("**************Test binarySearch***************");
		BinarySearch searcher = new BinarySearch();
		int index = searcher.search(bsArray, 22);
		System.out.println(index);
		index = searcher.search(bsArray, 99);
		System.out.println(index);
		
		// Recursive Binary Search Test
		System.out.println("**************Test recursive binarySearch***************");
		index = searcher.recursiveSearch(bsArray, 0, bsArray.length, 4);
		System.out.println(index);
		index = searcher.recursiveSearch(bsArray, 0, bsArray.length, 60);
		System.out.println(index);
		index = searcher.recursiveSearch(bsArray, 0, bsArray.length, 99);
		System.out.println(index);
	}
}
