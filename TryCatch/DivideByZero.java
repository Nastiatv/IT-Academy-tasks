package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) throws ArithmeticException, InputMismatchException {
		int a = 0;
		int b = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert first number:");
		try {
			a = scan.nextInt();
			System.out.println("Insert second number:");
			b = scan.nextInt();
			scan.close();
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("ERROR divideByZero");
		} catch (InputMismatchException e) {
			System.out.println("ERROR Insert number");
		}

	}

}
