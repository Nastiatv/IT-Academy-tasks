package IODifferentVariants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class v2 {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("D:\\����� IT\\test.txt");

		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter, 200);
		
		String elephant = "����� ����! ����� �����,\r\n" + 
				"˸� � ������� �� �����.\r\n" + 
				"������ ����� ��� � �������,\r\n" + 
				"������ ���� �� ����� �����.\r\n" + 
				"������� ������ ����,\r\n" + 
				"�� ������� ���� ������.";

		bufferedWriter.write(elephant);
		bufferedWriter.close();
	}
	}



