package Task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MarksList {

	private static final String Space = " ";

	public static void main(String[] args) {

		List<Integer> marksList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			marksList.add((int) (Math.random() * 10 + 1));
			System.out.print(marksList.get(i) + Space);

		}
		System.out.println(Space);

		Iterator<Integer> iterator = marksList.iterator();
		int max = 0;
		while (iterator.hasNext()) {
			Integer in = iterator.next();
			if (max < in) {
				max = in;
			}
		}

		System.out.println(max);

	}
}