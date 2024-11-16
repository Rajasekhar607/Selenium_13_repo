package bikes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BajajTest {
	// class is modified in github
	@Test (groups ="smoke")
	public void demo() {
		Reporter.log("Bajaj class executed",true);
	}

}
