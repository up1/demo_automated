package demo.tennis;

public class Grade {

    public static final String A = "A";
    public static final String D = "D";

    public String convert(int score) {
        if (score >= 80) {
            return A;
        }
        return D;
    }
}
