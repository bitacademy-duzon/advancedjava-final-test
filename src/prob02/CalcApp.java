package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		
		new CalcApp().calculate(a, b, operation);
		
		
		
		
	}
	
	
	void calculate(int a, int b, String operator) {
		
		Arithmetic calculator = null;

		
		if("+".equals(operator)) {
			
			calculator = new Plus();
		}else if("-".equals(operator)) {
			
			calculator = new Min();

			
		}else if("*".equals(operator)) {
			calculator = new Mul();

			
		}else if("/".equals(operator)) {
			
			calculator = new Div();

		}
		
		int result = calculator.calculate(a, b);
		printResult(a,b,result, operator);
		
	}
	
	void printResult(int a, int b, int result, String operator) {
		
		System.out.printf("결과는.. %d %s %d = %d 입니다", a, operator, b, result);
		
	}
	
	
	
	
}

class Plus implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		
		return a+b;
	}
	
	
	
}

class Min implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		
		return a-b;
	}
	
	
	
}

class Div implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		
		return a/b;
	}
	
	
	
}


class Mul implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		
		return a*b;
	}
	
	
	
}
