package Task27;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task27Version3 {

	public static void main(String[] args) {

		List<Integer> marksList = IntStream.range(0, 10)
				.map(i -> i = (int) (Math.random() * 10 + 1))
				 .collect(Collectors.toList());;

		/*
		 * for (int i = 0; i < 10; i++) { marksList.add((int) (Math.random() * 10 + 1));
		 * 
		 * } System.out.print(marksList + Space);
		 * 
		 * System.out.println(Space);
		 */

		List<Integer> sotry = marksList.stream().distinct().collect(Collectors.toList());

		System.out.print(sotry);
	}
}