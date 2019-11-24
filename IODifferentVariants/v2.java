package IODifferentVariants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class v2 {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("D:\\КУРСЫ IT\\test.txt");

		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter, 200);
		
		String elephant = "Спать пора! Уснул бычок,\r\n" + 
				"Лёг в коробку на бочок.\r\n" + 
				"Сонный мишка лег в кровать,\r\n" + 
				"Только слон не хочет спать.\r\n" + 
				"Головой качает слон,\r\n" + 
				"Он слонихе шлет поклон.";

		bufferedWriter.write(elephant);
		bufferedWriter.close();
	}
	}



