package BJ;

import java.util.Scanner;

public class BJ9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			String b = sc.next();
			System.out.println(b.charAt(0)+""+b.charAt(b.length()-1));
		}

	}

}
