package fyi;

public class Four {
	{
		System.out.println("1");
	}
	Four()	{
		System.out.println("2");
	}
	static 	{
		System.out.println("3");
	}
	
	{
		System.out.println("4");
	}
	

	public static void main(String[] args) {
		new Four();
	}

}
