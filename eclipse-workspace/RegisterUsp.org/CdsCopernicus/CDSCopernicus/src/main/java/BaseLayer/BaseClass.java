package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	private static	Properties prop;
	public static WebDriver driver;
	public BaseClass() {
		File f = new File(System.getProperty("user.dir")+"//src//main//java//CofigurationLayer//Config.properties");
		 prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String url = prop.getProperty("Url");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)).pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}
	
}
