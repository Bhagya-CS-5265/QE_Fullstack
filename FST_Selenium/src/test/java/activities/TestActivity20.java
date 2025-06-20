package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize driver
				WebDriver driver = new FirefoxDriver();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				//initialize Action object
				Actions builder = new Actions(driver);
				
				//open the browser or page
				driver.get("https://training-support.net/webelements/alerts");
				
				//to maximize the window size
				driver.manage().window().maximize();
				
				//Get the title of the page and print it to the console.
				System.out.println(driver.getTitle());
				
				//Find the button to open a SIMPLE alert and click it
				driver.findElement(By.id("simple")).click();
				
				//Switch the focus from the main window to the Alert box and get the text in it and print it.
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				
				//Close the alert once with OK.
				alert.accept();
				System.out.println(driver.findElement(By.id("result")).getText());
				
				driver.quit();
				
				

	}

}
