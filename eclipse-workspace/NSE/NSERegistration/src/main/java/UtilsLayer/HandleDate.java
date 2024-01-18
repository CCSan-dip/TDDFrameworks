package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDate {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)).pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		int day = 22;
		String month = "Aug";
		String year ="2026";
		String mnYear=month+" "+year;
		WebElement wb = driver.findElement(By.xpath("//span[text()='Date']"));
		wb.click();

		String monthYear = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"))
				.getText();
		while (true) {
			if (monthYear.equals("Aug 2024")) {
				driver.findElement(By.xpath("//span[text()='"+day+"']")).click();
				break;
			} else {
				driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			}
		}
	}
}
