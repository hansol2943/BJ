package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1920이진탐색 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn [] = new int [n]; 
		for (int i = 0; i < nn.length; i++) {
			nn[i] = sc.nextInt();
		}
		Arrays.sort(nn);
		
		int m = sc.nextInt();
		int mm [] = new int [m]; 
		for (int i = 0; i < mm.length; i++) {
			mm[i] = sc.nextInt();
		}
		
		for (int i = 0; i < mm.length; i++) {
			if (bs(mm[i],nn)>=0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
			
		}
		
		
	}

	private static int bs(int i, int[] mm) {
		int left = 0;
		int right = mm.length-1;
		while (right>=left) {
			int mid = (left + right)/2;
			if (mm[mid]==i) {
				return mid;
			}
			if (mm[mid]>i) {
				right = mid - 1 ;
			}else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
