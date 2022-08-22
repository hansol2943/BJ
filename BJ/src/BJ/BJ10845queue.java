package BJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BJ10845queue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		String num;
		Queue<String> qu = new LinkedList<>();
		String last=null;
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			if (a.equals("push")) {
				String b = sc.next();
				qu.add(b);
				last = b;
			}
			if (a.equals("pop")) {
				num=qu.poll();
				if (num==null) {
					sb.append("-1").append("\n");
				}
				else {
					sb.append(num).append("\n");
				}
			}
			if (a.equals("size")) {
				sb.append(qu.size()).append("\n");
			}
			if (a.equals("empty")) {
				if (qu.size()>=1) {
					sb.append("0").append("\n");
				}
				else {
					sb.append("1").append("\n");
				}
			}
			if (a.equals("front")) {
				if (qu.peek()==null) {
					sb.append("-1").append("\n");
				}
				else {
					sb.append(qu.peek()).append("\n");
				}
				
			}
			if (a.equals("back")) {
				if (qu.peek()==null) {
					sb.append("-1").append("\n");
				}
				else {
					sb.append(last).append("\n");
				}
			}
			
		}
		System.out.println(sb);
	}
}
