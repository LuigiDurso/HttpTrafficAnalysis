package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Instagram 
{
	public static void InstagamAccess(WebDriver driver,  String username, String password) throws InterruptedException
	{
		WebElement access = driver.findElement(By.xpath("//a[@class='_b93kq']"));
		access.click();
		Thread.sleep(500);
		List<WebElement> formFieled = driver.findElements(By.xpath("//input[@class='_ph6vk _o716c']"));
		formFieled.get(0).sendKeys(username);
		formFieled.get(1).sendKeys(password);
		WebElement accessButton = driver.findElement(By.xpath("//button[@class='_qv64e _gexxb _4tgw8 _njrw0']"));
		accessButton.click();
		Thread.sleep(1000);
	}
}
