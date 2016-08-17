import demo.tennis.Grade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeTest {


    @Test
    public void gradeA(){
        String result = grade.convert(80);
        assertEquals("A",result);
    }

    Grade grade =new Grade();

    @Test
    public void gradeD(){
        String result = grade.convert(50);
        assertEquals("D",result);
    }



}
