package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2456 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum []= new int [3];
		int acnt [] = new int [3];
		int bcnt [] = new int [3];
		int ccnt [] = new int [3];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			sum[0]+=a;
			if (a==1) {
				acnt[0]++;
			}
			if (a==2) {
				acnt[1]++;
			}
			if (a==3) {
				acnt[2]++;
			} 
			int b = sc.nextInt();
			sum[1]+=b;
			
			if (b==1) {
				bcnt[0]++;
			}
			if (b==2) {
				bcnt[1]++;
			}
			if (b==3) {
				bcnt[2]++;
			}
			
			int c = sc.nextInt();
			sum[2]+=c;
			if (c==1) {
				ccnt[0]++;
			}
			if (c==2) {
				ccnt[1]++;
			}
			if (c==3) {
				ccnt[2]++;
			}
		}
		int asum = acnt[0]+	(acnt[1]*2)*2+(acnt[2]*3)*3;
		int bsum = bcnt[0]+	(bcnt[1]*2)*2+(bcnt[2]*3)*3;
		int csum = ccnt[0]+	(ccnt[1]*2)*2+(ccnt[2]*3)*3;
		if (asum > bsum && asum > csum) {
			System.out.print("1"+" ");
		}
		else if (bsum > asum && bsum > csum) {
			System.out.print("2"+" ");
		}
		else if (csum > asum && csum > bsum) {
			System.out.print("3"+" ");
		}
		else {
		
			System.out.print("0"+" ");
		}
		Arrays.sort(sum);
		System.out.println(sum[2]);
		
		
	}

}
