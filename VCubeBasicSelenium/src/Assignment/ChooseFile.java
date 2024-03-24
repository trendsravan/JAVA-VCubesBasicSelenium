package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChooseFile {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	driver.findElement(By.name("Submit")).click();
		
	Actions A =new Actions(driver);
	A.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a/span"))).perform();
	driver.findElement(By.linkText("Add Employee")).click();
	
	driver.switchTo().frame(driver.findElement(By.name("rightMenu")));
	
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Pasupuleti");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Sravan");
	driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Kumar");
	driver.findElement(By.name("txtEmpNickName")).sendKeys("Chinna");
	
	
	//driver.findElement(By.name("photofile")).click();
	A.moveToElement(driver.findElement(By.name("photofile"))).click().perform();
	
	
	
	
	
	
	
	
	Thread.sleep(3000);
	driver.quit();
	
	
	
}}
