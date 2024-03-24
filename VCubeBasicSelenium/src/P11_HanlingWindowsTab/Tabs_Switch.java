package P11_HanlingWindowsTab;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Tabs_Switch {
	public static void main (String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");	
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	driver.findElement(By.name("Submit")).click();
	
	Actions a =new Actions(driver);
	
	a.moveToElement(driver.findElement(By.id("help"))).perform();
	driver.findElement(By.linkText("Help Contents")).click();	//Open Child Window
	System.out.println("Fresh Window : "+ driver.getTitle()); //Driver Still in Parent Page.
	
	Set<String> allWindows = driver.getWindowHandles(); //Tabs are Not in order & Avoid Duplicate Tabs
	System.out.println(allWindows.size());
	
	ArrayList<String> MyOrder = new ArrayList<String>(allWindows);
	driver.switchTo().window(MyOrder.get(1)); //Driver moved to Child
	Thread.sleep(10000);
	System.out.println("After shifting to Child :" + driver.getTitle());
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("Accept Cookies")).click();
	Thread.sleep(2000);
	driver.switchTo().window(MyOrder.get(0));
	System.out.println("Shifting to parent :" + driver.getTitle());
	Thread.sleep(2000);
	driver.switchTo().window(MyOrder.get(1));
	Thread.sleep(2000);
	driver.switchTo().window(MyOrder.get(0));
	Thread.sleep(2000);
	driver.switchTo().window(MyOrder.get(1));
	
	driver.quit();
		
}}
