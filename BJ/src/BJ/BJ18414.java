package BJ;

import java.util.Scanner;

public class BJ18414 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a>=c&&a>=b) {
			System.out.println(c);
		}
		else if (a<=c&&a>=b) {
			System.out.println(a);
		}
		else if (a<c&&a<b) {
			System.out.println(b);
		}


	}

}
