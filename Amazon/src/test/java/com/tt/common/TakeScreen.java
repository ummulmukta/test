package com.tt.common;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreen {
public void SS (WebDriver driver, String Sign) throws Throwable {
		
		TakesScreenshot tkss = (TakesScreenshot)driver;
		File fl = tkss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,new File("/Users/rashelkhan/eclipse-workspace/Amazon/Screenshot/"+Sign+".jpg"));
	}
}
