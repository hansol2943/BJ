package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2851{
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int a[] = new int [10];
		for (int i = 0; i < 10; i++) {
			a[i]=sc.nextInt();
		}
		for (int j = 0; j < 10; j++) {
			sum += a[j];
			
			if (Math.abs((sum-a[j])-100)<sum-100) {
				sum = sum-a[j];
				break;
			}
		}
		System.out.println(sum);
		
	}
}