package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooSearch 
{
	public static void selectFirstElementOnAnswer(WebDriver driver,String query ) throws InterruptedException
	{
		WebElement barraRicerca = driver.findElement(By.xpath("//*[@id=\"UHSearchBox\"]"));
		barraRicerca.sendKeys(query);
		barraRicerca.submit();
		Thread.sleep(2000);
		List<WebElement> primaOccorrenza = driver.findElements(By.xpath("//*[@class=' lh-17 fz-m']"));
		primaOccorrenza.get(0).click();
		Thread.sleep(2000);
	}
}
