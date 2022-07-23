package calculator;

import java.util.ArrayList;

public class Calculator implements java.io.Serializable {
	
	private ArrayList<Double> Operand = new ArrayList<Double>();
	private ArrayList<String> Operation = new ArrayList<String>();
	

	public Calculator () {
	}
	
	public ArrayList<Double> getOperand() {
		return Operand;
	}


	public void setOperand(ArrayList<Double> Operand) {
		Operand = Operand;
	}


	public ArrayList<String> getOperation() {
		return Operation;
	}


	public void setOperation(ArrayList<String> operation) {
		Operation = operation;
	}
	

	// when passing an operand
	public void performOperation(double operand) {
		System.out.print(operand+" ");
		Operand.add(operand);
	}
	
	// when passing an operation
	public void performOperation(String operation) {
		System.out.print(operation+" ");
		Operation.add(operation);
	}
	
	public boolean performOperation() {
		
		// until empty
		while(Operation.size() > 0) {
			
			// Check Multiplication first 
			if (Operation.contains("*")) {
				
				// get index of operation and remove it from list
				int index =Operation.indexOf("*");
				Operation.remove("*");
				
				//get and remove First Operand
				double op1 = Operand.remove(index);
				// get and remove Second Operand, used index because we removed first operand 
				// so the second operand moved 
				double op2 = Operand.remove(index);
				
				// add result to the list in the same index
				Operand.add(index, op1*op2);
				
			}
			else if (Operation.contains("/")) {
				int index =Operation.indexOf("/");
				Operation.remove("/");
				
				double op1 = Operand.remove(index);
				double op2 = Operand.remove(index);
				
				
				double result = op1/op2;
				if (String.valueOf(result) == "Infinity") {
					System.out.println("Divided by zero operation cannot possible");
					return false;
				}
					
				else
					Operand.add(index, result);
			}
			
			else if (Operation.contains("+")) {
				
				int index =Operation.indexOf("+");
				Operation.remove("+");
				
				double op1 = Operand.remove(index);
				double op2 = Operand.remove(index);
				
				Operand.add(index, op1+op2);
				
			}
			else if (Operation.contains("-")) {
				int index =Operation.indexOf("-");
				Operation.remove("-");
				
				double op1 = Operand.remove(index);
				double op2 = Operand.remove(index);
				
				Operand.add(index, op1-op2);
				
			}
			else 
				Operation.remove("=");
		}
		return true;
	}
	
	public Double getResults() {
		
		return performOperation()? Operand.remove(0): null;
	}
}