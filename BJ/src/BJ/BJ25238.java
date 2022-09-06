package BJ;

import java.util.Scanner;

public class BJ25238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double bl = a-(a*(b*0.01));
		if (bl>=100) {
			System.out.println("0");
		}
		else {
			System.out.println("1");
		}
	}

}
