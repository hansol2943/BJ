package BJ;

import java.util.Scanner;

public class BJ18408 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		int e = 0;
		if (a==1) {
			d++;
		}
		if (b==1) {
			d++;
		}
		if (c==1) {
			d++;
		}
		
		if (a==2) {
			e++;
		}
		if (b==2) {
			e++;
		}
		if (c==2) {
			e++;
		}
		
		
		if (d>e) {
			System.out.println("1");
		}
		else {
			System.out.println("2");
		}
	}

}
