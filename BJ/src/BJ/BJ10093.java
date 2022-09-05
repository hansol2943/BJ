package BJ;

import java.util.Scanner;

public class BJ10093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long cnt = Math.abs(a-b)-1;
		if (cnt == -1) {
			cnt = 0;
		}
		System.out.println(cnt);
		if (a<b) {
			for (long i = a+1; i <= a+cnt; i++) {
				System.out.print(i+" ");
			}
		}
		if (a>b) {
			for (long i = b+1; i <= b+cnt; i++) {
				System.out.print(i+" ");
			}
		}
	}

}
