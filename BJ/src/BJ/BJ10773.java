package BJ;

import java.util.Scanner;
import java.util.Stack;

public class BJ10773 {

	//pop  후입빼기
	//push 넣기
	//peek 맨위숫자
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < N; i++) {
			int stn=sc.nextInt();
			if (stn==0) {
				st.pop();
			}
			else {
				st.push(stn);
			}
		}
		int sum = 0 ;
		while (!st.empty()) {
			sum+=st.peek();
			st.pop();
			
		}
		System.out.println(sum);
	}

}
