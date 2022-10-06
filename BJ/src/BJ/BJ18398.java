package BJ;

import java.util.Scanner;

public class BJ18398 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		for (int i = 0; i < t1; i++) {
			int t2 = sc.nextInt();
			for (int j = 0; j < t2; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(a+b+" "+a*b);
			}
		}
		
		
	}

}
