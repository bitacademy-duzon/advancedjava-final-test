package prob02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		boolean flag = true;
		do {
			try {
				System.out.print( "두 정수와 연산자를 입력하시오 >> " );
				
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				String operation = scanner.next();
				
				/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
				Arithmetic arith = null;
				int result = 0;
				switch (operation) {
				case "+":
					arith = new Add(a, b);
					result = arith.calculate(a, b);
					break;
				case "-":
					arith = new Sub(a, b);
					result = arith.calculate(a, b);
					break;
				case "*":
					arith = new Mul(a, b);
					result = arith.calculate(a, b);
					break;
				case "/":
					arith = new Div(a, b);
					result = arith.calculate(a, b);
					break;
				default:
					System.out.println("연산자가 부정확합니다. 다시 시도해보세요.");
					return;
				}
				System.out.println(result);
			} catch (InputMismatchException e) {
				System.out.println("warning: " + e);
				System.out.println("식이 정확하지 않습니다.");
			} finally {
				System.out.print("계속하시겠습니까? (y/n) ");
				scanner.nextLine();
				String reply = scanner.next();
				if (!reply.equals("y")) {
					flag = false;
				}
			}

		} while (flag);
	}
}
