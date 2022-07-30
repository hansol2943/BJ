package BJ;

import java.util.Scanner;

public class BJ10156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = (k*n) - m ;
		if (sum < 0) {
			sum=0;
		}
		System.out.println(sum);
	}

}
