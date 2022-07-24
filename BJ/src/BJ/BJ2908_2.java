package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class BJ2908_2 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer sc2 = new StringTokenizer(sc.readLine());
        //String문자열 뒤집기 StringBuffer,StringBuilder  의.reverse().tostring()메소드
		int A = Integer.parseInt(new StringBuilder(sc2.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(sc2.nextToken()).reverse().toString());
		//삼항연산자 A가 B보다 크면(A > B) ? A아니면B(A:B)
		System.out.print(A > B ? A:B);
		
	}
}