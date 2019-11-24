package IODifferentVariants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class v2 {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("D:\\йспяш IT\\cat.txt");

		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter, 200);
		
		String cat = "I love my cat. It is warm and fat. My cat is grey. It likes to play. ";

		bufferedWriter.write(cat);
		bufferedWriter.close();
	}
	}



