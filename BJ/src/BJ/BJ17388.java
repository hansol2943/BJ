package BJ;

import java.util.Scanner;

public class BJ17388 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int sum = A+B+C;
		if (sum>=100) {
			System.out.println("OK");
		}
		else {
			if (A<B&&A<C) {
				System.out.println("Soongsil");
			}
			if (B<A&&B<C) {
				System.out.println("Korea");
			}
			if (C<A&&C<B) {
				System.out.println("Hanyang");
			}
		}
	}

}
