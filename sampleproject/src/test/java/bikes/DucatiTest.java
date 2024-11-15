package bikes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DucatiTest {
	@Test (groups ="smoke")
	public void demo() {
		Reporter.log("Ducati class executed",true);
	}

}
