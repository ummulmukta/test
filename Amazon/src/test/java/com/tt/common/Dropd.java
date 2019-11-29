package com.tt.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropd {
public static WebDriver driver;
	public static void main(String[] args) {
	driver=	Common.getBrowser("chrome", driver);
		//Common.getGetURL();
		Select slt = new Select (driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.id(""))));
		
		slt.selectByVisibleText("Baby");
		WebElement we = slt.getFirstSelectedOption();
		System.out.println(we);
		System.out.println("=====================");
		List<WebElement> option = slt.getOptions();
		System.out.println(option.size());
		System.out.println("=====================");
		for(int i=0; i<option.size();i++) {
		System.out.println(option.get(i).getText());

	}

}}
