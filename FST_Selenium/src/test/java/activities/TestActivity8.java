package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//initialize Action object
		Actions builder = new Actions(driver);
		
		//open the browser or page
		driver.get(" https://training-support.net/webelements/mouse-events");
		
		//to maximize the window size
		driver.manage().window().maximize();
		
		//Get the title of the page and print it to the console.
		System.out.println(driver.getTitle());
		
		//find all the buttons
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement srcFile = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetFile = driver.findElement(By.xpath("//h1[text()='target']"));
		
		//Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it. 
		builder.click(cargoLock).pause(500).click(cargoToml).build().perform();
		
		//Print the confirmation text at the end of the sequence.
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//Double click on the src button. Then right click on the target button and
		builder.doubleClick(srcFile).pause(500).contextClick(targetFile).perform();
		
		// select open. 
		builder.click(driver.findElement(By.cssSelector("span.ml-3"))).pause(500).build().perform();
		
		//Print the confirmation text at the end of the sequence.
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();

	}

}
