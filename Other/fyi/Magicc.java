package fyi;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Magicc {
	

		   public static void main(String[] args) throws IOException {

		       String greetings = "������! ���� ����� �����!\n� ������ Java �� ����� JavaRush.\n������� � ����� ������ �������������!\n";
		       byte[] bytes = greetings.getBytes();

		       InputStream inputStream = new ByteArrayInputStream(bytes);

		       System.setIn(inputStream);

		       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		       String str;

		       while ((str = reader.readLine())!= null) {

		           System.out.println(str);
		       }

		   }
}
