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
		
		/**
		 * This method uses the mergeSort algorithm to sort an array of
		 * integers.
		 * 
		 * @param array an unsorted or sorted integer array
		 * @param start the starting index of the sub-array to sort
		 * @param end the ending index of the sub-array to sort
		 * @return    the sorted array
		 */
		
		public static int[] mergeSort(int[] array, int start, int end) {
			if(start < end) {
				int mid = (start + end) / 2;
				mergeSort(array, start, mid);
				mergeSort(array, mid + 1, end);
				merge(array, start, mid, end);
			}
			
			return array;
		}
		
		/**
		 * A utility method for the mergeSort algorithm. It takes
		 * a starting index value, a mid index value, and an end
		 * index value and splits the array into two sub-arrays,
		 * populating a temporary array by choosing the smallest
		 * values from both sub-arrays.
		 * 
		 * @param array an integer array
		 * @param start the starting index of the sub-array to be sorted.
		 * @param mid the mid index of the sub-array to be sorted.
		 * @param end the end index of the sub-array to be sorted.
		 * @return    a sorted array.
		 */
		
		private static int[] merge(int[] array, int start, int mid, int end) {
			int[] temp = new int[end - start + 1];
			int leftStart = start;
			int rightStart = mid + 1;
			int k = 0;
			
			while(leftStart <= mid && rightStart <= end) {
				if(array[leftStart] < array[rightStart]) {
					temp[k] = array[leftStart];
					leftStart++;
				} else {
					temp[k] = array[rightStart];
					rightStart++;
				}
				k++;
			}
			
			if(leftStart <= mid) {
				while(leftStart <= mid) {
					temp[k] = array[leftStart];
					leftStart++;
					k++;
				}
			} else if(rightStart <= end) {
				while(rightStart <= end) {
					temp[k] = array[rightStart];
					rightStart++;
					k++;
				}
			}
			
			for(int i = 0; i < temp.length; i++) {
				array[start + i] = temp[i];
			}

			return array;
		}
}
