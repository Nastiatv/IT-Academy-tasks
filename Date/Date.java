package Date;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Date {

	public static void main(String[] args) {

		System.out.println("Insert year in yyyy:");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		System.out.println("Insert month in mm:");
		int month = scan.nextInt();
		System.out.println("Insert day in dd:");
		int day = scan.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		LocalDate start = LocalDate.of(year - 1, Month.DECEMBER, 31);

		long daysTotal = ChronoUnit.DAYS.between(start, date);
		System.out.println("days total: " + daysTotal);
		if (daysTotal % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		scan.close();

	}
}