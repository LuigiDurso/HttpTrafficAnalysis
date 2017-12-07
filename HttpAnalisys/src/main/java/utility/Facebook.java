package utility;



import java.util.List;
import java.util.logging.Logger;

import org.apache.xpath.operations.Div;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook 
{
	private static  Logger logger = Logger.getLogger("Global");
	public static void FacebookAccess(WebDriver driver,  String username, String password) throws InterruptedException
	{
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement accessButton = driver.findElement(By.xpath("//*[@id=\"u_0_0\"]"));
		Thread.sleep(500);
		email.sendKeys(username);
		pass.sendKeys(password);
		accessButton.click();
		Thread.sleep(5000);
	}

	public static void publishState(WebDriver driver, String state) throws InterruptedException
	{
		String xPathProfileButton = "//*[@id='u_0_a\']/div[1]/div[1]/div/a/span";
		String xPathStatusButton = "//*[@id='rc.u_ps_jsonp_2_2_1']/div[1]/span[1]/a/span/span[1]";
		String xPathStutusArea = "//*[@id='js_ox']/div/div/div[2]/div/div/div/div/span";
		String xPathStatus = "//*[@id='js_3dl']/div[1]/div/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/span";
		String xPathPublishButton = "//*[@id='js_dn']/div[2]/div[3]/div/div[2]/div/button/span";
		WebElement profileButton = driver.findElement(By.xpath(xPathProfileButton));
		logger.info("Bottone profilo identificato");
		profileButton.click();
		Thread.sleep(11000);
		WebElement statusButton = driver.findElement(By.xpath(xPathStatusButton));
		logger.info("Bottone crea post identificato");
		statusButton.click();
		Thread.sleep(2000);
		WebElement statusArea= driver.findElement(By.xpath(xPathStutusArea));
		logger.info("status area identificata");
		statusArea.click();
//		WebElement textBox = driver.findElement(By.xpath(xPathStatus));
//		textBox.sendKeys(state);
//		WebElement publishButton = driver.findElement(By.xpath(xPathPublishButton));
//		publishButton.click();
//		Thread.sleep(1000);
	}
}
