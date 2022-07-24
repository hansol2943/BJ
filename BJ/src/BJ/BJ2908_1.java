package BJ;

import java.util.Scanner;

public class BJ2908_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int aa[] = new int [3];
		int bb[] = new int [3];
		for (int i = 0; i < aa.length; i++) {
			aa[i] = A%10;
			A=A/10;
		}
		for (int i = 0; i < bb.length; i++) {
			bb[i] = B%10;
			B=B/10;
		}
		if (aa[0]>bb[0]) {
			for (int i = 0; i < aa.length; i++) {
				System.out.print(aa[i]);
			}
		}
		if (aa[0]==bb[0]) {
			if (aa[1]>bb[1]) {
				for (int i = 0; i < aa.length; i++) {
					System.out.print(aa[i]);
				}
			}
			if (aa[1]==bb[1]) {
				
				if (aa[2]>bb[2]) {
					for (int i = 0; i < aa.length; i++) {
						System.out.print(aa[i]);
					}
				}
				if (aa[2]==bb[2]) {
					
				}
				if (aa[2]<bb[2]) {
					for (int i = 0; i < aa.length; i++) {
						System.out.print(bb[i]);
					}
				}
			}
			if (aa[1]<bb[1]) {
				for (int i = 0; i < aa.length; i++) {
					System.out.print(bb[i]);
				}
			}
		}
		if (aa[0]<bb[0]) {
			for (int i = 0; i < aa.length; i++) {
				System.out.print(bb[i]);
			}
		}
		
	}

}
