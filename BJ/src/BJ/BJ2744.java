package BJ;

import java.util.Scanner;

public class BJ2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char a ;
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i)>91) {
				a=(char) (n.charAt(i)-32);
				System.out.print(a);
			}
			else {
				a=(char) (n.charAt(i)+32);
				System.out.print(a);
			}
		}
	}

}
