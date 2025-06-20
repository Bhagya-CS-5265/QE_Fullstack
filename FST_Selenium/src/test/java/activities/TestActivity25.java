package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		//open the browser or page
		driver.get(" https://training-support.net/webelements/popups");
		
		//to maximize the window size
		driver.manage().window().maximize();
		
		//Get the title of the page and print it to the console.
		System.out.println(driver.getTitle());
		
		//Find the button on the page and click it to launch the popup
		driver.findElement(By.id("launcher")).click();
		
		//Wait for the popup to appear and then enter the credentials:
		//username: admin
		//password: password
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
		//Click submit and print the message on the page after logging in.
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		for(String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			}
		System.out.println(driver.findElement(By.cssSelector("h2.mt-5")).getText());
		
		driver.quit();
		

	}

}
