package UtilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Waits extends BaseClass {

	public static WebElement visibilityOf(WebElement wb) {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}

	public static List<WebElement> visibilityOfAllElements(List<WebElement> wb) {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(wb));
	}

}
