package BJ;

import java.math.BigInteger;
import java.util.Scanner;

public class BJ10093삼십점 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		BigInteger cnt = a.subtract(b);
		int cntt = cnt.intValue();
		if (cntt < 0) {
			cntt = (cntt * -1) ;
		}
		if (cntt > 0) {
			cntt = cntt -1;
		}
		int aa =a.intValue();
		int bb = b.intValue();
		System.out.println(cntt);
		if (aa<bb) {
			for (int i = aa+1; i <= aa+cntt; i++) {
				System.out.print(i+" ");
			}
		}
		if (aa>bb) {
			for (int i = bb+1; i <= bb+cntt; i++) {
				System.out.print(i+" ");
			}
		}
	}

}
