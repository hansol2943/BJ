package BJ;

import java.util.Scanner;

public class BJ18409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= 0;
		String c = sc.next();
		for (int i = 0; i < a; i++) {
			if (c.charAt(i)=='a'||c.charAt(i)=='a'||c.charAt(i)=='i'||c.charAt(i)=='u'||c.charAt(i)=='e'||c.charAt(i)=='o') {
				b++;
			}
		}
		System.out.println(b);
	}

}
