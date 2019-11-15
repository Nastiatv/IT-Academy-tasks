package Task27;
import java.util.ArrayList;
import java.util.Collections;

public class Task27 {

	public static void main(String[] args) {

List<Integer> marksList = new ArrayList<>();

			for (int i = 0; i < 10; i++) {
				marksList.add((int)(Math.random() * 10 + 1));
				System.out.print(marksList.get(i) + " ");
			}

System.out.println(" ");
Collections.sort(marksList, Collections.reverseOrder());

for(int i=0;i<marksList.size();i++) {
	System.out.print(marksList.get(i)+" ");
}
System.out.println(" ");


for(int i=marksList.size()-1;i!=0;i--) {
	if(i!=0) {
	if(marksList.get(i).equals(marksList.get(i-1))) {
		marksList.remove(i);
		continue;
	}
	System.out.print(marksList.get(i)+" ");
}
	}
System.out.print(marksList.get(0));
}}

	
	

