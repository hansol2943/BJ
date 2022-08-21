package BJ;

import java.util.Scanner;

public class BJ1225 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		char ca,cb =0;
		long casum=0;
		long cbsum=0;
		long va[] = new long [10001];
		long vb[] = new long [10001];
		for (int i = 0; i < a.length(); i++) {
			ca=a.charAt(i);
			va[i]=Integer.parseInt(String.valueOf(ca));
			casum+=va[i];

		}
		for (int i = 0; i < b.length(); i++) {
			cb=b.charAt(i);
			vb[i]=Integer.parseInt(String.valueOf(cb));
			cbsum+=vb[i];

		}
		System.out.println(casum*cbsum);
		}	
		
}
