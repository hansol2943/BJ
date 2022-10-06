package BJ;

import java.util.Scanner;

public class BJ19602 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = (a*1)+(b*2)+(c*3);
		
		if (sum<10) {
			System.out.println("sad");
		}
		else if (sum>=10) {
			System.out.println("happy");
		}
	}

}
