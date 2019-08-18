package ×Ö½ÚÌø¶¯;

import java.util.Scanner;

public class question4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int[][] arr = new int[N - 1][2];
			for(int i = 0; i < N - 1; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			
			int a0 = 0;
			int a1 = 0;
			int a2 = 0;
			for(int i = 1; i <= N - 1; i++) {
				if(i % 3 == 0) 
					a0 += i * (N - i);
				if(i % 3 == 1)
					a1 += i * (N - i);
				if(i % 3 == 2)
					a2 += i * (N - i);
			}
			
			a0 %= 1e9+7;
			a1 %= 1e9+7;
			a2 %= 1e9+7;
			System.out.println(a0 + " " + a1 + " " + a2);
		}
		sc.close();
	}
}
