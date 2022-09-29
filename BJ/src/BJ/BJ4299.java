package BJ;

import java.util.Scanner;

public class BJ4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = 0;
		if (a<b) {
			System.out.println("-1");
		}
		else {
			c=(a+b)/2;
			d=(a-b)/2;
			if (c+d==a && c-d==b) {
				System.out.println(c+" "+d);
			}
			else {
				System.out.println("-1");
			}
					
		}
	}

}
