package function;

public class CalculatorOperations {

	public double n1;
	public double n2;

	public double Sum() {
		return n1 + n2;
	}

	public double Sub() {
		return n1 - n2;
	}

	public double Div() {
		return n1 / n2;
	}

	public double Mult() {
		return n1 * n2;
	}
	
	public String toString() {
		return "RESULT: "
			+ n1
			+ " + "
			+ n2
			+ " = "
			+ Sum();
	}
	
	public String toStringg() {
		return "RESULT: "
			+ n1
			+ " - "
			+ n2
			+ " = "
			+ Sub();
	}
	
	public String toStringgg() {
		return "RESULT: "
			+ n1
			+ " / "
			+ n2
			+ " = "
			+ Div();
	}
	
	public String toStringggg() {
		return "RESULT: "
			+ n1
			+ " * "
			+ n2
			+ " = "
			+ Mult();
	}

}
