package BJ;

import java.util.Scanner;

public class BJ2609 {
//유클리드 호제법
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		System.out.println(gcd(a, b));
		System.out.println(lcm(a,b));
	}

	private static int lcm(int a, int b) {
		{
			return a * b / gcd(a,b);
		}
	}

	private static int gcd(int a, int b) {
		 while (b > 0)
		    {
		        int c = a;
		        a = b;
		        b = c%b;
		    }
		    return a;
	}

}

