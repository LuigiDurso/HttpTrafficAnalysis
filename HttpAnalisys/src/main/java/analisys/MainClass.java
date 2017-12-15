package analisys;

import org.openqa.selenium.WebDriver;

import utility.EpicWebDriver;
import utility.Facebook;
import utility.FitnessSpalMilk;
import utility.GoogleSearch;
import utility.Instagram;
import utility.Patreon;
import utility.YahooSearch;


public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		String chromeWebDriverPath = "C:\\Users\\johnn\\Librerie\\chromedriver.exe";
		String epicBrowserPath = "C:\\Users\\johnn\\AppData\\Local\\Epic Privacy Browser\\Application\\epic.exe";
		
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
		Thread.sleep(3000);
		//aggiunta latte come colazione in myFitnessSpall
		GoogleSearch.selectFirstElementOnGoogle(driver, "my fitness spall");
		FitnessSpalMilk.loginByFB(driver,"luciafasolino25121994@gmail.com", "25121994");
		FitnessSpalMilk.addMilk(driver);
		Thread.sleep(3000);
		//ricerca su google movimento 5 stelle
		GoogleSearch.selectFirstElementOnGoogle(driver, "Movimento 5 stelle");
		Thread.sleep(3000);
		//ricerca su google Bibbia
		GoogleSearch.selectFirstElementOnGoogle(driver, "Bibbia");
		Thread.sleep(3000);
		//ricerca su google Rimedi naturali mal di testa
		GoogleSearch.selectFirstElementOnGoogle(driver, "Rimedi naturali mal di testa");
		Thread.sleep(3000);
		//ricerca su google Incontri lesbiche
		GoogleSearch.selectFirstElementOnGoogle(driver, "Incontri lesbiche");
		Thread.sleep(3000);
		//ricerca su google Tripadvisor.it Amsetrdam
		GoogleSearch.selectFirstElementOnGoogle(driver, "Tripadvisor.com Amsetrdam");
		Thread.sleep(3000);
		//ricerca su google Booking.com Bruxelles
		GoogleSearch.selectFirstElementOnGoogle(driver, "Booking.com Bruxelles");
		Thread.sleep(3000);
		
	}

}
