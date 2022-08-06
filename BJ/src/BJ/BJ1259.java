package BJ;

import java.util.Scanner;

public class BJ1259 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			String P = sc.next();
			boolean aa=true;

			if (P.equals("0")) {
				break;
			}
			
			for (int i = 0; i < P.length()/2; i++) {
				if (P.charAt(i)!=P.charAt(P.length()-1-i)) {
					aa=false;
				}
			}
			if (aa) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
