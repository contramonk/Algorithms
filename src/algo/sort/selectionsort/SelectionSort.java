package algo.sort.selectionsort;

public class SelectionSort {

	/**
	 * This method uses the selectionSort algorithm
	 * to sort a given integer array.
	 * 
	 * @param array  an integer array
	 * @return 		 the sorted array
	 */
		public int[] sort(int[] array) {
			for(int i = 0; i < array.length; i++) {
				int minimum = i;
				for(int j = i + 1; j < array.length; j++) {
					if(array[j] < array[minimum]) {
						minimum = j;
					}
				}
				int temp = array[i];
				array[i] = array[minimum];
				array[minimum] = temp;
			}
			return array;
		}
		
		/**
		 * This method uses the selectionSort algorithm to
		 * sort a given String array.
		 * 
		 * @param array a string array
		 * @return		the sorted array
		 */
		public String[] sort(String[] array) {
			for(int i = 0; i < array.length; i++) {
				int min = i;
				for(int j = i + 1; j < array.length; j++) {
					if(array[min].compareToIgnoreCase(array[j]) > 0) {
						min = j;
					}
				}
				String temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
			return array;
		}
}
