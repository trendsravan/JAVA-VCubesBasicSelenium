package P08_HyperLinkFrames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class V1HyperLinkFrames {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();	
	driver.get("file:///E:/V-Cubes/Selenium%20Elements/Frames.html");	
	
	driver.switchTo().frame(2);
	driver.findElement(By.xpath("/html/body/p/font/i[1]/a")).click();
	Thread.sleep(1000);
	driver.navigate().back();
	driver.switchTo().frame(2);
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/p/font/i[2]/a")).click();
	
		
	
	
}}