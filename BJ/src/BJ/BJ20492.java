package BJ;

import java.util.Scanner;

public class BJ20492 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = (int) (a-(a*0.22));
		int c = (int) (a-(a*0.2*0.22));
		System.out.println(b+" "+c);

	}

}
