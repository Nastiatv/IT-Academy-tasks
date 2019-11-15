package Task27;

import java.util.ArrayList;
import java.util.Collections;

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
	Collections.sort(marksList, Collections.reverseOrder());

	for(int i=0;i<marksList.size();i++) {
		System.out.print(marksList.get(i)+" ");
	}
	System.out.println(" ");
	
	
	
	
	
}
