package utility;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FitnessSpalMilk 
{
	/**
	 * Effettua la login tramite FB
	 * @param driver
	 * @param nomeUtente
	 * @param pw
	 * @throws InterruptedException 
	 */
	public static void loginByFB(WebDriver driver,String nomeUtente, String pw) throws InterruptedException
	{
		//entriamo in myFitnessSpal
		WebElement buttonFBLogin = driver.findElement(By.xpath("//*[@id=\"join\"]/a[1]/span[2]"));
		buttonFBLogin.click();
		Thread.sleep(3000);
		
		String parentWindowHandler = driver.getWindowHandle(); // Manteniamo la finestra padre
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // otteniamo tutte le finestre
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext())
		{
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch nel popup

		// Ora siamo nel popup
		Facebook.FacebookAccess(driver, nomeUtente, pw);
		Thread.sleep(3000);

		driver.switchTo().window(parentWindowHandler);  // switch nella finestra padre
		Thread.sleep(6000);
	}
	
	/**
	 * aggiunge latte alla colazione
	 * @param driver
	 * @throws InterruptedException 
	 */
	public static void addMilk(WebDriver driver) throws InterruptedException
	{
		//click su aggiungi alimento 
		WebElement aggiungiAlimentoButton = driver.findElement(By.xpath("//*[@id=\"ember1732\"]"));
		aggiungiAlimentoButton.click();
		Thread.sleep(3000);
		//click su aggiungi alimento prima colazione 
		aggiungiAlimentoButton = driver.findElement(By.xpath("//*[@id=\"diary-table\"]/tbody/tr[2]/td[1]/a"));
		aggiungiAlimentoButton.click();
		Thread.sleep(3000);
		//entrare in frequente
		aggiungiAlimentoButton = driver.findElement(By.xpath("//*[@id=\"frequent_tab\"]/a"));
		aggiungiAlimentoButton.click();
		Thread.sleep(3000);
		//click sul checkbutton del latte sterilgarda
		aggiungiAlimentoButton = driver.findElement(By.xpath("//*[@id=\"favorites_0_checked\"]"));
		aggiungiAlimentoButton.click();
		Thread.sleep(3000);
		//click su aggiungi selezionato
		aggiungiAlimentoButton = driver.findElement(By.xpath("//*[@id=\"frequent_page_1\"]/div/div[1]/input"));
		aggiungiAlimentoButton.click();
		Thread.sleep(3000);
	}

}
