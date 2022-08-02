package BJ;

import java.util.Arrays;
import java.util.Scanner;

public class BJ4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int samgac[] = new int[3];
		while (true) {
			for (int i = 0; i < samgac.length; i++) {
				samgac[i]=sc.nextInt();
			}
			Arrays.sort(samgac);
			if (samgac[0]==0&&samgac[1]==0&&samgac[2]==0) break;
			
			if ((samgac[2]*samgac[2])==((samgac[0]*samgac[0])+(samgac[1]*samgac[1]))) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
	}

}
