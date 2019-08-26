//@Author Nicolas Hauser

public class Rechner {

	public static void main(String[] args) {
		
		String in;

		MathOp rechner = null;
		
		MyReader reader;
		reader = MyReader.getInstance();

		

		Tokenizer token;
		token = new Tokenizer();
		
		System.out.println("Geben Sie eine Grundoperation mit zwei Zahlen ein. Z.B. 5+2\n");
		in = reader.getString("Rechnung: \t");

		token.split(in);
		token.getOperation();
		
		
		

		
		if (token.getOperation() == '+') {
			rechner = new Addierer();
			rechner.execOp(token.getValue1(), token.getValue2());
			System.out.println("\n1. Zahl:\t" + token.getValue1());
			System.out.println("Operation ist:\t" + token.getOperation());
			System.out.println("2. Zahl:\t" + token.getValue2());
			
			rechner.printResult();
			
		}
		
		else if (token.getOperation() == '-') {
			rechner = new Subtrahierer();
			rechner.execOp(token.getValue1(), token.getValue2());
			System.out.println("\n1. Zahl:\t" + token.getValue1());
			System.out.println("Operation ist:\t" + token.getOperation());
			System.out.println("2. Zahl:\t" + token.getValue2());
			
			rechner.printResult();
			
		}
		
		else if (token.getOperation() == '*') {
			rechner = new Multiplizer();
			rechner.execOp(token.getValue1(), token.getValue2());
			System.out.println("\n1. Zahl:\t" + token.getValue1());
			System.out.println("Operation ist:\t" + token.getOperation());
			System.out.println("2. Zahl:\t" + token.getValue2());
			
			rechner.printResult();
			
		}
		
		else if (token.getOperation() == '/') {
			rechner = new Dividender();
			rechner.execOp(token.getValue1(), token.getValue2());
			System.out.println("\n1. Zahl:\t" + token.getValue1());
			System.out.println("Operation ist:\t" + token.getOperation());
			System.out.println("2. Zahl:\t" + token.getValue2());
			
			rechner.printResult();
			
		}
		
		else if (token.getOperation() == '^') {
			rechner = new Exponierer();
			rechner.execOp(token.getValue1(), token.getValue2());
			System.out.println("\n1. Zahl:\t" + token.getValue1());
			System.out.println("Operation ist:\t" + token.getOperation());
			System.out.println("2. Zahl:\t" + token.getValue2());
			
			rechner.printResult();
			
			
		}
		
		else {
			
			System.out.println("\nUngültige Operation");
		}
		

	}

}
