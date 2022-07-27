package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ap[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int ap2[]=new int [ap.length];
		int ap3[]=new int [ap.length];
		int max= 0;
		char a;
		String S = sc.next().toUpperCase();
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < ap.length; j++) {
				if (S.charAt(i)==ap[j]) {
					ap2[j]++;
					ap3[j]++;
				}
			}
		}
		Arrays.sort(ap3);
		max = ap3[ap.length-1];
		if (max == ap3[ap.length-2]) {
			a = '?';
			System.out.println(a);
		}
		else {
			for (int i = 0; i < ap2.length; i++) {
				if (ap2[i]==max) {
					max=i+'A';
				} 
			}
			for (int i = 0; i < ap.length; i++) {
				if (ap[i]==max) {
					a = (char) ap[i];
					System.out.println(a);
				} 
			}
		}
	}
}