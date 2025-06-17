package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize driver
				WebDriver driver = new FirefoxDriver();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				//initialize Action object
				Actions builder = new Actions(driver);
				
				//open the browser or page
				driver.get(" https://training-support.net/webelements/keyboard-events");
				
				//to maximize the window size
				driver.manage().window().maximize();
				
				//Get the title of the page and print it to the console.
				System.out.println(driver.getTitle());
				
				//On the page, type out a string from the Selenium script to show on the page
				builder.sendKeys("hii i am bhagya").build().perform();
				
				//Print the message to the console.
				System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
				
				driver.quit();
				

	}

}
