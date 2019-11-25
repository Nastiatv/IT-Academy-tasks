package Task31;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task31 {

	public static void main(String[] args) throws IOException {

		String verse = "Number 1 ñ this is the sun.\r\n" + "Number 2 ñ this is my shoe.\r\n"
				+ "Number 3 ñ this is a tree.\r\n" + "Number 4 ñ cats at the door.\r\n"
				+ "Number 5 ñ I like this pie.\r\n" + "Number 6 ñ this is a stick.\r\n"
				+ "Number 7 ñ I see a raven.\r\n" + "Number 8 ñ take this plate.\r\n" + "Number 9 ñ I am fine.\r\n"
				+ "Number 10 ñ this is a pen.";

		FileWriter fileWriter = new FileWriter("D:\\ ”–—€ IT\\Numbers.txt");
		fileWriter.write(verse);
		fileWriter.close();

		FileReader fileReader = new FileReader("D:\\ ”–—€ IT\\Numbers.txt");
		Scanner scan = new Scanner(fileReader);
		String readVerse = null;
		while (scan.hasNextLine()) {
			readVerse = readVerse + scan.nextLine();
		}
		scan.close();

		List<Integer> numbers = new ArrayList<>();
		String[] arr = readVerse.split(" ");
		for (String word : arr) {
			if (Character.isDigit(word.charAt(0))) {
				int a=Integer.parseInt(word);
				numbers.add(a);
			}
				}
		System.out.print(numbers);
		
						System.out.print("Sum: " );
		
						
			
	}

	
	}	
	

