package bikes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BajajTest {
	@Test (groups ="smoke")
	public void demo() {
		Reporter.log("Bajaj class executed",true);
	}

}
