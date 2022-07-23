package calculator;

public class TestCalculator {
	public static void main(String [] args) {
		System.out.println ("Operands priority: *,/,+,-");
		Calculator cal1 = new Calculator();
		cal1.performOperation(10.5);
		cal1.performOperation("+");
		cal1.performOperation(5.2);
		cal1.performOperation("*");
		cal1.performOperation(10);
		cal1.performOperation("=");
		


		Double result = cal1.getResults();
		if (result != null) {
			System.out.println(result);
		}
		
		
		cal1.performOperation(10);
		cal1.performOperation("-");
		cal1.performOperation(25);
		cal1.performOperation("/");
		cal1.performOperation(5);
		cal1.performOperation("*");
		cal1.performOperation(5);
		cal1.performOperation("=");
		result = cal1.getResults();
		if (result != null) {
			System.out.println(result);
		}
		
		
		
		
		cal1.performOperation(10);
		cal1.performOperation("-");
		cal1.performOperation(25);
		cal1.performOperation("/");
		cal1.performOperation(5);
		cal1.performOperation("*");
		cal1.performOperation(0);
		cal1.performOperation("=");
		result = cal1.getResults();
		if (result != null) {
			System.out.println(result);
		}
		
		
	}
}
