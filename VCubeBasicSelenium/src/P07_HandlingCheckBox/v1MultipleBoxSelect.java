package P07_HandlingCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class v1MultipleBoxSelect {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("file:///E:/V-Cubes/Selenium%20Elements/Country%20Check%20box.html");
	for(int i =1; i<=5; i++) {
		driver.findElement(By.xpath("/html/body/form/input[" +i+ "]")).click();	
	}
	//driver.quit();
}}
