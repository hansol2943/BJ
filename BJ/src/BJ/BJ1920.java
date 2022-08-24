package BJ;


import java.util.Scanner;

public class BJ1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int nn [] = new int [n]; 
		for (int i = 0; i < nn.length; i++) {
			nn[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int mm [] = new int [m]; 
		int mmk [] = new int [m];
		for (int i = 0; i < mm.length; i++) {
			mm[i] = sc.nextInt();
		}
		
		for (int i = 0; i < mm.length; i++) {
			for (int j = 0; j < nn.length; j++) {
				if (mm[i]==nn[j]) {
					mmk[i]=1;
				}
			}
		}
		for (int i = 0; i < mmk.length; i++) {
			sb.append(mmk[i]).append("\n");
			
		}
		System.out.println(sb);
	}

}
