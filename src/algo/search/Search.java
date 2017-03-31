package algo.search;

public class Search {

	public static int linearSearch(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return i;
			}
		}
		return -1;
	}
	
	// must use on sorted array
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

	public static int recursiveLinearSearch(int[] array, int index, int number) {
		if (index > array.length - 1) {
			return -1;
		} else if (array[index] == number) {
			return index;
		} else {
			return recursiveLinearSearch(array, index + 1, number);
		}
	}
	
	// must use on sorted array
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
