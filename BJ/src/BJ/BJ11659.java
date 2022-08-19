package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ11659 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		StringBuilder sc2 = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int ng[] = new int [n+1];
		//구간 i, j 사이의 합은 array[j]-array[i-1]과 같다.
		for (int i = 1; i <= n; i++) {
			ng[i] = ng[i-1]+Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < m; i++) {
			st=new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sc2.append(ng[b]-ng[a-1]).append("\n");
			
		}
		System.out.println(sc2);
	}
}
