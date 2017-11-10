package fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class fibs {
	
	public static void main(String[] args) {
		
		// number input
		@SuppressWarnings("resource")
		int number = new Scanner(System.in).nextInt();
		
		long[] series = new long[number];
		series[0] = 0;
		series[1] = 1;
		
		for (int i = 2; i < number; i++) {
		      series[i] = series[i - 1] + series[i - 2];
		}
		System.out.print(Arrays.toString(series));
	}
	
}
