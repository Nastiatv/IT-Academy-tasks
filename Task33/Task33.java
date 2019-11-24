package Task33;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Task33 {

	public static void main(String[] args) throws Exception {

		FileInputStream inputStream = new FileInputStream("D:\\ÊÓÐÑÛ IT\\ÑV Ðóòêåâè÷ Àíàñòàñèÿ.doc");
		FileOutputStream outputStream = new FileOutputStream("D:\\ÊÓÐÑÛ IT\\rezult.doc");

		byte[] buffer = new byte[1000];
		while (inputStream.available() > 0) {

			int count = inputStream.read(buffer);
			outputStream.write(buffer, 0, count);

		}
		inputStream.close();
		outputStream.close();

	}

}
