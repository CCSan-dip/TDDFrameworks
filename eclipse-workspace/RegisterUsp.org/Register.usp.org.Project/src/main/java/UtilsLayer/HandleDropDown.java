package UtilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByValue(WebElement wb, String value) {
		new Select(visibilityOf(wb)).selectByValue(value);
	}

	public static void selectByVisibleText(WebElement wb, String value) {
		new Select(visibilityOf(wb)).selectByVisibleText(value);
	}

	public static void selectByIndex(WebElement wb, int index) {
		new Select(visibilityOf(wb)).selectByIndex(index);
	}

	public static List<WebElement> getOptions(WebElement wb) {
		return new Select(visibilityOf(wb)).getOptions();
	}

	public static WebElement getFirstSelectedOption(WebElement wb) {
		return new Select(visibilityOf(wb)).getFirstSelectedOption();
	}

	public static WebElement visibilityOf(WebElement wb) {
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}
	
	public static void clickOnDropDownElement(WebElement gender, String value) {
		List<WebElement> ls = new Select(visibilityOf(gender)).getOptions();
		for(WebElement web: ls) {
			if(web.getText().equalsIgnoreCase(value)) {
				web.click();
				break;
			}
		}
	}

}
