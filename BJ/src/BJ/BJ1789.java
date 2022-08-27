package BJ;

import java.util.Scanner;

public class BJ1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long aa = 1;
		long sum = 0;
		
		while (a>=sum) {
			
			sum+=aa;
			
			aa++;
		}
		System.out.println(aa-2);
	}

}
