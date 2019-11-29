import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttton {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		  driver=new ChromeDriver(); 
		  driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
WebElement af=driver.findElement(By.xpath("(//input[@name='software'])[1]"));
af.click();
Thread.sleep(2000);
//af.click();
//boolean w=af.isDisplayed();
//System.out.println(w);
//boolean a=af.isEnabled();
//System.out.println(a);
boolean c=af.isSelected();
System.out.println(c);
//af.click();
	}

}
