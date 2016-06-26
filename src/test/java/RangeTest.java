import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeTest {

    @Test public void
    แสดงผลลัพธ์กรณีก้ามปูเปิดและปิด() {
        Range range = new Range();
        String result = range.showResult("[1,5]");
        assertEquals("1,2,3,4,5", result);
    }

    @Test public void
    ตรวจสอบสัญลักษณ์ก้ามปูปิด() {
        Range range = new Range();
        boolean result = range.validateก้ามปูปิด("[1,5]");
        assertTrue("ไม่พบก้ามปูปิด", result);
    }

    @Test public void
    ตรวจสอบสัญลักษณ์วงเล็บปิด() {
        Range range = new Range();
        boolean result = range.validateก้ามปูปิด("[1,5)");
        assertFalse("ไม่พบวงเล็บปิด", result);
    }


    @Test public void
    ตรวจสอบสัญลักษณ์ก้ามปูเปิด() {
        Range range = new Range();
        boolean result = range.validateก้ามปูเปิด("[1,5]");
        assertTrue("ไม่พบก้ามปูเปิด", result);
    }

    @Test public void
    ตรวจสอบสัญลักษณวงเล็บเปิด() {
        Range range = new Range();
        boolean result = range.validateก้ามปูเปิด("(1,5]");
        assertFalse("ไม่พบวงเล็บเปิด", result);
    }

    @Test public void
    แสดงค่าเริ่มต้นของ_input_ที่เริ่มต้นด้วยก้ามปูเปิด() {
        Range range = new Range();
        int firstNumber = range.show("[1,5]");
        assertEquals(1, firstNumber);
    }

    @Test public void
    แสดงค่าเริ่มต้นของ_input_ที่เริ่มต้นด้วยวงเล็บเปิด() {
        Range range = new Range();
        int firstNumber = range.show("(1,5]");
        assertEquals(2, firstNumber);
    }


    @Test public void
    แสดงค่าสิ้นสุดของ_input_ที่ลงท้ายด้วยก้ามปูปิด() {
        Range range = new Range();
        int lastNumber = range.showLast("[1,5]");
        assertEquals(5, lastNumber);
    }

    @Test public void
    แสดงค่าสิ้นสุดของ_input_ที่ลงท้ายด้วยวงเล็บปิด() {
        Range range = new Range();
        int lastNumber = range.showLast("[1,5)");
        assertEquals(4, lastNumber);
    }

}
