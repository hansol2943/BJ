package BJ;

import java.time.LocalDate;

public class BJ16170 {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		System.out.println(a.getYear());
		System.out.println("0"+a.getMonthValue());
		System.out.println("0"+a.getDayOfMonth());

	}

}
