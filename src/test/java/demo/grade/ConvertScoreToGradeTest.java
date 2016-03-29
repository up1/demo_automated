package demo.grade;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ConvertScoreToGradeTest {


    @Test
    public void should_get_grad_A_when_score_is_80() {
        GradeConvertor c = new GradeConvertor();
        String expectedGrade = "A";
        String actualGrade = c.covert(80);
        assertEquals(expectedGrade,actualGrade);
    }

    @Test
    public void should_get_grad_F_when_score_is_0() {
        GradeConvertor c = new GradeConvertor();
        String expectedGrade = "F";
        String actualGrade = c.covert(0);
        assertEquals(expectedGrade,actualGrade);
    }

    @Test
    public void should_get_grad_B_when_score_is_79() {
        GradeConvertor c = new GradeConvertor();
        String expectedGrade = "B";
        String actualGrade = c.covert(79);
        assertEquals(expectedGrade,actualGrade);
    }
	
}
