package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	public static void selectByValue(WebElement wb,String value) {
		if(wb.isDisplayed()&& wb.isSelected()) {
			Select sel = new Select(wb);
			sel.selectByValue(value);
		}
	}
	
	public static void selectByVisibleText(WebElement wb,String text) {
		if(wb.isDisplayed()&& wb.isSelected()) {
			Select sel = new Select(wb);
			sel.selectByVisibleText(text);
		}
	}
	public static void selectByindex(WebElement wb,int index) {
		if(wb.isDisplayed()&& wb.isSelected()) {
			Select sel = new Select(wb);
			sel.selectByIndex(index);
		}
	}
	
	public static void selectGender(List<WebElement> wb,String value) {
		for(WebElement w:wb) {
		if(w.isDisplayed()&& w.isSelected()&&w.getText().equals(value)) {
			w.click();
			break;
			}
		}
	}
}
