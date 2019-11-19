package Task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {
	public static void main(String[] args) throws IOException {
		System.out.print("insert text:");
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String text =bufferedReader.readLine();
		text = text.replaceAll("[!@#$%^&*()<>?:';/.]", "").trim();
		String[] words = text.split(" ");

		Map<String, Integer> fd = new HashMap<>();
		{

			for (String word : words) {
				if (fd.containsKey(word)) {
					int val = fd.get(word);
					fd.remove(word);
					fd.put(word, val + 1);

				} else {
					fd.put(word, 1);
				}

			}
		}
		System.out.println(fd);

	}
}