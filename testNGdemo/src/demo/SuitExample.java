package demo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class SuitExample {
	private int startTime;
	private int endTime;
	@BeforeSuite
	public void launchBrower() {
		long startTime=System.currentTimeMillis();
		
System.setProperty("webdriver.Firefox.driver","C:\\Users\\globeitzone.lk\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");	
WebDriver driver = new FirefoxDriver();
	}
	@Test
	public void openGoogle(){
        driver.get("https://www.google.lk/");
	}
	
	@Test
	public void openBing() {	
	    driver.get("https://www.bing.com/");
}
		@Test
		public void openYahoo() {
		driver.get("https://www.yahoo.com/");   
		}
		
		@AfterSuite
        public void closeBrowser() {
	    driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken" + totalTime);

}
}
