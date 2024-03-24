package P12_HandlingUploadFiles;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFiles {
	public static void main(String[]args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chorme.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new 	ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");	
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	driver.findElement(By.name("Submit")).click();
	
	Actions a = new Actions(driver);
	
	a.moveToElement(driver.findElement(By.id("pim"))).perform();;
	driver.findElement(By.linkText("Employee List")).click();
	
	driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
	driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
	driver.findElement(By.id("txtEmpLastName")).sendKeys("Pasupuleti");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Sravan");
	driver.findElement(By.id("txtEmpMiddleName")).sendKeys("Kumar");
	driver.findElement(By.id("txtEmpNickName")).sendKeys("Chinna");

	//driver.findElement(By.id("photofile")).click();//Not Works
	a.moveToElement(driver.findElement(By.id("photofile"))).click().perform();
	
	StringSelection d = new StringSelection("C:\\Users\\srava\\Pictures\\Screenshots\\Screenshot 2024-02-05 195111.png");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(d, null);
	Thread.sleep(2000);
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//driver.findElement(By.className("savebutton")).click();
	
	
	
}}
