package veeveDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	@BeforeClass
	public WebDriver init()
	{
		 driver = new ChromeDriver();

		String driverPath = System.getProperty("user.dir") + "//drivers//chromedriver.exe";
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver.get("http://www.nba.com/teams");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		 * 
		 * driver.findElement(By.linkText("Teams")).click(); WebElement teamLinkText =
		 * driver.findElement(By.linkText("Teams"));
		 * 
		 * Actions action = new Actions(driver);
		 * 
		 * // Performing the mouse hover action on the target element.
		 * action.moveToElement(teamLinkText).perform();
		 * 
		 * 
		 * //WebElement parent = //
		 * driver.findElement(By.xpath("//div[@class='NavDropdown_dropdown__HuIep']"));
		 * //String childXpath= "//figure[contains(text(),'teamName')])";
		 * 
		 * WebElement teamClick = driver.findElement(By.linkText("+text+"));
		 * teamClick.click();
		 * 
		 * 
		 * driver.findElement(By.linkText("Boston Celtics")).click();
		 * 
		 * driver.quit();
		 */
		
		return driver;
		

	}

}