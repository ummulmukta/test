import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframme {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com");
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions a=new Actions(driver);
		
		WebElement from=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		  WebElement to=driver.findElement(By.id("droppable")); 
		  Thread.sleep(3000);
		  a.dragAndDrop(from, to).build().perform(); Thread.sleep(5000);
		  driver.switchTo().parentFrame(); //Both the same - going back to the main
		 //* page from thr frame //driver.switchTo().defaultContent(); 
		  WebElement d=driver.findElement(By.linkText("Resizable")); 
		  Thread.sleep(3000);
		  
		  d.click(); 
		  System.out.print(d.getText());
		
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		/*
		 * //Another way to count frame - Tag name iframe or frameset
		 * //System.out.println(driver.findElements(By.tagName("frameset")).size());
		 * //driver.switchTo().frame(driver.findElement(By.xpath(
		 * "//iframe[@class='demo-frame']"))); driver.switchTo().frame(0);
		 * //System.out.println("Get text after switiching to frame");
		 * //System.out.println(driver.findElement(By.
		 * xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")).
		 * getText()); Actions a=new Actions(driver); WebElement
		 * from=driver.findElement(By.
		 * xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		 * WebElement to=driver.findElement(By.id("droppable")); Thread.sleep(5000);
		 * a.dragAndDrop(from, to).build().perform(); Thread.sleep(5000);
		 * driver.switchTo().parentFrame(); //Both the same - going back to the main
		 * page from thr frame //driver.switchTo().defaultContent(); WebElement d=
		 * driver.findElement(By.linkText("Resizable")); Thread.sleep(3000);
		 * 
		 * //d.click(); System.out.print(d.getText());
		 * //driver.switchTo().frame(driver.findElement(By.xpath(
		 * "//iframe[@class='demo-frame']"))); //System.out.
		 * println("Get text after returning to parent frame and then switiching to frame"
		 * ); //System.out.println(driver.findElement(By.
		 * xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")).
		 * getText());
		 * 
		 * 
		 */
	}

}
