package demo.grade;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ConvertScoreToGradeTest {

    @Test
    public void calculate_grade_A_with_score_80() {
        GradeCalculator g = new GradeCalculator();
        String actualGrade = g.convert(80);
        assertEquals("A", actualGrade);
    }

	
}
