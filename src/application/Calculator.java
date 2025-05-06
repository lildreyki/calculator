package application;

import java.util.Locale;
import java.util.Scanner;

import function.CalculatorOperations;

public class Calculator {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CalculatorOperations calc = new CalculatorOperations();

		String stage = "open";
		while (!stage.equals("exit")) {
			System.out.print("Enter one number: ");
			calc.n1 = sc.nextDouble();
			System.out.print("Enter the operation: ");
			System.out.print("1 (+); 2 (-); 3 (/); 4 (*): ");
			int op = sc.nextInt();
			System.out.print("Enter another number: ");
			calc.n2 = sc.nextDouble();
			System.out.println();

			switch (op) {
			case 1:
				System.out.println(calc.toString());
				break;
			case 2:
				System.out.println(calc.toStringg());
				break;
			case 3:
				System.out.println(calc.toStringgg());
				break;
			case 4:
				System.out.println(calc.toStringggg());
				break;
			default:
				System.out.println("error");
			}

			System.out.println("Enter 'exit' to end calcultor or any characther to continue.");
			stage = sc.next();

		}
		System.out.println("Program ended.");

		sc.close();

	}

}
