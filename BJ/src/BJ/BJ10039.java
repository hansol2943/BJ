package BJ;

import java.util.Scanner;

public class BJ10039 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for (int i = 0; i < 5; i++) {
			int a=sc.nextInt();
			if (a<40) {
				a=40;
			}
				sum+=a;		
		}
		sum=sum/5;
		System.out.println(sum);
	}

}
