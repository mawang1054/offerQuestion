package ±¥ø«’“∑ø±  ‘;

import java.util.Arrays;
import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int length = sc.nextInt();
			int[] arr = new int[length];
			for(int i = 0; i < length; i++) {
				arr[i] = sc.nextInt();
			}
			
			int count = 0;
			Arrays.sort(arr);
			for(int i = 0; i < length - 1; i++) {
				for(int j = i + 1; j < length; j++) {
					if(arr[i] >= arr[j] * 0.9)
						count++;
					else
						break;
				}
			}
			System.out.println(count);
		}
		
		sc.close();
	}
}
