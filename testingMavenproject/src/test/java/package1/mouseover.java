package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C://SeleniumSoftwares//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

				
				driver.get("http://www.kohls.com/");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
				
				
				//WebElement menu = driver.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[2]"));
				
				WebElement menu= driver.findElement(By.xpath("//*[@id='navigation']/li[5]/div[1]/a"));
				
				Actions action = new Actions(driver);
				action.moveToElement(menu).perform();
				
				driver.findElement(By.xpath("//*[@id='navigation']/li[5]/div[2]/ul[1]/li/ul/li[3]/a")).click();
				
				
	}

}
