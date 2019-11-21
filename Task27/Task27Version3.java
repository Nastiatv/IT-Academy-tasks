package Task27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task27Version3 {

	public static void main(String[] args) {

		List<Integer> marksList = IntStream.range(0, 10).map(i -> i = (int) (Math.random() * 10 + 1))
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

		System.out.print(marksList);

		List<Integer> sotry = marksList.stream().distinct().collect(Collectors.toList());

		System.out.print("\n" + sotry);
	}
}