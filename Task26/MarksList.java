package Task26;

import java.util.ArrayList;

public class MarksList {

	public static void main(String[] args) {

ArrayList<Integer> marksList=new ArrayList<Integer>();

for(int i=0;i<10;i++) {
	int num=(int)(Math.random()*10+1);
	Integer in=new Integer(num);
	marksList.add(in);
	
}
		
for(int i=0;i<marksList.size();i++) {
	if(marksList.get(i)<7) {
	marksList.remove(i);
	}
	else {
	System.out.println(marksList.get(i)+ " ");
	}	
}
}
}

