package 趋势科技提前批笔试;

import java.util.Scanner;

public class solution1_1 {
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
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();	
		StringBuilder result = new StringBuilder();
		
		int head1 = 0;
		int head2 = 0;
		int end1 = 0;
		int end2 = 0;
		int maxEnd = 0;
		int addHead, addEnd = 0;
		int count = 0;
		boolean flag = false;
		
		if(str1.length == 1) {
			head1 = str1[0].length();
			sb1.append(str1[0]);
		} else {
			head1 = str1[0].length();
			end1 = str1[1].length();
			sb1.append(str1[0] + str1[1]);
		}
		
		if(str2.length == 1) {
			head2 = str2[0].length();
			sb2.append(str2[0]);
		} else {
			head2 = str2[0].length();
			end2 = str2[1].length();
			sb2.append(str2[0] + str2[1]);
		}
		
		maxEnd = end1 >= end2 ? end1 : end2;
		addHead = Math.abs(head2 - head1);
		addEnd = Math.abs(end2 - end1);
		
		if(end1 > end2) {
			for(int i = 0; i < addEnd; i++) {
				sb2.append('0');
			}
		} else {
			for(int i = 0; i < addEnd; i++) {
				sb1.append('0');
			}
		}
		
		sb1.reverse();
		sb2.reverse();
		
		if(head1 > head2) {
			for(int i = 0; i < addHead; i++) {
				sb2.append('0');
			}
		} else {
			for(int i = 0; i < addHead; i++) {
				sb1.append('0');
			}
		}
		
		for(int i = 0; i < sb1.length(); i++) {
			int a = Integer.parseInt(String.valueOf(sb1.charAt(i)));
			int b = Integer.parseInt(String.valueOf(sb2.charAt(i)));
			
			int temp = a + b + count;
			if(temp >= 10) {
				count = 1;
				temp -= 10;
			}
			if(temp != 0) 
				flag = true;
			if(flag)
				result.append(temp);
			if(i == maxEnd -1) {
				result.append('.');	
				flag = true;
			}

		}
		if(count != 0)
			result.append(count);
		if(result.charAt(0) == '.')
			result.deleteCharAt(0);
		return result.reverse().toString();
	}
}
