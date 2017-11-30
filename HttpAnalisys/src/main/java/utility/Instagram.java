package utility;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Instagram 
{
	public static void InstagamAccess(WebDriver driver,  String username, String password) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement access = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[2]/p/a"));
		access.click();
		Thread.sleep(2000);
		List<WebElement> formFieled = driver.findElements(By.xpath("//input[@class='_ph6vk _o716c']"));
		formFieled.get(0).sendKeys(username);
		formFieled.get(1).sendKeys(password);
		WebElement accessButton = driver.findElement(By.xpath("//button[@class='_qv64e _gexxb _4tgw8 _njrw0']"));
		accessButton.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	public static void searchPersonAndPhotoLike(WebDriver driver,  String profileName) throws InterruptedException
	{
		
		Random rand = new Random();
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='_avvq0 _o716c']"));
		searchBox.sendKeys(profileName);
		Thread.sleep(2000);
		WebElement searchResult = driver.findElement(By.xpath("//span[@class='_sgi9z']"));
		if(searchResult.getText().equals(profileName)) 
		{
			searchResult.click();
			Thread.sleep(2000);
			List<WebElement> imagList = driver.findElements(By.xpath("//div[@class='_mck9w _gvoze _f2mse']/a"));
			WebElement currentImage = imagList.get(rand.nextInt(imagList.size()));
			currentImage.click();
			Thread.sleep(1000);
			currentImage.findElement(By.xpath("//a[@class='_eszkz _l9yih']")).click();
		}
	}
}
