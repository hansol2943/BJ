package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc2 = new StringTokenizer(sc.readLine());
		/* 처음 쓴 것
		BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc2 = new StringTokenizer(sc.readLine());
		
		String A = sc2.nextToken();
		int aa = sc2.countTokens();
		System.out.println(sc2.countTokens());
		처음에 	A > sc2 > sc 로 하려 했었는데
		sc2 > sc 로 이미 받고 있는 상태에서 중복 값이되어서 런타임 에러 (NoSuchElement) 가 생김

		int aa = sc2.countTokens();
		바로 쓸 수 있는데 변수만듦 삭제
		*/
		System.out.println(sc2.countTokens());
	}
	
}
