package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2869 {

	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc2 = new StringTokenizer(sc.readLine());
		//StringBuilder sc3 = new StringBuilder();

		int	A = Integer.parseInt(sc2.nextToken());
		int	B = Integer.parseInt(sc2.nextToken());
		int	V = Integer.parseInt(sc2.nextToken());
		int day = (V-B)/(A-B);
		if ((V-B)%(A-B)!=0) {
			day++;
		}
		System.out.println(day);
		
		
		/*while (N<V) {
			if (N+A>=V) {
				day++;
				break;
			}
			else {
				day++;
				N = N+A-B;
			}
			
		}
		sc3.append(day);

		System.out.println(sc3);*/
	}

}
