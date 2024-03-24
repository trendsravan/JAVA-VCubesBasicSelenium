package P05_HandlingDropDown;
import org.openqa.selenium.By;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class V2_DropDownPrint {	
	public static void main (String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	driver.findElement(By.name("Submit")).click();
	
	driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
	WebElement dd =driver.findElement(By.name("loc_code"));
	
	List<WebElement> ddvalues = dd.findElements(By.tagName("option"));
	System.out.println(ddvalues.size());
	for(WebElement m: ddvalues) {
		System.out.println(m.getText());	}
	
	

}}
