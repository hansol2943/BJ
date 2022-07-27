package BJ;

import java.util.Scanner;

public class BJ10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ap[]= new int [26];
		for (int i = 0; i < ap.length; i++) {
			ap[i] = -1;
		}
		
		for (int i = 0; i < S.length(); i++) {
			char Ss = S.charAt(i);
			if (ap[Ss-'a']==-1) {
				ap[Ss- 'a'] = i;
			}
			
		}
		
		for (int i = 0; i < ap.length; i++) {
			System.out.print(ap[i]+ " ");
		}
		
		
	}
}
