package algo.search.linearsearch;

public class App {
	public static void main(String[] args) {
		// Linear Search Test
		int[] lsArray = { 77, 45, 43, 2, 88, 12, 5, 78, 22, 9 };
		System.out.println("**************Test linearSearch***************");
		LinearSearch searcher = new LinearSearch();
		int index = searcher.search(lsArray, 2);
		System.out.println(index);
		index = searcher.search(lsArray, 55);
		System.out.println(index);
		
		// Recursive Linear Search Test
		System.out.println("**************Test recursive linearSearch***************");
		index = searcher.recursiveSearch(lsArray, 5, 78);
		System.out.println(index);
		index = searcher.recursiveSearch(lsArray, 5, 122);
		System.out.println(index);
	}
}
