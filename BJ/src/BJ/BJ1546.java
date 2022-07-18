package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1546 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader sc =new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(sc.readLine());
		int aa[]=new int [N];
		double newwt = 0;
		double aver = 0;
		StringTokenizer st=new StringTokenizer(sc.readLine());
		for (int i = 0; i < N; i++) {
			aa[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.sort(aa);
		for (int i = 0; i < aa.length; i++) {
			newwt+=(1.0*aa[i]/aa[aa.length-1])*100;
			
		}
		aver=newwt/N;
		System.out.println(aver);
	}

}
