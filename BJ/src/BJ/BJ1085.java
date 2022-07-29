package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ1085 {

	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc2 = new StringTokenizer(sc.readLine());
		int x = Integer.parseInt(sc2.nextToken());
		int y = Integer.parseInt(sc2.nextToken());
		int w = Integer.parseInt(sc2.nextToken());
		int h = Integer.parseInt(sc2.nextToken());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(x);
		list.add(y);
		list.add(w-x);
		list.add(h-y);
		
		int min = Collections.min(list);
		System.out.println(min);
		
	}

}
