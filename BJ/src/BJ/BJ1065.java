package BJ;

import java.util.Scanner;

public class BJ1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dc = 0;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int h=(i/100)%10;
			int t=(i/10)%10;
			int o=i%10;
			if (i<100) {
				dc++;
			}
			if (i>=100 && i<1000) {
				if (t-o == h-t) {
					dc++;
				}
			}if (i==1000) {
				break;
			}
			
		}
		System.out.println(dc);
	}

}
