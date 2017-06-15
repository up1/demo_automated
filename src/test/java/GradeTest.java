import demo.grade.CalculateGrade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeTest {

    CalculateGrade calculateGrade =
            new CalculateGrade();

    @Test public void
    คำนวณเกรด_AA_ด้วยคะแนน80() {
        String actualGrade = calculateGrade.คิดเกรด(80);
        เปรียบเทียบ("AA", actualGrade);
    }

    @Test public void
    คำนวณเกรด_A_ด้วยคะแนน90() {
        String actualGrade = calculateGrade.คิดเกรด(90);
        เปรียบเทียบ("A", actualGrade);
    }

    @Test public void
    คำนวณเกรด_B_ด้วยคะแนน70() {
        String actualGrade = calculateGrade.คิดเกรด(70);
        เปรียบเทียบ("B", actualGrade);
    }

    @Test public void
    คำนวณเกรด_F_ด้วยคะแนน49() {
        String actualGrade = calculateGrade.คิดเกรด(49);
        เปรียบเทียบ("F", actualGrade);
    }

    private void เปรียบเทียบ(String expectedGrade, String actualGrade) {
        assertEquals(expectedGrade, actualGrade);
    }

}
