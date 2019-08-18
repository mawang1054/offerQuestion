package 拼多多服务端第二批笔试;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			int[][] a = new int[2][s+1];
			for(int i=1;i<s+1;i++) {
				a[0][i]=1;
				if(i>=3) {
					a[1][i]=(i-1)/2;
				}
				a[1][i]=a[1][i]%1000000007;
			}
			for(int i=3;i<=n;i++) {
				int cur1=i%2;
				int cur2=(i-1)%2;
				for(int j=1;j<s+1;j++) {
					a[cur2][j]=0;
					int q=j;
					if(j-n>0) {
						a[cur2][j]+=a[cur1][j-n];
					}
					while(q-n>0) {
						a[cur2][j]+=a[cur2][q-n];
						q=q-n;
					}
				}
				a[cur2][i]=a[cur2][i]%1000000007;
			}
			System.out.println(a[(n-1)%2][s]);
		}
		sc.close();
	}
}
//	static int count;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
//			int n = sc.nextInt();
//			int s = sc.nextInt();
//			getCount(new int[n], 0, s);
//			System.out.println(count);
//		}
//		sc.close();
//	}
//	
//	static void getCount(int[] list, int n, int target) {
//		if(n == list.length - 1) {
//			if(target > list[n - 1]) {
//				count++;
//				count = count % 1000000007;
//				return;
//			} else {
//				return;
//			}
//		}
//		for(int i = n == 0 ? 1 : list[n - 1] + 1; i <= target / (list.length - n); i++) {
//			list[n] = i;
//			target =target - i;
//			getCount(list,  n + 1, target);
//			target = target + i;
//		}
//	}