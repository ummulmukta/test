package com.tt.pageobjectmodel;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
WebDriver driver;
public DropDown (WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}

@FindBy(xpath="//select[@class='nav-search-dropdown searchSelect']")
private WebElement OptionButton;
public WebElement getOptionButton() {
	return OptionButton;}

public void select(){
	Select slt = new Select (driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));
	WebDriverWait wait=new WebDriverWait(driver,20);
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

	
}

@FindBy(xpath="//input[@type='submit']")
private WebElement SrchButton;
public WebElement SrchButton() {
	return SrchButton;}
public void scroldwn() {
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
}
public void scrolup() {
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_UP).build().perform();
}
public void SS (WebDriver driver, String Baby) throws Throwable {
	
	TakesScreenshot tkss = (TakesScreenshot)driver;
	File fl = tkss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fl,new File("/Users/rashelkhan/eclipse-workspace/Amazon/Screenshot/"+Baby+".jpg"));
}


}
