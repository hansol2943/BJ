package BJ;

import java.util.Scanner;

public class BJ8545 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuffer b = new StringBuffer(a);
		String c = b.reverse().toString();
		System.out.println(c);

	}

}
