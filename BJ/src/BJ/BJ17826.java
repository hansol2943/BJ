package BJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ17826 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer js[] = new Integer [50];
		for (int i = 0; i < js.length; i++) {
			js[i]=sc.nextInt();
		}
		int cnjs = sc.nextInt();
		Arrays.sort(js,Collections.reverseOrder());
		for (int i = 0; i < js.length; i++) {
			if (js[i]==cnjs) {
				if (i+1<=5) {
					System.out.println("A+");
				}
				else if (i+1<=15) {
					System.out.println("A0");
				}
				else if (i+1<=30) {
					System.out.println("B+");
				}
				else if (i+1<=35) {
					System.out.println("B0");
				}
				else if (i+1<=45) {
					System.out.println("C+");
				}
				else if (i+1<=48) {
					System.out.println("C0");
				}
				else if (i+1<=50) {
					System.out.println("F");
				}
			}
		}
	}

}
