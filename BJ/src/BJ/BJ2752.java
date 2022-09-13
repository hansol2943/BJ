package BJ;

import java.util.Scanner;

public class BJ2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int qqq = 0;
		int qq = 0;
		int q=0;
		
		if (a>b && a>c) {
			qqq=a;
		}
		if (b>a && b>c) {
			qqq=b;
		}
		if (c>a && c>b) {
			qqq=c;
		}
		
		if (a<b && a<c) {
			q=a;
		}
		if (b<a && b<c) {
			q=b;
		}
		if (c<a && c<b) {
			q=c;
		}
		
		if ((a<b && a>c)||(a>b && a<c)) {
			qq=a;
		}
		if ((b<a && b>c)||(b>a && b<c)) {
			qq=b;
		}
		if ((c<a && c>b)||(c>a && c<b)) {
			qq=c;
		}
		
		
		System.out.println(q+" "+qq+" "+qqq);
	}

}
