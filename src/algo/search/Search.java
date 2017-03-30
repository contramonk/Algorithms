package algo.search;

public class Search {
	
	public static int linearSearch(int[] array, int number) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				return i;
			}
		}
		return -1;
	}
}
