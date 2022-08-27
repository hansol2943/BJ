package BJ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BJ2822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer em[] = new Integer [8];
		Integer emb[] = new Integer [8];
		for (int i = 0; i < em.length; i++) {
			em[i] = sc.nextInt();
			emb[i] = em[i];
		}
		Arrays.sort(em,Collections.reverseOrder());
		int sum = 0;
		int sumb [] = new int [5];
		for (int i = 0; i < 5; i++) {
			sum+=em[i];
			sumb[i] = em[i];
		}
		System.out.println(sum);
		for (int i = 0; i < emb.length; i++) {
			if (sumb[0]==emb[i]) {
				System.out.print((i+1)+" ");
			}
			if (sumb[1]==emb[i]) {
				System.out.print((i+1)+" ");
			}
			if (sumb[2]==emb[i]) {
				System.out.print((i+1)+" ");
			}
			if (sumb[3]==emb[i]) {
				System.out.print((i+1)+" ");
			}
			if (sumb[4]==emb[i]) {
				System.out.print((i+1)+" ");
			}
		}
	}
}
