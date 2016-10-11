  package package1;

  
        import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		//import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		//import org.openqa.selenium.firefox.FirefoxDriver; 
 
     public class checkboxtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				System.setProperty("webdriver.chrome.driver","C://SeleniumSoftwares//chromedriver.exe");
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
				
				driver.findElement(By.id("login-username")).sendKeys("toricha79@yahoo.co.in");
				driver.findElement(By.id("login-signin")).click();
				
				List<WebElement> check_box = driver.findElements(By.id("yui_3_18_1_11_1476143259764_125"));
				
				System.out.println(check_box.get(0).getAttribute("value"));
				System.out.println(check_box.get(0).getAttribute("id"));
				
				//Thread.sleep(5000);
				
				System.out.println(check_box.get(0).getAttribute("checked"));
				
				//check_box.get(0).click(); //check the radio button if it is unchecked
				//Thread.sleep(5000);
				
				
				System.out.println(check_box.get(0).getAttribute("checked"));

			}



	}


