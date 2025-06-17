package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class TestActivity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize driver
		WebDriver driver = new FirefoxDriver();
		
		//open the browser or page
		driver.get(" https://training-support.net/webelements/target-practice");
		
		//page interactions
		//page the page title
		System.out.println(driver.getTitle());
		
		//Find the 3rd header on the page and print it's text to the console.
		String message = driver.findElement(By.xpath("//h3[contains(text(),'Heading #3')]")).getText();
		System.out.println(message);
		
		//Find the 5th header on the page and print it's color.
		Color headingColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(),'Heading #5')]")).getCssValue("color"));
		System.out.println(headingColor.asHex());
		
	
	
		//Find the purple button and print all it's classes.
		String classes = driver.findElement(By.className("bg-purple-200")).getAttribute("class");
		System.out.println("classes of purple button =" +classes);
		
		//Find the slate button and print it's text.
		String slate_text = driver.findElement(By.className("bg-slate-200")).getText();
		System.out.println("text of slate button =" +slate_text);
		
		driver.quit();
		

	}

}
