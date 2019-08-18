package 贝壳找房笔试;

import java.util.Scanner;

public class question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int number = sc.nextInt();
			int[] arr = new int[number];
			for(int i = 0; i < number; i++) {
				arr[i] = sc.nextInt();
			}
			
			//求前递增数列
			int headIndex = 0;
			for(int i = 1; i < arr.length; i++) {
				if(arr[i - 1] < arr[i])
					headIndex = i;
				else
					break;
			}
			
			//求后递增数列
			int endIndex = arr.length - 1;
			for(int i = arr.length - 2; i >= 0; i--) {
				if(arr[i + 1] < arr[i])
					endIndex = i;
				else
					break;
			}
			
			int noLength = endIndex - headIndex - 1;
			int mix = Math.abs(arr[headIndex] - arr[endIndex]);
			
			if(endIndex == headIndex)
				System.out.println(0);
			
			if(arr[endIndex] == arr[headIndex]) {
				if(noLength / 2 == 0) {
					int n = (noLength + 1) / 2;
					int a0 = arr[endIndex] + 1;
					int an = arr[endIndex] + n;
					int result = (a0 + an) * n / 2 - an;
					System.out.println(result);
				} else {
					
				}
			}
		}
		sc.close();
	}
}
