package BJ;

import java.util.Scanner;

public class BJ3733 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println(m/(n+1));
		}
	}
}
//scanner eof 방법
//hasNext 입력된 토큰이 있으면 true를 반환하고, 그렇지 않을 경우 false를 반환.