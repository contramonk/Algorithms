package algo.search;

public class Search {

	/**
	 * This method is given an integer array and a number to
	 * find in the array. It searches for the number using
	 * the linearSearch algorithm. It returns the index value 
	 * the number is stored at if the number is found or -1 if 
	 * the number is missing.
	 * 
	 * @param array  an integer array
	 * @param number an integer
	 * @return		 -1 if number is missing, or index position of number.
	 */
	public static int linearSearch(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * This method uses the binarySearch algorithm to search
	 * through a pre-sorted integer array for a given integer.
	 * 
	 * @param array  an integer array, must be sorted
	 * @param number an integer to find
	 * @return       -1 if number not found, or index position of number
	 */
	public static int binarySearch(int[] array, int number) {
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
	 * This method is given an integer array and a number to
	 * find in the array. It searches for the number using
	 * the recursiveLinearSearch algorithm. It returns the index value 
	 * the number is stored at if the number is found or -1 if 
	 * the number is missing.
	 * 
	 * @param array  an integer array
	 * @param index  the starting index of the sub-array.
	 * @param number an integer
	 * @return		 -1 if number is missing, or index position of number.
	 */
	public static int recursiveLinearSearch(int[] array, int index, int number) {
		if (index > array.length - 1) {
			return -1;
		} else if (array[index] == number) {
			return index;
		} else {
			return recursiveLinearSearch(array, index + 1, number);
		}
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
	public static int recursiveBinarySearch(int[] array, int start, int end, int number) {
		int mid = (start + end) / 2;
		if(start > end) {
			return -1;
		} else {
			if(array[mid] == number) {
				return mid;
			} else if(array[mid] > number) {
				return recursiveBinarySearch(array, start, mid - 1, number);
			} else {
				return recursiveBinarySearch(array, mid + 1, end, number);
			}
		}
	}
}
