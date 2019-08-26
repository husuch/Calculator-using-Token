
public class Exponierer extends MathOp {

	public Exponierer() {

	}

	public void execOp(float value1, float value2) {

		if (value1 < 0 || value2 < 0) {

			if (value1 < 0) {
				value1 = Float.NaN;
			}

			else {
				value2 = Float.NaN;
			}
			
			
		}

		else if (value1 != 0 && value2 != 0) {
			result = (float) Math.pow(value1, value2);
			
		}

	}
}
