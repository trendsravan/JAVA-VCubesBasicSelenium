package P05_HandlingDropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
 

public class V1_DropDownClick {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver,chrome.driver", "‪C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	//driver.manage().window().maximize();
	
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	driver.findElement(By.name("Submit")).click();
	
	driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
	driver.findElement(By.name("loc_code")).click();
	

}}
