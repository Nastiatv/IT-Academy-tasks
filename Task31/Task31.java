package Task31;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task31 {
	static List<Integer> numbers = new ArrayList<>();

	public static void createTxt(String txt, String way) throws IOException {
		FileWriter fileWriter = new FileWriter(way);
		fileWriter.write(txt);
		fileWriter.close();
	}

	public static String getTxt(String way) throws FileNotFoundException {
		FileReader fileReader = new FileReader(way);
		Scanner scan = new Scanner(fileReader);
		String readVerse = "";
		while (scan.hasNextLine()) {
			readVerse = readVerse + scan.nextLine();
		}
		scan.close();
		return readVerse;
	}

	public static void readIntInTxt(String way, String readVerse) throws FileNotFoundException {
		getTxt(way);
		String[] arr = readVerse.split(" ");
		for (String word : arr) {
			if (Character.isDigit(word.charAt(0))) {
				int a = Integer.parseInt(word);
				numbers.add(a);
			}
		}
		System.out.print("List: " + numbers);
	}

	public static void countSumOfListNum(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.print("\nSum: " + sum);
	}

	public static void printDistinctList(List<Integer> numbers) {
		List<Integer> sotry = numbers.stream().distinct().collect(Collectors.toList());
		System.out.print("\nDistinct: " + sotry);
	}

	public static void main(String[] args) throws IOException {

		String verse = "1 2 3 4 5 1 2 3 4 1 2 3 9 0 text with Int";
		String way = "D:\\йспяш IT\\Numbers.txt";
		createTxt(verse, way);

		try {
			readIntInTxt(way, getTxt(way));
		} catch (FileNotFoundException e) {
			System.out.println("File no Found");
		}
		countSumOfListNum(numbers);
		printDistinctList(numbers);
	}

}
