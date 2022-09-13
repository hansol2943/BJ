package BJ;

import java.util.Scanner;

public class BJ2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();

		int sum = (d/60)+m;
		int sum2 = d%60+s;
		
		if (sum2>=60) {
			sum=sum+(sum2/60);
			sum2=sum2%60;
		}
		
		if (sum>=60) {
			h=h+(sum/60);
			sum=sum%60;
		}

		if (h>=24) {
			h=0+h%24;
		}
		
		
		System.out.println(h+" "+sum+" "+sum2);
		

	}

}
