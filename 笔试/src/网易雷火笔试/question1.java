package ÍøÒ×À×»ğ±ÊÊÔ;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			String[] substr = str.split(",");
			int minLength = substr[0].length();
			for(int i = 0; i < substr.length; i++) {
				if(minLength > substr[i].length()) {
					minLength = substr[i].length();
				}
			}
			StringBuilder result = new StringBuilder();
			for(int i = 0; i < minLength; i++) {
				if(i == 0 && !isTrue(substr, i)) {
					result.append("-1");
					break;
				}
				else if(isTrue(substr, i)) {
					result.append(substr[0].charAt(i));
				}
			}
			System.out.println(result.toString());
		}
		sc.close();
	}
	
	public static boolean isTrue(String[] list, int index) {
		boolean flag = true;
		char temp = list[0].charAt(index);
		for(int i = 0; i < list.length; i++) {
			if(list[i].charAt(index) != temp) {
				flag = false;
				break;
			}
		}
		return flag;		
	}
}
