package demo.grade;

public class CalculateGrade {
    public String คิดเกรด(int score) {
        if( score >= 80 ) {
            return "A";
        } else if( score <= 50 ) {
            return "F";
        }
        return "B";
    }
}
