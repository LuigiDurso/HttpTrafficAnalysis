package analisys;

import org.openqa.selenium.WebDriver;

import utility.EpicWebDriver;
import utility.Facebook;
import utility.GoogleSearch;
import utility.Instagram;
import utility.Patreon;
import utility.YahooSearch;


public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		String chromeWebDriverPath = "C:\\Users\\Durso\\Downloads\\chromedriver_win32\\chromedriver.exe";
		String epicBrowserPath = "C:\\Users\\Durso\\AppData\\Local\\Epic Privacy Browser\\Application\\epic.exe";
		
		WebDriver driver = EpicWebDriver.getEpicWebDriver(chromeWebDriverPath, epicBrowserPath);
		//ricerca su yahoo answer
		GoogleSearch.selectFirstElementOnGoogle(driver, "yahoo answer");
		YahooSearch.selectFirstElementOnAnswer(driver, "movimento 5 stelle");
		Thread.sleep(3000);
		//accesso a Facebook
		GoogleSearch.selectFirstElementOnGoogle(driver, "Facebook");
		Facebook.FacebookAccess(driver, "luciafasolino25121994@gmail.com", "25121994");
		Thread.sleep(3000);
		//accesso a instagram e ricerca
		GoogleSearch.selectFirstElementOnGoogle(driver, "Instagram");
		Instagram.InstagamAccess(driver, "luciafasolino4592", "25121994");
		Instagram.searchPersonAndPhotoLike(driver, "vincenzofalconedelicious");
		Thread.sleep(3000);
		//ricerca su patreon e condivisione
		GoogleSearch.selectFirstElementOnGoogle(driver, "patreon");
		Patreon.SerachOnPatreonAndShare(driver, "Nail Art");
	}

}
