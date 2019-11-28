package Task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Task27Version2 {

	public static void main(String[] args) {

		List<Integer> marksList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			marksList.add((int) (Math.random() * 10 + 1));
			System.out.print(marksList.get(i) + " ");
		}

		System.out.println(" ");
		
		Set <Integer> set = new HashSet<>(marksList);
		marksList.clear();
		marksList.addAll(set);

		Iterator<Integer> iter = marksList.iterator();
		while (iter.hasNext()) {
			Integer in = iter.next();
			System.out.print(in + " ");
		}

	}
}