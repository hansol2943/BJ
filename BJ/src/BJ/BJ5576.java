package BJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ5576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer w[] = new Integer [10];
		Integer k[] = new Integer [10];
		int ws = 0;
		int ks = 0;
		for (int i = 0; i < 10; i++) {
			w[i]=sc.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			k[i]=sc.nextInt();
		}
		Arrays.sort(w,Collections.reverseOrder());
		Arrays.sort(k,Collections.reverseOrder());
		for (int i = 0; i < 3; i++) {
			ws+=w[i];
			ks+=k[i];
		}
		System.out.println(ws + " " + ks);
	}

}
