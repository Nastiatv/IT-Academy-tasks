package Task30;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task30 {

	private static void createTxt(String way, String verse) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(way);
		fileOutputStream.write(verse.getBytes());
		fileOutputStream.close();
	}

	private static String getTxt(String way) throws IOException {
		FileReader fileReader = new FileReader(way);
		BufferedReader br = new BufferedReader(fileReader);
		String line = br.readLine();
		String text = "";
		while (line != null) {
			text = text + line + " ";
			line = br.readLine();
		}
		br.close();
		return text;
	}

	private static int counterWords(String txt) {
		String[] words = txt.split(" ");
		int counterWords = (int) Arrays.stream(words).count();
		return counterWords;
	}

	private static int counterDots(String txt) {
		String[] words = txt.split(" ");
		int counterDots = (int) Arrays.stream(words).filter(word -> word.contains(".")).count();
		return counterDots;
	}

	public static void main(String[] args) throws IOException {

		String way = "D:\\courses IT\\Cat.txt";
		String Cat = "I love my cat.\r\n" + "It is warm and fat.\r\n" + "My cat is grey.\r\n" + "It likes to play.";
		createTxt(way, Cat);
		System.out.println(getTxt(way));
		System.out.println("counterWords: " + counterWords(getTxt(way)));
		System.out.println("counterDots: " + counterDots(getTxt(way)));
	}
}
