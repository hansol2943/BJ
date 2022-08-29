package BJ;

import java.util.Scanner;

public class BJ1236 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char map [] [] = new char [a][b];
		
		for (int i = 0; i < a; i++) {
			String map1=sc.next();
			for (int j = 0; j < b; j++) {
				map[i][j]=map1.charAt(j);
			}
		}
		
		int hang = 0;
		int hck = 0;
		for (int i = 0; i < a; i++) {
			hck=0;
			for (int j = 0; j < b; j++) {
				if (map[i][j]=='X') {
					hck = 1;
					if (hck==1) {
						hang++;
						break;
					}
					
				}
			}

		}
		
		int yeol = 0;
		int yck = 0;
		for (int i = 0; i < b; i++) {
			yck=0;
			for (int j = 0; j < a; j++) {
				if (map[j][i]=='X') {
					yck = 1;
					if (yck==1) {
						yeol++;
						break;
					}
				
				}
			}

		}
		if (a-hang > b-yeol) {
			System.out.println(a-hang);
		}
		
		if (a-hang < b-yeol) {
			System.out.println(b-yeol);
		}
		
		if (a-hang == b-yeol) {
			System.out.println(b-yeol);
		}
		
	}

}
