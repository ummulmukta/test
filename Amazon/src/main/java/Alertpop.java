import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		
		  //Radio Button
		  
		  
		  driver.get("https://www.spicejet.com");
		  
		  WebElement
		  radiobutton=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		  Thread.sleep(3000);
		  WebElement
		  radiobutton1=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		  //Checks to see if the One Way Radio Button is selected
		  System.out.println(radiobutton.isSelected());
		  
		  
		  //radiobutton1.click(); //Thread.sleep(5000);
		  //System.out.println("Now Round Trip Is Selected"); //Thread.sleep(5000);
		 
		// Check Boxes

		// driver.get("https://www.alaskaair.com/");

		//driver.get("https://www.alaskaair.com/");
		//WebElement cb1 = driver.findElement(By.id("oneWay"));
		//WebElement cb2 = driver.findElement(By.id("awardReservation"));

		// Checks both Check boxes

		//cb1.click();
		//cb2.click();

		// System.out.println("Now Bot Check Boxes are Checked"+cb1.isEnabled());

		// Alert Pop Ups
		 driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		// Click to get a pop up
		 driver.findElement(By.xpath("//input[contains(@value,'Confirmation Alert')]")).click();
		
		
		 
		// Get the text from pop up
		 System.out.println(driver.switchTo().alert().getText());
		// Accept the Alert

		 driver.switchTo().alert().accept();

	}

}
