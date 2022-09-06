package BJ;

import java.util.Scanner;

public class BJ24736 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 2; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int sum = (a*6 +b*3+c*2+d*1+e*2);
			sb.append(sum).append(" ");

		}
		System.out.println(sb);
	}

}
