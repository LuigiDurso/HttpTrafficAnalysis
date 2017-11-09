package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook 
{
	public static void FacebookAccess(WebDriver driver,  String username, String password) throws InterruptedException
	{
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement accessButton = driver.findElement(By.id("u_0_5"));
		Thread.sleep(500);
		email.sendKeys(username);
		pass.sendKeys(password);
		accessButton.click();
		Thread.sleep(1000);
	}
}
