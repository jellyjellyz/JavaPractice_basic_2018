package class4;

public class MergeSort {
	public void solution(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		subProb(arr, 0, arr.length - 1);
		
	}
	private void subProb(int[] arr, int l, int r) {
		int m = l + (r - l) / 2;
		if (l >= r) {
			return;
		}
		subProb(arr, l, m);
		subProb(arr, m + 1, r);
		merge(arr, l, r, m);
	}
	private void merge(int[] arr, int l, int r, int m) {
		int i = l;
		int j = m + 1;
		int idx = l;
		int[] newarr = new int[arr.length];
		for (int k = l; k <= r; k++){
			newarr[k] = arr[k];
		}
		while (i <= m && j <= r) {
			if (newarr[i] < newarr[j]) {
				arr[idx] = newarr[i];
				i++;
			} else {
				arr[idx] = newarr[j];
				j++;
			}
			idx++;
		}
		while (i <= m) {
			arr[idx] = newarr[i];
			i++;
			idx++;
		}
	}

}
