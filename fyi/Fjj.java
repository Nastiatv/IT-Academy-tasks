package fyi;

public class Fjj {
	{
		System.out.println("1");
	}
	Fjj()	{
		System.out.println("2");
	}
	static 	{
		System.out.println("3");
	}
	
	{
		System.out.println("4");
	}
	

	public static void main(String[] args) {
		new Fjj();
	}

}
