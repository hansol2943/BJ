package BJ;

import java.util.Scanner;

public class BJ4583 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String n = sc.next();
			if (n.charAt(0)=='#') {
				break;
			}
			int ck = 0;
			StringBuffer sb = new StringBuffer(n);
			String ren = sb.reverse().toString();
			char a [] = new char[n.length()];
				for (int i = 0; i < n.length(); i++) {
					a[i]=ren.charAt(i);
					if (a[i]=='o') {
						a[i]='o';
					}
					else if (a[i]=='w') {
						a[i]='w';
					}
					else if (a[i]=='x') {
						a[i]='x';
					}
					else if (a[i]=='i') {
						a[i]='i';
					}
					else if (a[i]=='d') {
						a[i]='b';
					}
					else if (a[i]=='b') {
						a[i]='d';
					}

					else if (a[i]=='v') {
						a[i]='v';
					}
					else if (a[i]=='q') {
						a[i]='p';
					}
					else if (a[i]=='p') {
						a[i]='q';
					}
		
					
					else {
						ck=1;
					}
			}
				if (ck==1) {
					System.out.println("INVALID");
				}
				else {
					for (int i = 0; i < a.length; i++) {
						System.out.print(a[i]);
					}
					System.out.println();		
				}			
		}
	}
}