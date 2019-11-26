package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert first number:");
		try {
			int a = scan.nextInt();
			System.out.println("Insert second number:");
			int b = scan.nextInt();
			scan.close();
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("ERROR divideByZero");
		} catch (InputMismatchException e) {
			System.out.println("ERROR Insert number");
		}

	}

}
