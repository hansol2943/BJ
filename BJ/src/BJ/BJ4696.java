package BJ;

import java.util.Scanner;

public class BJ4696 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			Double a = sc.nextDouble();
			double b = 0;
			if (a==0) {
				break;
			}
			//b=(a*a*a*a)+(a*a*a)+(a*a)+a+1;
			
			b= Math.pow(a, 4)+Math.pow(a, 3)+Math.pow(a, 2)+a+1;
			System.out.println(String.format("%.2f", b));
		
		}

	}
}
