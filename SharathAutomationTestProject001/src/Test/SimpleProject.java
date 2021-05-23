package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleProject {

WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		System.out.println("Execution started");
		System.setProperty("webdriver.chrome.driver", "..\\SharathAutomationTestProlect001\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void execute() throws InterruptedException {
		
	driver.get("https://www.google.com/");
	Thread.sleep(12000);
	
	}
	
	
	@AfterTest
	public void tearDown() {
		
	driver.quit();
	
	System.out.println("execution completed and test case passed");
}
	

}


