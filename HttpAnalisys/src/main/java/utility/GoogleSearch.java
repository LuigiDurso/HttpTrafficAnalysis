package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

public class GoogleSearch 
{
	public static void selectFirstElementOnGoogle(WebDriver driver,String query ) throws InterruptedException
	{
		driver.get("http://www.google.it");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(query);
		element.submit();
		Thread.sleep(1000);
		List<WebElement> results = driver.findElements(By.xpath("//h3[@class='r']/a"));
		WebElement first = results.get(0);
		first.click();
		Thread.sleep(1000);
	}
}
