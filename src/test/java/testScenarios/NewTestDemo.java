package testScenarios;

import org.testng.annotations.Test;

public class NewTestDemo {
	@Test(priority = 1)
	public void sonia1() {
		System.out.println("sonia1");
	}

	@Test(priority = 4)
	public void sonia2() {
		System.out.println("sonia2");
	}

	@Test(priority = 5)
	public void sonia3() {
		System.out.println("sonia3");
	}

	@Test(priority = 2)
	public void sonia4() {
		System.out.println("sonia4");
	}

	@Test(priority = 3)
	public void sonia5() {
		System.out.println("sonia5");
	}

}// Class end
