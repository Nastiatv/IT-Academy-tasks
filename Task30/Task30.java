package Task30;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task30 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("D:\\йспяш IT\\Cat.txt");
		String Cat = "I love my cat.\r\n" + "It is warm and fat.\r\n" + "My cat is grey.\r\n" + "It likes to play.";
		fileOutputStream.write(Cat.getBytes());
		fileOutputStream.close();
		
		FileReader fileReader = new FileReader("D:\\йспяш IT\\Cat.txt");
		BufferedReader br = new BufferedReader(fileReader);
		String line = br.readLine();
		String text="";
		while (line != null) {
			text = text + line + " ";
			line = br.readLine();
		}
		System.out.println(text);
		br.close();
		String[] words = text.split(" ");
		int counterWords = (int) Arrays.stream(words).count();
		int counterDots = (int) Arrays.stream(words).filter(word -> word.contains(".")).count();
		System.out.println("counterWords: " + counterWords);
		System.out.println("counterDots: " + counterDots);
	}
}
