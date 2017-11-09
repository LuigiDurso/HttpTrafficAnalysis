package utility;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EpicWebDriver 
{
	public static WebDriver getEpicWebDriver(String chromeWebDriverPath, String epicBrowserPath)
	{
		File file = new File(chromeWebDriverPath);
		
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver.port","8080");
		HashMap<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("binary", epicBrowserPath);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver epicDriver = new ChromeDriver(capabilities);
		
		return epicDriver;
	}
	
}
