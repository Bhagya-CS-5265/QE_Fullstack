package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity23 {

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
		
		//Find the button to open a new tab and click it.
		driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
		
		//Wait for the new tab to open. Once it opens, print all the handles.
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(driver.getWindowHandles());
		
		//Switch to the newly opened tab, print the new tab's title and message
		for(String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		System.out.println(driver.findElement(By.cssSelector("h2.mt-5")).getText());
		
		//Repeat the steps by clicking the button in the new tab page.
		driver.findElement(By.xpath("//button[text()='Open Another One']")).click();
		
		//Wait for the new tab to open. Once it opens, print all the handles.
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println(driver.getWindowHandles());
		
		//Switch to the newly opened tab, print the new tab's title and message
		for(String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			}
		System.out.println(driver.findElement(By.cssSelector("h2.mt-5")).getText());
		
		
		driver.quit();

	}

}
