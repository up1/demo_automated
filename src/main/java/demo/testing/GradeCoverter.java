package demo.testing;

public class GradeCoverter {
	
	int a;
	int b=1;
	
	/**
	 * 
	 * @param score
	 * @return
	 */
	public String convert(int score) {
		if(score >=0 && score <= 100) {
			if( score >= 80 ) return "A";
			else if(score >= 70) return "B";
			else if(score >= 60) return "C";
			else if(score >= 50) return "D";
			return "C";
		} else {
			return "Unknown";
		}
	}

}
