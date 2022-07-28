package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;



public class BJ2751 {

		public static void main(String[] args) throws Exception {
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter sc2 = new BufferedWriter(new OutputStreamWriter(System.out));
			Integer N[]=new Integer[Integer.parseInt(sc.readLine())];
			for (int i = 0; i < N.length; i++) {
				N[i]=Integer.parseInt(sc.readLine());
			}
			Arrays.sort(N);
			for (int i = 0; i < N.length; i++) {
			sc2.write(N[i]+"\n");
			}
			sc2.flush();
		}
}
