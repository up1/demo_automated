package demo.testing;

public class Grade {

	public String calculate(int score) {
		if (score >= 0 && score <= 100) {
			if (score >= 80) {
				return "A";
			} else if (score >= 70) {
				return "B";
			} else if (score >= 60) {
				return "C";
			} else if (score >= 50) {
				return "D";
			} else {
				return "F";
			}
		}
		return "Unknown";
	}

}
