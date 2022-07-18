package BJ;

import java.util.Scanner;

public class BJ10102 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int V = sc.nextInt();
		int AC = 0;
		int BC = 0;
		String re=sc.next();
		for (int i = 0; i < re.length(); i++) {
			if (re.charAt(i)=='A') {
				AC++;
			}
			if (re.charAt(i)=='B') {
				BC++;
			}
		}
		if (AC>BC) {
			System.out.println("A");
		}
		if (AC<BC) {
			System.out.println("B");
		}
		if (AC==BC) {
			System.out.println("Tie");
		}
	}
}
