package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize driver
				WebDriver driver = new FirefoxDriver();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				//initialize Action object
				Actions builder = new Actions(driver);
				
				//open the browser or page
				driver.get(" https://training-support.net/webelements/drag-drop");
				
				//to maximize the window size
				driver.manage().window().maximize();
				
				//Get the title of the page and print it to the console.
				System.out.println(driver.getTitle());
				
				//Find the ball and simulate a click and drag to move it into "Dropzone 1".
				WebElement ball = driver.findElement(By.id("ball"));
				WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
				builder.click(ball).dragAndDrop(ball, dropzone1).build().perform();
				
				//Verify that the ball has entered Dropzone 1.
				System.out.println(dropzone1.getText());
				
				//Once verified, move the ball into "Dropzone 2".
				WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
				builder.click(ball).dragAndDrop(ball, dropzone2).build().perform();
				
				//Verify that the ball has entered Dropzone 2.
				System.out.println(dropzone2.getText());
				
				driver.quit();
				

	}

}
