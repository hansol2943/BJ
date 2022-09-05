package BJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ8437 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger ab=a.add(b);
		BigInteger ba=a.subtract(b);
		BigInteger c = new BigInteger("2");
		System.out.println(ab.divide(c));
		System.out.println(ba.divide(c));
		
	}
}
