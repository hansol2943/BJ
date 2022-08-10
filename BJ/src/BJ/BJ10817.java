package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ10817 {

	public static void main(String[] args) {
		int ABC[] = new int [3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ABC.length; i++) {
			ABC[i]=sc.nextInt();
		}
		Arrays.sort(ABC);
		System.out.println(ABC[1]);
	}

}
