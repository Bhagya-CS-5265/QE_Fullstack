package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize driver
				WebDriver driver = new FirefoxDriver();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				//initialize Action object
				Actions builder = new Actions(driver);
				
				//open the browser or page
				driver.get(" https://training-support.net/webelements/selects");
				
				//to maximize the window size
				driver.manage().window().maximize();
				
				//Get the title of the page and print it to the console.
				System.out.println(driver.getTitle());
				
				WebElement dropdown = driver.findElement(By.xpath("//Select"));
				Select list = new Select(dropdown);
				
				//Select the second option using the visible text.
				list.selectByVisibleText("One");
				System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You have selected:')]")).getText());
				
				//Select the third option using the index.
				list.selectByIndex(2);
				System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You have selected:')]")).getText());
				
				//System.out.println(list.getText());
				
				//Select the fourth option using the value.
				list.selectByValue("three");
				System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You have selected:')]")).getText());
				
				//System.out.println(list.getText());
				
				//Get all the options and print them to the console.
				List<WebElement> options = list.getOptions();
				
				for(WebElement option: options) {
					System.out.println(option.getText());
				}
				
				
				driver.quit();
				
				
				
				

	}

}
