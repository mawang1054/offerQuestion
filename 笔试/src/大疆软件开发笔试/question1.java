package 大疆软件开发笔试;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int X = sc.nextInt();
			int[] bugTime = new int[N];
			int sum = 0;
			for(int i = 0; i < N; i++) {
				bugTime[i] = sc.nextInt();
				sum = sum + bugTime[i];
			}
			int result = 0;
			if(A * X * 60 > sum) {
				result = sum / A;
				if(sum % A != 0)
					result++;
			} else {
				result = sum - A * X * 60;
				result += X * 60;
			}
			System.out.println(result);
		}
		sc.close();
	}
}