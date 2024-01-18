package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Waits  extends BaseClass {
	public static void checkElementStatusAndEnterValue(WebElement wb, String value) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(0));
		wait.until(ExpectedConditions.visibilityOfAllElements(wb));
		wb.sendKeys(value);
	}
}
