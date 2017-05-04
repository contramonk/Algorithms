package algo.sort.quicksort;

public class QuickSort {
	public int[] sort(int[] a, int start, int end) {
		if(start < end) {
			int q = partition(a, start, end);
			sort(a, start, q-1);
			sort(a, q+1, end);
		}
		return a;
	}
	
	public int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int i = start - 1;
		for( int j = start; j < end; j++ ) {
			if(a[j] <= pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = pivot;
		a[end] = temp;
		
		return i + 1;
	}
}
