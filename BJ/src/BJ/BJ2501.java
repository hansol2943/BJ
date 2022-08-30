package BJ;

import java.util.Scanner;

public class BJ2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = sc.nextInt();
		int nqp[]=new int [n+1];
		nqp[0]=0;
		nqp[n]=n;
		int cntck=0;
		int cntans=0;
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
			nqp[i]=i;
			cntck++;
				if (cntck==cnt) {
				cntans=i;
				}
			}
			else {
				continue;
			}
		}
		if (cntck < cnt) {
			System.out.println("0");
		}
		else {
			System.out.println(nqp[cntans]);
		}

	}

}
