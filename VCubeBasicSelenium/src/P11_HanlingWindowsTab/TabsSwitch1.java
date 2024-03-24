package P11_HanlingWindowsTab;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TabsSwitch1 {
	public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	driver.findElement(By.name("Submit")).click();
	
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.id("help"))).perform();
	driver.findElement(By.linkText("Help Contents")).click();
	System.out.println(driver.getTitle());
	
	Set<String> windowhandle = driver.getWindowHandles();
	System.out.println(windowhandle.size());
	
	ArrayList<String> order = new ArrayList<String>(windowhandle);
	driver.switchTo().window(order.get(1));
	Thread.sleep(10000);
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div[2]/div/a")).click();

	Thread.sleep(3000);
	driver.switchTo().window(order.get(0));
	Thread.sleep(3000);
	driver.switchTo().window(order.get(1));

}}
