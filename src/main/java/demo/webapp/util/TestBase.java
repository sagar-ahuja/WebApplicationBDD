package demo.webapp.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
public TestBase(){
		
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") 
					+ "\\src\\main\\java\\demo\\webapp\\config\\config.properties");
			prop.load(ip);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
}

public static void intitialisation()
{
	String browserName = prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.edge.driver", "resources\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else {
		System.out.println("Select a browser...");
	}
	
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		
	driver.get(prop.getProperty("url"));
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
}

}
