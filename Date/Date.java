package Date;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Date {

	public static String scanDate() {
		System.out.println("Insert year in yyyy:");
		Scanner scan = new Scanner(System.in);
		String year = scan.nextLine();
		System.out.println("Insert month in mm:");
		String month = scan.nextLine();
		System.out.println("Insert day in dd:");
		String day = scan.nextLine();
		String date = year + "\n" + month + "\n" + day;
		scan.close();
		return date;
	}

	public static void createTxt(String txt, String way) throws IOException {
		FileWriter fileWriter = new FileWriter(way);
		fileWriter.write(txt);
		fileWriter.close();
	}

	public static LocalDate getDate(String way) throws IOException {
		FileReader fileReader = new FileReader(way);
		Scanner scan = new Scanner(fileReader);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		scan.close();
		return date;
	}

	public static long countDaysFromTheBeginingOfTheYear(LocalDate date) {

		LocalDate start = LocalDate.of(date.getYear() - 1, Month.DECEMBER, 31);
		long daysTotal = ChronoUnit.DAYS.between(start, date);
		return daysTotal;

	}

	public static void isDayFromTheBeginingOfTheYearEven(long daysTotal) {
		System.out.print(daysTotal % 2 == 0 ? true : false);
	}

	public static void main(String[] args) throws IOException {

		createTxt(scanDate(), "D:\\����� IT\\date.txt");
		isDayFromTheBeginingOfTheYearEven(countDaysFromTheBeginingOfTheYear(getDate("D:\\����� IT\\date.txt")));

	}
}