package class3;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[][] arr = {new int[2], new int[3], new int[4]};
		for (int[] onearr : arr) {
			System.out.println(onearr.length);
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
