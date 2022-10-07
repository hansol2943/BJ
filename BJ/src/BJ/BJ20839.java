package BJ;

import java.util.Scanner;

public class BJ20839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		if (c1>=c&&b1>=b&&a1>=a) {
			System.out.println("A");
		}
		else if (c1>=c&&b1>=b&&a1>=(a+1)/2) {
			System.out.println("B");
		}
		else if (c1>=c&&b1>=b) {
			System.out.println("C");
		}
		else if (c1>=c/2&&b1>=(b+1)/2) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
	}

}
