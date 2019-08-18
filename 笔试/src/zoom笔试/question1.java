package zoom±  ‘;

import java.util.Scanner;
import java.util.Stack;

public class question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			int count = 0;
			int _num = 0;
			Stack<Character> s = new Stack<Character>();
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '-' || str.charAt(i) == '.'
						|| (str.charAt(i) >= '0' && str.charAt(i) <= '9'))
					s.push(str.charAt(i));
			}
			StringBuffer sb = new StringBuffer();
			while(!s.isEmpty()) {
				char temp = s.pop();
				if(temp >= '0' && temp <= '9')
					sb.append(temp);
				else if(temp == '.'){
					count += Integer.valueOf(sb.reverse().toString());
					sb = new StringBuffer();
				} if(temp == '-') {
					_num = 1;
					while(!s.isEmpty() && s.peek() == '-') {
						s.pop();
						_num++;
					}
					if(_num% 2 == 1) {
						count += -Integer.valueOf(sb.reverse().toString());
						sb = new StringBuffer();	
					} else {
						count += Integer.valueOf(sb.reverse().toString());
						sb = new StringBuffer();
					}
				}
			}
			System.out.println(count);
		}
	}
}
