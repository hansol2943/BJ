package BJ;

import java.util.Scanner;

public class BJ2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = a*b;
		for (int i = 0; i < 5; i++) {
			int c = sc.nextInt();
			System.out.print((c-m)+" ");
		}
	}

}
