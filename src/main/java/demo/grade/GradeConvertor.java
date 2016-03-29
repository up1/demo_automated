package demo.grade;

public class GradeConvertor {
    public String covert(int score) {
        if(score >= 80) {
            return "A";
        } else if(score == 0) {
            return "F";
        }
        return "B";
    }
}
