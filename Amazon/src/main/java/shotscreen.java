import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class shotscreen {
public static void SS (WebDriver driver, String Sign) throws Throwable {
		
		TakesScreenshot tkss = (TakesScreenshot)driver;
		File fl = tkss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,new File("./Screenshot"+Sign+".png"));
		//FileUtils.copyFile(fl,new File("C:\\Users\\farha\\git\\test\\Amazon\\Screenshot"+Sign+".png"));

}
}
