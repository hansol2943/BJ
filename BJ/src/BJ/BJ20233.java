package BJ;

import java.util.Scanner;

public class BJ20233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int aa = 0;
		int bb =0;
		if (e-30 > 0) {
			aa = a+(e-30)*b*21;
		}
		else {
			aa = a;
		}
		
		
		if (e-45>0) {
			bb = c+(e-45)*d*21;
		}
		else {
			bb = c;
		}
		
		
		System.out.println(aa+" "+bb);
	}

}
