package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ25305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = sc.nextInt();
		int A[] = new int [N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		System.out.println(A[N-a]);
	}

}
