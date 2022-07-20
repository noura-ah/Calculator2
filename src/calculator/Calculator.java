package calculator;

public class Calculator implements java.io.Serializable {
	private double OperandOne;
	private double OperandTwo;
	private String Operation;
	
	public Calculator () {}
	
	
	public double getOperandOne() {
		return OperandOne;
	}


	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}


	public double getOperandTwo() {
		return OperandTwo;
	}


	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}


	public String getOperation() {
		return Operation;
	}


	public void setOperation(String operation) {
		Operation = operation;
	}


	public double performOperation() {
		return (Operation=="+")? OperandOne+OperandTwo: OperandOne-OperandTwo;
	}
	public double getResults() {
		return performOperation();
	}
}
