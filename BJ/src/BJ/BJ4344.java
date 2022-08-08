package BJ;

import java.util.Scanner;

public class BJ4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		double sum = 0;
		double avr = 0;
		int cnt = 0;
		double as=0;
		for (int i = 0; i < C; i++) {
			int N =sc.nextInt();
			int nj[] = new int [N];
			for (int j = 0; j < N; j++) {
				nj[j]=sc.nextInt();
				sum+=(double) nj[j];
			}
			for (int j = 0; j < N; j++) {
				avr=(double) sum/N;
				if (avr<nj[j]) {
					cnt++;
				}
			}
			as=(double)cnt/N;
		System.out.println(String.format("%.3f", as*100)+"%");
		avr=0;
		sum=0;
		cnt=0;
		as=0;
		}

	}
}
