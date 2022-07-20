package calculator;

public class TestCalculator {
	public static void main(String [] args) {
		Calculator cal1 = new Calculator();
		cal1.setOperandOne(10.5);
		cal1.setOperandTwo(5.2);
		cal1.setOperation("+");
		System.out.println(cal1.getResults());
		
	}
}
