package BJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ13706 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger(); 
		System.out.println(N.sqrt());
		//Scanner sc = new Scanner(System.in);
	    //double N = sc.nextDouble();
		//double re = Math.sqrt(N);
		/*double N = sc.nextDouble()/2;
		double i = 1;
		while (N>0) {
			N-=i;
			i++;
			if (N<0) {
				N=N*2;
			}
		}
		System.out.println((int) Math.abs(N));
	}*/
		//System.out.println((int) Math.abs(re));
	}
}
