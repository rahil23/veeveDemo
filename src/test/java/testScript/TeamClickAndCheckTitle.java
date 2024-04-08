package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.TeamPOM;
import Utility.SwitchWindow;
import veeveDemo.BaseTest;

public class TeamClickAndCheckTitle extends BaseTest {
	
	
	public static void main(String[] args) {
		WebDriver driver;
		BaseTest test = new BaseTest();
		driver=test.init();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Boston Celtics')]//parent::div//div[1]/a[4]")).click();
		

		
		  String mainwindow = driver.getWindowHandle(); 
		  SwitchWindow sw = new SwitchWindow(); 
		  sw.switchChildWindow(driver, mainwindow);
		 System.out.println(driver.getTitle());
		  sw.switchParent(driver, mainwindow);
		 
		
	
			  TeamPOM obj = new TeamPOM(driver); 
			  obj.acceptPage();
			  obj.hoverCLickTeam("Boston Celtics",driver);
			  
			  String getTitle = driver.getTitle();
			  System.out.println(getTitle);
			 
		driver.quit();
		
		
	}
	
	
	
	

}
