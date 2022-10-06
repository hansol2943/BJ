package BJ;

import java.util.Scanner;

public class BJ20215 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = a+b-Math.sqrt(a*a+b*b);
		System.out.println(String.format("%.9f", c));
	}

}
