package BJ;

import java.util.Scanner;

public class BJ4589 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Gnomes:");
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (((a>b&&a>c)||(a<b&&a<c))&&((c>a&&c>b)||(c<a&&c<b))) {
				System.out.println("Ordered");
			}
			else {
				System.out.println("Unordered");
			}
		}

	}

}
