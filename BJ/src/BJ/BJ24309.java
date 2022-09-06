package BJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ24309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();
		BigInteger mi = b.subtract(c);
		System.out.println(mi.divide(a));

	}

}
