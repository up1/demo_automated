package demo.testing;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Duration;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.Repeat;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataDrivenTestRunner.class)
public class WithoutLoopTest {

	@Test
	@DataLoader(filePaths = { "data.csv" })
	@Repeat(times=500)
	@Duration(timeInMillis=1)
	public void testUseRepeat10Times(@Param(name="ID") int id,  @Param(name="Name") String name) throws Exception {
		System.out.println("Test=" + id);
	}
}
