package project_1.Aug_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_lunch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
	//	WebDriver driver1 = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("nav-top"));
		/*driver.findElement(By.className("\"skip-link\""));
		driver.findElement(By.tagName("select"));
		driver.findElement(By.linkText("Best Sellers"));
		driver.findElement(By.partialLinkText("Customer Service"));
		//css(tagname and id)
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		//css(tagname and class)
		driver.findElement(By.cssSelector(" div.nav-search-field "));*/
		driver.findElement(By.xpath("//a[@data-csa-c-content-id= \"nav_cs_fashion\"]")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"sl-sobe-carousel-sub-card-title\"])[5]")).click();
driver.getTitle();
	}

}
