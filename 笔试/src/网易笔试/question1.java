package ÍøÒ×±ÊÊÔ;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			int[] sorces = new int[num];
			int[] sorces1 = new int[num];
			for(int i = 0; i < num; i++) {
				sorces[i] = sc.nextInt();
				sorces1[i] = sorces[i];
			}
			int count = sc.nextInt();
			int[] wen = new int[count];
			for(int i = 0; i < count; i++) {
				wen[i] = sc.nextInt();
			}
			
			Arrays.sort(sorces1);
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int next = sorces1[0];
			int number = 0;
			for(int i = 0; i < sorces1.length; i++) {
				if(sorces1[i] <= next)
					number++;
				else {
					map.put(next, number);
					number++;
					next = sorces1[i];
				}
			}
			map.put(sorces1[sorces1.length - 1], sorces1.length);
			
			for(int i = 0; i < wen.length; i++) {
				int s = map.get(sorces[wen[i]-1]) - 1;
				
				double p = s / (double)num * 100;
				
				DecimalFormat df = new DecimalFormat("0.000000");
				
				System.out.println(df.format(p));
			}
		}
		sc.close();
	}
}
