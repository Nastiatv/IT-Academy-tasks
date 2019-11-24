package IODifferentVariants;

import java.io.FileOutputStream;
import java.io.IOException;

public class v1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("D:\\йспяш IT\\cat.txt",true);

		String cat = "I love my cat. It is warm and fat. My cat is grey. It likes to play. ";

		fileOutputStream.write(cat.getBytes());

		fileOutputStream.close();

	}

}
	
	
	

