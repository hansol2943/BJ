package BJ;

import java.util.Scanner;

public class BJ15727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt = 0;
		int aa=a/5;
		int ab=a%5;
		if (ab!=0) {
			ab=1;
		}
		System.out.println(aa+ab);

	}

}
