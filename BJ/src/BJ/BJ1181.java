package BJ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BJ1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nn []= new String[n];
		for (int i = 0; i < n; i++) {
			nn[i] = sc.next();
		}
		Arrays.sort(nn);
		Arrays.sort(nn,Comparator.comparing(String::length));

		for (int i = 0; i < nn.length-1; i++) {
			if (nn[i].equals(nn[i+1])) {
				continue;
			}
			else {
				System.out.println(nn[i]);
			}
		}
		System.out.println(nn[nn.length-1]);
	}

}
