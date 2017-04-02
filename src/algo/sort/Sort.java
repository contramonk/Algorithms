package algo.sort;

public class Sort {
	
	/**
	 * This method uses the selectionSort algorithm
	 * to sort a given integer array.
	 * 
	 * @param array  an integer array
	 * @return 		 the sorted array
	 */
		public static int[] selectionSort(int[] array) {
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
		public static String[] selectionSort(String[] array) {
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
		
		/**
		 * This method uses the insertionSort algorithm
		 * to sort a given integer array.
		 * @param array an integer array
		 * @return		the sorted array
		 */
		public static int[] insertionSort(int[] array) {
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
		public static String[] insertionSort(String[] array) {
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
