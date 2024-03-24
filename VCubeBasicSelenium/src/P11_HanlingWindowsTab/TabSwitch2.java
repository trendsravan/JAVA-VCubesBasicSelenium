package P11_HanlingWindowsTab;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabSwitch2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	driver.findElement(By.name("Submit")).click();
	
	Actions a = new Actions(driver);

	a.moveToElement(driver.findElement(By.linkText("Help"))).perform();
	driver.findElement(By.linkText("Help Contents")).click();
	Thread.sleep(11000);
	System.out.println(driver.getTitle());	
	Set<String> AvoidDuplicates = driver.getWindowHandles();// To avoid duplicate tabs	
	ArrayList<String> getwindows = new ArrayList<String>(AvoidDuplicates);//Select tab by index
	
	driver.switchTo().window(getwindows.get(1));
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.findElement(By.linkText("Accept Cookies")).click();
	Thread.sleep(2000);
	driver.switchTo().window(getwindows.get(0));
	Thread.sleep(2000);
	driver.switchTo().window(getwindows.get(1));
	Thread.sleep(2000);

}}
