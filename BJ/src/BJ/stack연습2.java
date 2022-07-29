package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack연습2 {

	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> st = new Stack<String>();
		StringTokenizer sc2 = new StringTokenizer(sc.readLine());
		int N = Integer.parseInt(sc.readLine());
		for (int i = 0; i < N; i++) {
			String A = sc2.nextToken();
			if (A.equals("push")) {
				String B = sc2.nextToken();
				st.push(B);
				System.out.println();
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
			System.out.println();
		}
	}
}
