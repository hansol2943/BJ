package BJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ17362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		if (a%8==0) {
			System.out.println("2");
		}
		else if (a%8>=6) {
			System.out.println(10-a%8);
		}
		else  {
			System.out.println(a%8);
		}

		
	}

}
