package BJ;

import java.util.Scanner;

public class BJ19698 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		int c = sc.nextInt();
		int d = sc.nextInt();
		int sum = (b/d)*(c/d);
		
		if (sum<=a) {
			System.out.println(sum);
		}
		else if (sum>a) {
			System.out.println(a);
		}

	}

}
