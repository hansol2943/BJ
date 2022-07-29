package BJ;

import java.util.Scanner;
import java.util.Stack;

public class stack연습1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<String> st = new Stack<String>();
		for (int i = 0; i < N; i++) {
			String A = sc.next();
			if (A.equals("push")) {
				String B = sc.next();
				st.push(B);
			}
			if (A.equals("pop")) {
				if (st.size()==0) {
					System.out.println("-1");
				}
				else {
					System.out.println(st.pop());
				}
			}
			if (A.equals("size")) {
				System.out.println(st.size());
			}
			if (A.equals("empty")) {
				if (st.size()==0) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			if (A.equals("top")) {
				if (st.size()==0) {
					System.out.println("-1");
				}
				else {
					System.out.println(st.peek());
				}
			}
		}
	}
}
