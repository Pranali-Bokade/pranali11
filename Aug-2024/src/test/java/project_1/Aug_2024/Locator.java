package project_1.Aug_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get("https://www.flipkart.com/");
		 System.out.println(driver.getTitle());
		 
		 WebElement Searchbox = driver.findElement(By.cssSelector("input.Pke_EE"));
		 
		 Searchbox.click();
		 Searchbox.sendKeys("home decore");
		 System.out.println(Searchbox.getAttribute("value"));
		 Searchbox.click();
		 
		 
		 
		//driver.close();
		 
		 
		 
		 
		 

	}

}
