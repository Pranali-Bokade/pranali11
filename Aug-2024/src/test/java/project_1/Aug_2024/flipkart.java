package project_1.Aug_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class flipkart extends Dynamic_code  {

	public static void main(String[] args) {
   launch_browser("chrome");
   
   hit_url("https://www.flipkart.com/");
   
  WebElement search_box = driver.findElement(By.cssSelector("input.Pke_EE"));
   
  search_box.click();
  search_box.sendKeys("books");
  driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")).click();
  
  JavascriptExecutor js = (JavascriptExecutor) driver;
 // js.executeScript()
  

	}

}
