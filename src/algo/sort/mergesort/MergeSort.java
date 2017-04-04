package algo.sort.mergesort;

public class MergeSort {
	/**
	 * This method uses the mergeSort algorithm to sort an array of
	 * integers.
	 * 
	 * @param array an unsorted or sorted integer array
	 * @param start the starting index of the sub-array to sort
	 * @param end the ending index of the sub-array to sort
	 * @return    the sorted array
	 */
	
	public int[] sort(int[] array, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			sort(array, start, mid);
			sort(array, mid + 1, end);
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
	
	private int[] merge(int[] array, int start, int mid, int end) {
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
