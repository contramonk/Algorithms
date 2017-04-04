package algo.search.binarysearch;

public class BinarySearch {
	
	/**
	 * This method uses the binarySearch algorithm to search
	 * through a pre-sorted integer array for a given integer.
	 * 
	 * @param array  an integer array, must be sorted
	 * @param number an integer to find
	 * @return       -1 if number not found, or index position of number
	 */
	public int search(int[] array, int number) {
		int p = 0;
		int r = array.length - 1;

		while (p <= r) {
			int q = (p + r) / 2;
			if (number == array[q]) {
				return q;
			}
			if (number > array[q]) {
				p = q + 1;
			}
			if (number < array[q]) {
				r = q - 1;
			}
		}
		return -1;
	}
	
	/**
	 * This method uses the recursiveBinarySearch algorithm to search
	 * through a pre-sorted integer array for a given integer.
	 * 
	 * @param array  an integer array, must be sorted
	 * @param start  the starting index position of the sub-array
	 * @param end    the last index position of the sub-array
	 * @param number an integer to find
	 * @return       -1 if number not found, or index position of number
	 */
	public int recursiveSearch(int[] array, int start, int end, int number) {
		int mid = (start + end) / 2;
		if(start > end) {
			return -1;
		} else {
			if(array[mid] == number) {
				return mid;
			} else if(array[mid] > number) {
				return recursiveSearch(array, start, mid - 1, number);
			} else {
				return recursiveSearch(array, mid + 1, end, number);
			}
		}
	}
}
