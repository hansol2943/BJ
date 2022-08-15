package BJ;

import java.util.Scanner;

public class BJ2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
			int sum[]= new int [46];
			sum[0]=0;
			sum[1]=1;		
			for (int i = 2; i < sum.length; i++) {
				sum[i]=sum[i-1] +sum [i-2];
			}
			System.out.println(sum[a]);
		
	}

}
