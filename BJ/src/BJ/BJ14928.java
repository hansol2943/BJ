package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ14928 {

	public static void main(String[] args) throws Exception {
		BufferedReader sc =new BufferedReader(new InputStreamReader(System.in));
		String a =sc.readLine();
		int n = 0;
		for (int i = 0; i < a.length(); i++) {
			int aa = a.charAt(i)-'0';
			n*=10;
			n=n+aa;
			n%=20000303;
		}
		System.out.println(n);
		
		
		/*StringBuilder sc2 = new StringBuilder();
		StringTokenizer st = new StringTokenizer(sc.readLine());
		BigInteger n = new BigInteger(st.nextToken());
		BigInteger birthday = new BigInteger("20000303");
		sc2.append(n.remainder(birthday));
		System.out.println(sc2.toString());*/
	}

}
