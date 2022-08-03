package BJ;

import java.util.Scanner;

public class BJ1259다시하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String N =sc.next();
			char I[] = new char [N.length()];
			int a=(N.length()/2);
			int cnt = 0 ;
			if (0==N.length()%2) {
				if (N.charAt(1)==N.charAt(0)) {
					System.out.println("yes");
				}
				else System.out.println("no");
			}
			else if (1==N.length()%2) {
				for (int i = 0; i < N.length(); i++) {
					I[i]=N.charAt(i);
				}
				if (N.length()==1&&I[0]=='0') {
					break;
				}
				else if (N.length()==1&&I[0]!='0') {
					System.out.println("yes");
				}
				else if (N.length()==3) {
					if (I[0]==I[2]) {
						System.out.println("yes");
					}
					else {
						System.out.println("no");
					}
				}
				else {
					for (int j = 0; j < a-1; j++) {
						if(I[j]==I[(N.length()-1)-j]) {
							cnt++;
						}
						else {
							System.out.println("no");
						}
					}
					if (cnt!=0) {
						System.out.println("yes");
					}
				}
			}
		}
	}
}