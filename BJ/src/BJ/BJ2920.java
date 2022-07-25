package BJ;

import java.util.Scanner;

public class BJ2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int as[] = {1,2,3,4,5,6,7,8};
		int de[] = {8,7,6,5,4,3,2,1};
		int N[] = new int [8];
		int a = 0;
		int d = 0;
		for (int i = 0; i < 8; i++) {
			N[i]=sc.nextInt();
		}
		
		for (int i = 0; i < 8; i++) {
			if (as[i]==N[i]) {
				a++;
			}
			if (de[i]==N[i]) {
				d++;
			}
		}
		
		if (a==8 || d==8) {
			if (N[0]==1) {
				System.out.println("ascending");
			}
			else {
				System.out.println("descending");
			}
		}
		else {
			System.out.println("mixed");
		}

	}

}
