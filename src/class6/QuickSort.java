package class6;

import java.util.Random;

public class QuickSort {
	
	Random rand = new Random();
	
	public void solution(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}
	
	
	// 1 3 5 2 6 8
	// i      j  p
	
	private void quickSort(int[] arr, int l, int r) {
		//base case
		if (l >= r) {
			return;
		}
		
		//logic
		int pivotIdx = quickSelect(arr, l, r);
		quickSort(arr, l, pivotIdx - 1);
		quickSort(arr, pivotIdx + 1, r);
		
	}
	
	
	private int quickSelect(int[] arr, int l, int r) { //put pivot in the correct position and return the correct position for pivot
		int randIdx = l + rand.nextInt(r - l + 1);
		swap(arr, randIdx, r);
		int i = l;
		int j = r - 1;
		while (i <= j) {
			if (arr[i] < arr[r]) {
				i++;
			} else if (arr[j] >= arr[r]) {
				j--;
			} else {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		swap(arr, i, r);
		return i;
	}
	private void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
}
