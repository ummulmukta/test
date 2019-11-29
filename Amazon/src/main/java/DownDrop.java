import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DownDrop {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		
		Select slt = new Select (driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));
		slt.selectByVisibleText("Baby");
		WebElement we = slt.getFirstSelectedOption();
		shotscreen.SS(driver,"babyscreenshot");
		System.out.println(we);
		System.out.println("=====================");
		/*List<WebElement> option = slt.getOptions();
		System.out.println(option.size());
		System.out.println("=====================");
		for(int i=0; i<option.size();i++) {
		System.out.println(option.get(i).getText());
*/
		List<WebElement>list=slt.getOptions();
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		
		
		

	}

}
