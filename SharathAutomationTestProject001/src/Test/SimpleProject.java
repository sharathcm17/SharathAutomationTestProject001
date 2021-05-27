package Test;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.io.Files;


public class SimpleProject {

	WebDriver driver;


	@BeforeTest
	public void setup(){
		Reporter.log("Setting up the browser");
		System.setProperty("webdriver.chrome.driver", "..\\SharathAutomationTestProject001\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		Reporter.log("Setting up done");

	}

	@Test
	public void execute() throws InterruptedException, IOException {
		
		Reporter.log("Opening the link Google");
		driver.get("https://www.google.com/");
		Reporter.log("Link got Opened and waiting for 12 sec");
		Thread.sleep(12000);
		Reporter.log("Wait over");
			
			
		}

	


	@AfterTest
	public void tearDown() {

		Reporter.log("Quitting the browser");
		driver.quit();
		Reporter.log("browser window is closed now");
		
	}


}


