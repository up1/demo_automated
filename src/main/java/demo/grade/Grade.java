package demo.grade;

public class Grade {

	public String convert(int score) {
		String grade = "A";
		if(score == 79)
			grade = "B";
		else if(score == 69)
			grade = "C";
		return grade;
	}

}
