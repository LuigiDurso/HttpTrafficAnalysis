package utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Patreon {

	public static void SerachOnPatreonAndShare(WebDriver driver,  String keyWord) throws InterruptedException
	{
		String firstElementXpath = "//*[@id='renderPageContentWrapper']/div/div/div/div[2]/div[1]/div/div[1]/a";
		String searchQuery = "https://www.patreon.com/search?q="+keyWord;
		String facebookShareXpath = "//*[@id='renderPageContentWrapper']/div/div[3]/div/div/div/div[3]/div/div/div/div/div[1]/button/div/div";
		//String popupShareXpath = "//*[@id='u_0_1w']";
		Thread.sleep(1000);
//		WebElement serarchBox = driver.findElement(By.xpath(searchBoxXpath));
//		serarchBox.sendKeys(keyWord);
		driver.get(searchQuery);
		Thread.sleep(2000);
		WebElement searchResult = driver.findElement(By.xpath(firstElementXpath));
		searchResult.click();
		Thread.sleep(2000);
		WebElement facebookShare = driver.findElement(By.xpath(facebookShareXpath));
		facebookShare.click();
		Thread.sleep(2000);
//		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
//		String subWindowHandler = null;

//		Set<String> handles = driver.getWindowHandles(); // get all window handles
//		Iterator<String> iterator = handles.iterator();
//		while (iterator.hasNext()){
//		    subWindowHandler = iterator.next();
//		}
//		driver.switchTo().window(subWindowHandler); // switch to popup window
//		// Now you are in the popup window, perform necessary actions here
//		driver.findElement(By.xpath(popupShareXpath));
//		Thread.sleep(2000);
//		driver.switchTo().window(parentWindowHandler);  // switch back to parent window
		
		
	}
}
