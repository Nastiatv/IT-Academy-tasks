package divideByZero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divideByZero {

	public static void main(String[] args) throws ArithmeticException, InputMismatchException {
		int a = 0;
		int b = 0;
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Insert first number:");
			a = scan.nextInt();
			System.out.println("Insert second number:");
			b = scan.nextInt();
			scan.close();
			try {
				System.out.println(a / b);
			} catch (ArithmeticException e) {
				System.out.println("ERROR divideByZero");
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROR Insert number");
		}

	}

}
