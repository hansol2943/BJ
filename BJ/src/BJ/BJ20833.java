package BJ;

import java.util.Scanner;

public class BJ20833 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum+=Math.pow(i, 3);
		}
		System.out.println(sum);
	}

}
