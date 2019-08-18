package ×Ö½ÚÌø¶¯;

import java.util.ArrayList;
import java.util.Scanner;

public class question4 {
	public static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int[][] arr = new int[N - 1][2];
			for(int i = 0; i < N - 1; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			
			for(int i = 0; i < N; i++) {
				core(i, arr, 0);
			}
			
			int a0 = 0;
			int a1 = 0;
			int a2 = 0;
			for(int i = 0; i < result.size(); i++) {
				int temp = result.get(i);
				if(temp % 3 == 0)
					a0 += temp;
				if(temp % 3 == 1)
					a1 += temp;
				if(temp % 3 == 2)
					a2 += temp;
			}
			
			a0 %= 1e9+7;
			a1 %= 1e9+7;
			a2 %= 1e9+7;
			result.clear();
			System.out.println(a0 + " " + a1 + " " + a2);
		}
		
		sc.close();
	}
	
	public static void core(int headPoint, int[][] map, int length) {
		for(int i = 0; i < map.length; i++) {
			if(headPoint == map[i][0]) {
				result.add(length + 1);
				core(map[i][1], map, length + 1);
			}
		}
		return;
	}
}
