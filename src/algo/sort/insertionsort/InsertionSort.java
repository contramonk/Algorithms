package algo.sort.insertionsort;

public class InsertionSort {
	/**
	 * This method uses the insertionSort algorithm
	 * to sort a given integer array.
	 * @param array an integer array
	 * @return		the sorted array
	 */
	public int[] sort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			int element = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > element) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = element;
		}
		return array;
	}
	
	/**
	 * This method uses the insertionSort algorithm to
	 * sort a given String array.
	 * @param array a String array
	 * @return		the sorted array
	 */
	public String[] sort(String[] array) {
		for(int i = 1; i < array.length; i++) {
			String element = array[i];
			int j = i - 1;
			while(j >= 0 && array[j].compareToIgnoreCase(element) > 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = element;
		}
		return array;
	}
}
