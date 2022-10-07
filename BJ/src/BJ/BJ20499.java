package BJ;

import java.util.Scanner;

public class BJ20499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b[] = a.split("/");
		String a1=b[0];
		String a2=b[1];
		String a3=b[2];
		
		if (Integer.valueOf(a1)+Integer.valueOf(a3)<Integer.valueOf(a2) || a2.equals("0") ) {
			System.out.println("hasu");
		}
		else {
			System.out.println("gosu");
		}
	}

}
