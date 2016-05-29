package demo.grade;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class ConvertScoreToGradeTest {

    Calculator calculator = new Calculator();

    @Test public void
    calculate_score_from_80_to_grade_A() {
        String actualGrade = calculator.convertScoreToGrade(80);
        assertEquals("A", actualGrade);
    }

    @Test public void
    calculate_score_from_81_to_grade_A() {
        String actualGrade = calculator.convertScoreToGrade(81);
        assertEquals("A", actualGrade);
    }

    @Test @Ignore
    public void
    calculate_score_from_101_to_grade_มั่ว() {
        String actualGrade = calculator.convertScoreToGrade(101);
        assertEquals("มั่ว", actualGrade);
    }

    @Test public void
    calculate_score_from_49_to_grade_F() {
        String actualGrade = calculator.convertScoreToGrade(49);
        assertEquals("F", actualGrade);
    }

}
