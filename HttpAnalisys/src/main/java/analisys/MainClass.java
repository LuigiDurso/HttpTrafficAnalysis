package analisys;

import org.openqa.selenium.WebDriver;

import utility.EpicWebDriver;
import utility.Facebook;
import utility.GoogleSearch;
import utility.Instagram;
import utility.StringDB;
import utility.YahooSearch;


public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		String chromeWebDriverPath = "C:\\Users\\Durso\\Downloads\\chromedriver_win32\\chromedriver.exe";
		String epicBrowserPath = "C:\\Users\\Durso\\AppData\\Local\\Epic Privacy Browser\\Application\\epic.exe";
		WebDriver driver = EpicWebDriver.getEpicWebDriver(chromeWebDriverPath, epicBrowserPath);
//		GoogleSearch.selectFirstElementOnGoogle(driver, "Instagram");
//		Facebook.FacebookAccess(driver, "luciafasolino25121994@gmail.com", "25121994");
//		Facebook.publishState(driver, StringDB.facebookStatus);
//		Instagram.InstagamAccess(driver, "luciafasolino4592", "25121994");
//		Instagram.searchPersonAndPhotoLike(driver, "vincenzofalconedelicious");
//		GoogleSearch.selectFirstElementOnGoogle(driver, "Facebook");
		GoogleSearch.selectFirstElementOnGoogle(driver, "yahoo answer");
		YahooSearch.selectFirstElementOnAnswer(driver, "movimento 5 stelle");
		Thread.sleep(1000);
	}

}
