package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ10815 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn [] = new int [n];
		for (int i = 0; i < nn.length; i++) {
			nn[i]=sc.nextInt();
		}
		Arrays.sort(nn);
		
		int m = sc.nextInt();
		int mm [] = new int [m];
		for (int i = 0; i < mm.length; i++) {
			mm[i]=sc.nextInt();
		}
		
		for (int i = 0; i < mm.length; i++) {
			if (bs(mm[i],nn)<0) {
				System.out.println("0");
			}
			else {
				System.out.println("1");
			}

		}
		
	}

	private static int bs(int i, int[] mm) {
		int l = 0;
		int r = mm.length-1;
		
		while (r>=l) {
			int mid = (l+r)/2;
			if (mm[mid]==i) {
				return mid;
			}
			if (mm[mid]>i) {
				r = mid -1;
			}
			else {
				l = mid+1;
			}
		}
		return -1;

	}

}
