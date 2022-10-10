package BJ;

import java.util.Scanner;

public class BJ21335 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		
		double sum = (double)Math.round(Math.sqrt(a*Math.PI)*2*1000000000)/1000000000;

		System.out.println(sum);
	}

}
