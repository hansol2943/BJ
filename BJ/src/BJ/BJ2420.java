package BJ;

import java.util.Scanner;

public class BJ2420 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long abssum=n-m;
		System.out.println(Math.abs(abssum));
	}

}
