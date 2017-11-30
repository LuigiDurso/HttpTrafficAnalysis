package analisys;

import org.openqa.selenium.WebDriver;

import utility.EpicWebDriver;
import utility.Facebook;
import utility.GoogleSearch;
import utility.Instagram;
import utility.Patreon;
import utility.StringDB;


public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		String chromeWebDriverPath = "C:\\Users\\johnn\\Librerie\\chromedriver.exe";
		String epicBrowserPath = "C:\\Users\\johnn\\AppData\\Local\\Epic Privacy Browser\\Application\\epic.exe";
		WebDriver driver = EpicWebDriver.getEpicWebDriver(chromeWebDriverPath, epicBrowserPath);
		GoogleSearch.selectFirstElementOnGoogle(driver, "Facebook");
		Facebook.FacebookAccess(driver, "luciafasolino25121994@gmail.com", "25121994");
//		Facebook.publishState(driver, StringDB.facebookStatus);
		Thread.sleep(1000);
		GoogleSearch.selectFirstElementOnGoogle(driver, "Instagram");
		Instagram.InstagamAccess(driver, "luciafasolino4592", "25121994");
		Instagram.searchPersonAndPhotoLike(driver, "vincenzofalconedelicious");
		Thread.sleep(1000);
		GoogleSearch.selectFirstElementOnGoogle(driver, "patreon");
		Patreon.SerachOnPatreonAndShare(driver, "Nail Art");
		
		

	}

}
