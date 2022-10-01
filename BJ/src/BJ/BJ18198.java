package BJ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int a = 0;
		int b = 0;
		for (int i = 0; i < n.length(); i+=2) {
			if (n.charAt(i)=='A') {
				a+=Integer.parseInt(String.valueOf(n.charAt(i+1)));
			}
			else if (n.charAt(i)=='B') {
				b+=Integer.parseInt(String.valueOf(n.charAt(i+1)));
			}
			
			if (a>10||b>10) {
				if (a-1!=b&&b-1!=a) {
					if (a>b) {
						System.out.println("A");
					}
					else if (b>a) {
						System.out.println("B");
					}	
				}
			}
		}
		
		
	}

}
