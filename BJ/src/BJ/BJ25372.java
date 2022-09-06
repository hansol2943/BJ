package BJ;

import java.util.Scanner;

public class BJ25372 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String nn = sc.next();
			if (nn.length()>5&&nn.length()<10) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}

	}

}
