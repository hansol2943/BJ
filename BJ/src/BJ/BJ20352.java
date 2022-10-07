package BJ;

import java.util.Scanner;

public class BJ20352 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = 2*Math.pow(a*Math.PI, 0.5);
		System.out.println(String.format("%.9f", b));
	}

}
