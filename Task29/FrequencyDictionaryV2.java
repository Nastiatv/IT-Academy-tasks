package Task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// мама папа я вместе дружная семья
public class FrequencyDictionaryV2 {
	public static void main(String[] args) throws IOException {
		System.out.print("insert text:\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String text = reader.readLine();
		reader.close();
		String[] words = text.replaceAll("[!@#$%^&*()<>?:';/.]", "").trim().split(" ");
	
		Map<String, Object> map2 = Stream.of(text)
			    .collect(Collectors.toMap(
			        Function.identity(),
			        i -> (Stream.of(words).filter(x->x==i).count())
			    ));		
		System.out.println(map2);
	}}
		
	

	/*
	 * Map<String, Integer> fd = new HashMap<>(); {
	 * 
	 * for (String word : words) { if (fd.containsKey(word)) { int val =
	 * fd.get(word); fd.remove(word); fd.put(word, val + 1);
	 * 
	 * } else { fd.put(word, 1); }
	 * 
	 * } } System.out.println(fd);
	 */

