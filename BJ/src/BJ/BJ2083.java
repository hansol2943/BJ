package BJ;

import java.util.Scanner;

public class BJ2083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String n = sc.next();
			if (n.equals("#")) {
				break;
			}
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print(n+" ");
			if (a>17||b>=80) {
				System.out.println("Senior");
			}
			else {
				System.out.println("Junior");
			}
		}
	}

}
