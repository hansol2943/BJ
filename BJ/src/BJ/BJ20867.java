package BJ;

import java.util.Scanner;

import javax.swing.plaf.IconUIResource;

public class BJ20867 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int s = sc.nextInt();
		int g = sc.nextInt();
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		double G = (1/a)*l + m/g;
		double bzr = (1/b)*r + m/s;
		
		if (G>bzr) {
			System.out.println("latmask");
		}
		else {
			System.out.println("friskus");
		}
	}

}
