import demo.grade.Login;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;

public class LoginTest {

    @Test public void
    login_success_with_user_somkiat_and_pin_1234() {
        Login login = new Login();
        boolean isLoggedin = login.checkUser("somkiat", "1234");
        assertTrue("Login should success", isLoggedin);
    }

}
