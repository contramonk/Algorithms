package algo.sort;

public class Sort {

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
}
