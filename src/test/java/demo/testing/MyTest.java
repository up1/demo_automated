package demo.testing;

import org.junit.runner.RunWith;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;

@RunWith(ZohhakRunner.class)
public class MyTest {

	@TestWith({ "User x, Password x", "User y, Password y", "User z, Password z" })
	public void loginWithData(String username, String password) {
		System.out.println("User name : " + username);
		System.out.println("Password : " + password);
	}

}