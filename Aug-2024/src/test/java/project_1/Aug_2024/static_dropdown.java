package project_1.Aug_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class static_dropdown extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		hit_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=CjwKCAjw59q2BhBOEiwAKc0ijRAqotuvKBlaSvfgC0rxy-pDkQ04ouyW1RKnpzgNvMBy7rh6O0mVyRoCs_oQAvD_BwE");
		
	WebElement profile_for = driver.findElement(By.cssSelector("select#reg_relationship"));
		
	Select sl = new Select(profile_for);
	sl.selectByVisibleText("Brother");
	
	WebElement height = driver.findElement(By.cssSelector("select#reg_height"));
	sl.selectByValue("19");
	
	
	
	WebElement gmail = driver.findElement(By.cssSelector("input#reg_email"));
	 
		gmail.click();
		gmail.sendKeys("pranalibokade1997@gmail.com");
		
		WebElement password = driver.findElement(By.cssSelector("input#reg_password"));
		password.click();
		password.sendKeys("abc@123");
		
		
		
		
	}

}
