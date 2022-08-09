package BJ;

import java.util.Scanner;

public class BJ4796 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (true) {
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			if (L==0&&P==0&&V==0) {
				break;
			}
			int ans = 0;
			if (V-((V/P)*P)>L) {
				ans=((V/P)*L)+L;
			}
			else {
				ans=((V/P)*L)+V%P;
			}

			System.out.println("Case"+" "+i+":"+" "+ans);
			i++;
			
		}


	}

}
