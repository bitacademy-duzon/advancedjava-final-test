package prob02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();

		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		new CalcApp().calculate(a, b, operation);
	}

	private void calculate(int a, int b, String operation) {
		boolean flag = true;
		Arithmetic arith = null;

		switch (operation) {
		case "+":
			arith = new Add(a, b);
			break;
		case "-":
			arith = new Sub(a, b);
			break;
		case "*":
			arith = new Mul(a, b);
			break;
		case "/":
			arith = new Div(a, b);
			break;
		default:
			System.out.println("연산자가 부정확합니다. 다시 시도해보세요.");
			return;
		}
		int result = arith.calculate(a, b);
		printOperation(result);
	}

	private void printOperation(int result) {
		System.out.println(result);
	}
}
