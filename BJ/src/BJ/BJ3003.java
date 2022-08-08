package BJ;

import java.util.Scanner;

public class BJ3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[]= {1,1,2,2,2,8};
		int B[]= new int [A.length];
		for (int i = 0; i < A.length; i++) {
			B[i]=sc.nextInt();
		}
		for (int i = 0; i < A.length; i++) {
			A[i]=A[i]-B[i];
			System.out.print(A[i]+" ");
		}	
	}
}
