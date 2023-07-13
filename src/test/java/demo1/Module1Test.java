package demo1;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Module1Test {
	@Test
	public void test1() {
		Reporter.log("Checking jenkins");
		Reporter.log("working");
	}
	@Test
	public void test2() {
		Reporter.log("done");
	}

}
