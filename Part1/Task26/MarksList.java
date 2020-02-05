package Task26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MarksList {

	public static void main(String[] args) {

		List<Integer> marksList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 10 + 1);
			Integer in = new Integer(num);
			marksList.add(in);

		}
		System.out.print(marksList + " ");

		Iterator<Integer> iterator = marksList.iterator();
		while (iterator.hasNext()) {
			Integer in = iterator.next();
			if (in <= 7) {
				iterator.remove();
			}
		}
		System.out.print("\n" + marksList);

	}
}