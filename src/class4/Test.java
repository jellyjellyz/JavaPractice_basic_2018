package class4;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = {2,3,6,1,3,3};
//		SelectionSort.solution(arr);
//		System.out.println(Arrays.toString(arr));
		MergeSort s = new MergeSort();
		s.solution(arr);
		System.out.println(Arrays.toString(arr));
	}

}
