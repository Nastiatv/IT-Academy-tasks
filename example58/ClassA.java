package example58;

public class ClassA {
private class ClassB implements IntB
{
	int x=1;
	public int getX() {return x;}
}

void PrintData()
{
ClassB b=new ClassB();
System.out.println("inner"+b.x);
}
IntB getB() {return new ClassB();}

	
}
