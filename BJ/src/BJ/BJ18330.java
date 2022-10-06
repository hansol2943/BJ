package BJ;

import java.util.Scanner;

public class BJ18330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		if (a<b+60) {
			c=a*1500;
		}
		else {
			c=(b+60)*1500+(a-(b+60))*3000;
		}

		System.out.println(c);
	}

}
