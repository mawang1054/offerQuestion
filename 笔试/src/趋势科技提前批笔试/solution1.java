package 趋势科技提前批笔试;

import java.util.Scanner;

public class solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		
		String sum = add(num1, num2);
		System.out.println(sum);
		
		sc.close();
	}

	private static String add(String num1, String num2) {
		String[] str1 = num1.split("\\.");
		String[] str2 = num2.split("\\.");
		
		int maxWei = 0;
		
		int wei1 = 0;
		int wei2 = 0;
		
		int head1 = 0;
		int head2 = 0;
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		if(str1.length != 1) {
			wei1 = str1[1].length();
			head1 = str1[0].length();
			sb1.append(str1[0] + str1[1]);
		}
		if(str2.length != 1) {
			wei2 = str2[1].length();
			head2 = str2[0].length();
			sb2.append(str2[0] + str2[1]);
		}
		
		if(wei1 <= wei2) {
			for(int i = 0; i < wei2 - wei1; i++) {
				sb1.append('0');
			}
			maxWei = wei2;
		}
		if(wei2 < wei1) {
			for(int i = 0; i < wei1 - wei2; i++) {
				sb2.append('0');
			}
			maxWei = wei1;
		}
		
		int count = 0;
		sb1.reverse();
		sb2.reverse();
		
		if(head1 < head2) {
			for(int i = 0; i < head2 - head1; i++) {
				sb1.append('0');
			}
		}
		if(head2 < head1) {
			for(int i = 0; i < head1 - head2; i++) {
				sb2.append('0');
			}
		}
		
		int length = sb1.length() > sb2.length()? sb1.length(): sb2.length();
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < length; i++) {
			int a = Integer.parseInt(String.valueOf(sb1.charAt(i)));
			int b = Integer.parseInt(String.valueOf(sb2.charAt(i)));
			
			int temp = a + b + count;
			if(temp > 10) {
				count = 1;
				temp -= 10;
			}
			result.append(temp);
			if(i == maxWei -1)
				result.append('.');
		}

		return result.reverse().toString();
	}
}
