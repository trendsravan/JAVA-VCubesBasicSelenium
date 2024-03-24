package P10_Handling_Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_Model_PopUp {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/V-Cubes/Selenium%20Elements/Model%20Popup.html");
	driver.findElement(By.id("Modal")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("close")).click();
	
	driver.quit();
	
}}
