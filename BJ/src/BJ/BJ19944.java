package BJ;

import java.util.Scanner;

public class BJ19944 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (b==1||b==2) {
			System.out.println("NEWBIE!");
		}
		else if (a<b) {
			System.out.println("TLE!");
		}
		else {
			System.out.println("OLDBIE!");
		}
	}

}
