package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//open the browser or page
		driver.get(" https://training-support.net/webelements/login-form/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to maximize the window size
		driver.manage().window().maximize();
		
		//page interactions
		//page the page title
		System.out.println(driver.getTitle());
		
		//find the username and password fields
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
		//find the submit button and click on it
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
		//find the success message
		String message = driver.findElement(By.tagName("h1")).getText();
		System.out.println(message.equals("Login Success!"));
		
		
		//close the browser
		//driver.quit();


	}

}
