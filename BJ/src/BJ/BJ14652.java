package BJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ14652 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		BigInteger k = sc.nextBigInteger();
		System.out.println(k.divide(m)+" "+k.remainder(m));
	}
}
		/*int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int nxm[][]=new int [n][m];
		int nn=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				nxm[i][j]=nn;
				nn++;
				if (nxm[i][j]==k) {
					System.out.println(i+" "+j);
				}
			}
		}


	}

}*/
		
