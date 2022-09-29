package BJ;

import java.util.Scanner;

public class BJ17863 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int a = 0;
		for (int i = 0; i < 3; i++) {
			if (n.charAt(i)=='5') {
				a++;
			}
		}
		if (a==3) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}

}
