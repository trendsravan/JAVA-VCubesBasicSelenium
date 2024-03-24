package P03_BrowserOpen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class LoginCheck {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.crome.driver", "C:\\Users\\srava\\Desktop\\SELENIUM Things\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.name("txtUserName"));
		un.sendKeys("selenium");
		WebElement pw = driver.findElement(By.name("txtPassword"));
		pw.sendKeys("selenium");
		WebElement lg = driver.findElement(By.name("Submit"));
		lg.click();
	
	
}}
