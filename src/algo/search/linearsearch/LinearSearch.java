package algo.search.linearsearch;

public class LinearSearch {
	
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
	public int search(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
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
	public int recursiveSearch(int[] array, int index, int number) {
		if (index > array.length - 1) {
			return -1;
		} else if (array[index] == number) {
			return index;
		} else {
			return recursiveSearch(array, index + 1, number);
		}
	}
}
