
public class Dividender extends MathOp{

	public Dividender() {
		
		
	}
	
	public void execOp(float value1, float value2) {
		if (value1 != 0 && value2 != 0) {
			
			result = value1 / value2;
			
		}
		
		else if (value1 == 0 || value2 == 0) {
			System.out.println("Dieser Wert kann nicht ausgerechnet werden");
			result = 0;
			
		}
		
	}
}
