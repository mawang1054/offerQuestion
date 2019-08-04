package 大疆软件开发笔试;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class question3 {
	public static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int P = sc.nextInt();
			int C = sc.nextInt();
			
			int[][] map = new int[P][3];
			for(int i = 0; i < P; i++) {
				for(int j =0; j < 3; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int[] point = new int[C];
			for(int i = 0; i < C; i++) {
				point[i] = sc.nextInt();
			}
			
			int countPath = 0;
			for(int i = 0; i < C; i++) {
				core(map, 0, point[i], 0);
				countPath += Collections.min(result);
				result.clear();
			}
			System.out.println(countPath);
		}
		sc.close();
	}
	
	public static void core(int[][] map, int startPoint, int endPoint, int pathSum) {
		if(startPoint == endPoint) {
			result.add(pathSum);
			return;
		}
		for(int i = 0; i < map.length; i++) {
			if(map[i][0] == startPoint) {
				core(map, map[i][1], endPoint, pathSum + map[i][2]);
			}
		}
	}
}
