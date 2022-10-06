package BJ;

import java.util.Scanner;

public class BJ20232 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a>=1995&&a<2020) {
			if (a==1996||a==1997||a==2000||a==2007||a==2008||a==2013||a==2018) {
				System.out.println("SPbSU");
			}
			else if (a==2006) {
				System.out.println("PetrSU, ITMO");
			}
			else {
				System.out.println("ITMO");
			}
		}

	}

}
