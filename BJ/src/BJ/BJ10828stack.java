package BJ;

import java.util.Scanner;
import java.util.Stack;

public class BJ10828stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
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
					sb.append("-1").append(('\n'));
				}
				else {
					sb.append(st.pop()).append(('\n'));
				}
			}
			if (A.equals("size")) {
				sb.append(st.size()).append(('\n'));
			}
			if (A.equals("empty")) {
				if (st.size()==0) {
					sb.append("1").append(('\n'));
				}
				else {
					sb.append("0").append(('\n'));
				}
			}
			if (A.equals("top")) {
				if (st.size()==0) {
					sb.append("-1").append(('\n'));
				}
				else {
					sb.append(st.peek()).append(('\n'));
				}
			}
		}
		System.out.println(sb);
	}
}
