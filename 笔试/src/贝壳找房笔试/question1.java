package ±¥ø«’“∑ø±  ‘;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			long number = sc.nextLong();
			long[] arr = new long[(int) number];
			for(int i = 0; i < number; i++) {
				arr[i] = sc.nextLong();
			}
			long headNum = 0;
			long endNum = 0;
			long jueduizhi = Long.MAX_VALUE;
			for(int i = 1; i < number; i++) {
				long temp = arr[i] - arr[i - 1];
				temp = Math.abs(temp);
				if(temp < jueduizhi) {
					jueduizhi = temp;
					headNum = arr[i - 1];
					endNum = arr[i];
				}
			}
			System.out.println(headNum + " " + endNum);
		}
		
		sc.close();
	}
}
