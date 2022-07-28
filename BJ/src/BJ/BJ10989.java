package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ10989 {
	static int A[] = new int [10001];
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(sc.readLine());
		for (int i = 0; i < N; i++) {
			A[Integer.parseInt(sc.readLine())] ++ ;
		}
		
		StringBuilder sc2 = new StringBuilder();
		for (int i = 0; i < A.length; i++) {
			while (A[i] > 0) {
				sc2.append(i).append('\n');
				A[i]--;
			}
		}
		System.out.println(sc2);
	}

}
