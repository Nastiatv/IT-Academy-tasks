package Task28;

import java.util.ArrayList;
import java.util.Iterator;

public class MarksList {


	public static void main(String[] args) {

ArrayList<Integer> marksList=new ArrayList<Integer>();

for(int i=0;i<10;i++) {
	int num=(int)(Math.random()*10+1);
	Integer in=new Integer(num);
	marksList.add(in);
	System.out.print(marksList.get(i)+" ");
	
}System.out.println(" ");

Iterator <Integer> iterator=marksList.iterator();
int max=0;
while(iterator.hasNext()) {
Integer in=iterator.next();
if(max<in) {max=in;}
}

System.out.println(max);

}}