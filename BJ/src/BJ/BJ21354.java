package BJ;

import java.util.Scanner;

public class BJ21354 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int aa=a*7;
		int bb=b*13;
		
		if (aa>bb) {
			System.out.println("Axel");
		}
		else if (aa<bb) {
			System.out.println("Petra");
		}
		else if (aa==bb) {
			System.out.println("lika");
		}
	}

}
