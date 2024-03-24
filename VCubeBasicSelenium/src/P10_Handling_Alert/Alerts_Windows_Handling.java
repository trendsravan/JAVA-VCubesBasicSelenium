package P10_Handling_Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts_Windows_Handling {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/V-Cubes/Selenium%20Elements/Alert%20Message.html");
	driver.findElement(By.xpath("/html/body/button")).click();	
	
	Alert popup = driver.switchTo().alert();	
	System.out.println(popup.getText());
	popup.accept();
	
	

}}
