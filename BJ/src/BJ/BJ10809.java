package BJ;

import java.util.Scanner;

public class BJ10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ap[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int ap2[]=new int [ap.length];
		int ap3[]=new int [ap.length];
		String S = sc.next();
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < ap.length; j++) {
				if (S.charAt(i)==ap[j]) {
					ap2[j]=i;
					ap3[j]++;
					if (ap3[j]>1) {
					ap2[j]=ap2[j]-ap3[j]+1;
					}
				}
				if (ap3[j]<1) {
					ap2[j]=-1;
				}
			}
		}
		for (int i = 0; i < ap2.length; i++) {
			System.out.print(ap2[i] + " ");
		}
		System.out.println();
	}
}
