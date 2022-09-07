package BJ;

import java.util.Scanner;

public class BJ1264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String n = sc.nextLine();
			//**next > nextline
			int cnt = 0;
			if (n.equals("#")) {
				break;
			}
			for (int i = 0; i < n.length(); i++) {
				if (n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u'
					||n.charAt(i)=='A'||n.charAt(i)=='E'||n.charAt(i)=='I'||n.charAt(i)=='O'||n.charAt(i)=='U') {
				cnt++;
				}
			}
		System.out.println(cnt);
		}


	}

}
