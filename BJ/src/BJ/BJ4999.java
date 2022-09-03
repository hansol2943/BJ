package BJ;

import java.util.Scanner;

public class BJ4999 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String m = sc.next();
		if (n.length() < m.length()) {
			System.out.println("no");
		}
		if (n.length() == m.length()) {
			System.out.println("go");
		}
		if (n.length() > m.length()) {
			System.out.println("go");
		}
	

	}

}
