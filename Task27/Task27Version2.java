package Task27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task27Version2 {

		public static void main(String[] args) {

	ArrayList<Integer> marksList=new ArrayList<Integer>();

	for(int i=0;i<10;i++) {
		int num=(int)(Math.random()*10+1);
		Integer in=new Integer(num);
		marksList.add(in);
		System.out.print(marksList.get(i)+" ");
		}

	System.out.println(" ");
Set x = new HashSet(Arrays.asList(marksList));
marksList.clear();
marksList.addAll(x);
for (Integer i: marksList) {
	System.out.print(marksList.get(i)+" ");
}

	
	
	
}}
