package class3;

public class Quiz {
	public static int findmax(int[] arr) {
		int MAX = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > MAX) {
				MAX = i;
			}
		} 
		return MAX;
	}
	
	public static int[] insert(int[] arr, int idx, int val) {
		int[] newarr = new int[arr.length + 1];
		for (int i = 0; i < idx; i++) {
			newarr[i] = arr[i];
		} 
		newarr[idx] = val;
		for (int i = idx + 1; i < newarr.length; i++) {
			newarr[i] = arr[i - 1];
		}
		return newarr;
	}
	
	public static int[] reversearr(int[] arr) {
		int j = arr.length - 1;
		int[] newarr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newarr[j] = arr[i];
			j--;
		}
		return newarr;
	}
	
	public static int calTrace(int[][] matrix) {
		int trace = 0;
		if (matrix.length != matrix[0].length) {
			System.out.println("not a square matrix!");
			return -1;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				trace += matrix[i][i];
			}
			return trace;
		}
	}
}
