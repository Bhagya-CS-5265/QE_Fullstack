package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize driver
				WebDriver driver = new FirefoxDriver();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
				//open the browser or page
				driver.get(" https://training-support.net/webelements/tabs");
				
				//to maximize the window size
				driver.manage().window().maximize();
				
				//Get the title of the page and print it to the console.
				System.out.println(driver.getTitle());
				
				//find and click the open a new tab button
				driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
				
				//check the message on the new tab
				for(String handle : driver.getWindowHandles()) {
					driver.switchTo().window(handle);
					}
				System.out.println(driver.findElement(By.cssSelector("h2.mt-5")).getText());
				
				//if the message is "release" you can end the test
				while(true) {
					for(String handle : driver.getWindowHandles()) {
						driver.switchTo().window(handle);
						}
					String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.mt-5"))).getText();
					if(message.contains("release")) {
						System.out.println("message is correct");
						break;
						
					}else {
						System.err.println("message is incorrect");
						driver.findElement(By.xpath("//button[text()='Open Another One']")).click();
					}
					
				}
				
				driver.quit();
				
				
	}
}
