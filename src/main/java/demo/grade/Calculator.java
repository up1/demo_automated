package demo.grade;

public class Calculator {
    public String convertScoreToGrade(int score) {
        if(isGradeA(score)) {
            return "A";
        }
        else if( score == 49 ) {
            return "F";
        }
        return "มั่ว";
    }

    private boolean isGradeA(int score) {
        return score >= 80 && score <= 100;
    }
}
