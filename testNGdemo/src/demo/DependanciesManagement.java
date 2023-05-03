package demo;

import org.testng.annotations.Test;

public class DependanciesManagement {
	@Test(enabled=true)
public void highSchool() {
	System.out.println("High school");
}
	@Test(dependsOnMethods= "highSchool")
	public void higherSecondary() {
		System.out.println("High Sec school");
	}
	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("college");
	}
}
