package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ5800 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int max = 0;
		int min = 0;
	
		for (int i = 0; i < x; i++) {
			int k = sc.nextInt();
			int lgm=0;
			int ks[] = new int [k];
			for (int j = 0; j < k; j++) {
				ks[j] = sc.nextInt();
			}
			Arrays.sort(ks);
			for (int j = 0; j < k-1; j++) {
				lgm=Math.max(lgm,ks[j+1]-ks[j]);
			}
			System.out.println("Class "+(i+1));
			System.out.println("Max "+ks[k-1]+", "+"Min "+ks[0]+", "+"Largest gap "+lgm);
		}
	}
}
