package 拼多多服务端第二批笔试;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int number = sc.nextInt();
			int[] arr = new int[number];
			for(int i = 0; i < number; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			double minEx = Double.MAX_VALUE;
			for(int i = 0; i < arr.length - 2; i++) {
				double arriver = (arr[i] + arr[i + 1] + arr[i + 2]) / 3.0;
				double temp = (Math.pow(arr[i] - arriver, 2) + Math.pow(arr[i + 1] - arriver, 2) + Math.pow(arr[i + 2] - arriver, 2)) / 3;
				if(minEx > temp)
					minEx = temp;
			}
			DecimalFormat df = new DecimalFormat("0.00");
			
			System.out.println(df.format(minEx));
		}
		sc.close();
	}
}
