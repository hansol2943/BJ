package BJ;

import java.util.Scanner;

public class BJ2010 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		int re = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			re+=a;
		}
		re=re-(N-1);
		System.out.println(re);
	}
//1
}
