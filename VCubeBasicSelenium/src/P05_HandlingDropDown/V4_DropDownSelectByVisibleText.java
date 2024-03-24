package P05_HandlingDropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;


public class V4_DropDownSelectByVisibleText {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");	
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	driver.findElement(By.name("Submit")).click();
	
	driver.switchTo().frame(driver.findElement(By.name("rightMenu")));
	WebElement dd =driver.findElement(By.name("loc_code"));
		Select s =new Select (dd);
		s.selectByVisibleText("Supervisor");
		
		
	

}}
