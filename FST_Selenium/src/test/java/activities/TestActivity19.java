package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//initialize Action object
		Actions builder = new Actions(driver);
		
		//open the browser or page
		driver.get("  https://training-support.net/webelements/selects");
		
		//to maximize the window size
		driver.manage().window().maximize();
		
		//Get the title of the page and print it to the console.
		System.out.println(driver.getTitle());
		
		
		WebElement dropdown = driver.findElement(By.cssSelector("select.h-80"));
		Select multilist = new Select(dropdown);
		
		//Select the "HTML" option using the visible text.
		multilist.selectByVisibleText("HTML");
		
		//Select the 4th, 5th and 6th options using the index.
		for(int i=3; i<5; i++) {
			multilist.selectByIndex(i);
		}
		
		//Select the "Node" option using the value
		multilist.selectByValue("nodejs");
		
		//deselect the 5th option using index
		multilist.deselectByIndex(4);
		
		//print the selected options
		for(WebElement option : multilist.getAllSelectedOptions()) {
			System.out.println(option.getText());
		}
		
		
		driver.quit();

	}

}
