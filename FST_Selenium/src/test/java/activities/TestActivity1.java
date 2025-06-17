package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestActivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize driver
		WebDriver driver = new EdgeDriver();
		
		//open the browser or page
		driver.get("https://training-support.net/");
		
		//page interactions
		//page the page title
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.quit();


	}

}
