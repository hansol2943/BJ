package BJ;

import java.util.Scanner;

public class BJ15667 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= 100; i++) {

			if (((i*i)+i)+1==n) {
				System.out.println(i);
				break;
			}
			

		}
	}

}
