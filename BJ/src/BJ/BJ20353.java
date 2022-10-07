package BJ;

import java.util.Scanner;

public class BJ20353 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = Math.pow(16*a, 0.5);
		System.out.println(String.format("%.8f", b));
	}

}
