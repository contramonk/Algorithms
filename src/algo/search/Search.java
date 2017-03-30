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
}
