package BJ;

import java.util.Scanner;


public class BJ2675 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			for (int j = 0; j < S.length(); j++) {
				for (int j2 = 0; j2 < R; j2++) {
					System.out.print(S.charAt(j));
				}	
			}
			System.out.println();
		}
	}
}
