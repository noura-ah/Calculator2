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
		
		
		Calculator cal2 = new Calculator();
		cal2.performOperation(10);
		cal2.performOperation("-");
		cal2.performOperation(25);
		cal2.performOperation("/");
		cal2.performOperation(5);
		cal2.performOperation("*");
		cal2.performOperation(5);
		cal2.performOperation("=");
		result = cal2.getResults();
		if (result != null) {
			System.out.println(result);
		}
		
		Calculator cal3 = new Calculator();
		cal3.performOperation(10);
		cal3.performOperation("-");
		cal3.performOperation(25);
		cal3.performOperation("/");
		cal3.performOperation(5);
		cal3.performOperation("*");
		cal3.performOperation(0);
		cal3.performOperation("=");
		result = cal3.getResults();
		if (result != null) {
			System.out.println(result);
		}
		
		
	}
}
