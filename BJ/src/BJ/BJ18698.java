package BJ;

import java.util.Scanner;

public class BJ18698 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		int ac= 0;
		for (int i = 0; i < aa; i++) {
			String a = sc.next();
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j)=='U') {
					ac++;
				}
				else if (a.charAt(j)=='D') {
					break;
				}
				
			}
			System.out.println(ac);
			ac=0;
		}
		
		

	}

}
