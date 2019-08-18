package 拼多多服务端第二批笔试;

import java.util.Arrays;
import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int L = sc.nextInt();
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int count = 0;
			if(N % 2 == 1) {
				int midIndex = N / 2 + 1;
				for(int i = midIndex - 1; i >= 0; i--) {
					count += Math.abs(arr[i] - arr[midIndex] + midIndex - i);
				}
				for(int i = midIndex + 1, flag = 1; i < arr.length; i++, flag++) {
					count += Math.abs(arr[i] - arr[midIndex] - midIndex + flag);
				}
			}
			System.out.println(count);
		}
		
		sc.close();
	}
}
