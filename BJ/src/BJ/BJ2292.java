package BJ;

import java.util.Scanner;

public class BJ2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N =sc.nextInt() ;
		long rmcnt=1;
		long i = 1;
		long cel = 1;
		long ans = 2;
		while (true) {
			if (N==1) {
				System.out.println("1");
				break;
			}
			ans = 6*i+1;
			if (ans>=N) {
				rmcnt++;
				System.out.println(rmcnt);
				break;
			}
			cel--;
			if (cel == 0) {
				rmcnt++;
				cel=rmcnt;
			}
			i++;
		}
	}

}
