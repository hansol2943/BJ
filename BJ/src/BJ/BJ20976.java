package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ20976 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a [] = new int [3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		
		Arrays.sort(a);
		
		System.out.println(a[1]);
	}

}
