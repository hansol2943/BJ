package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1924 {
	static int yo [] = {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc2 = new StringTokenizer(sc.readLine());
		int a = Integer.parseInt(sc2.nextToken());
		int b = Integer.parseInt(sc2.nextToken());
		int yosum = 0;
		for (int i = 0; i < a-1; i++) {
			yosum += yo[i];
			}
		switch ((yosum+b-1)%7) {
		case 1: {
			System.out.println("TUE");
			break;
		}
		case 2: {
			System.out.println("WED");
			break;
		}
		case 3: {
			System.out.println("THU");
			break;
		}
		case 4: {
			System.out.println("FRI");
			break;
		}
		case 5: {
			System.out.println("SAT");
			break;
		}
		case 6: {
			System.out.println("SUN");
			break;
		}
		case 0: {
			System.out.println("MON");
			break;
		}
		
		}
	}
}
