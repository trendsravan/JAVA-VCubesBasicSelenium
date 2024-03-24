package P09_Handling_Mouse_Keyword;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class GooGleSearch {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.className("gLFyf")).sendKeys("salaar songs telugu");
	Actions a = new Actions(driver);	
	a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	driver.findElements(By.linkText("Videos")).get(0).click();
//	System.out.println(videos);
//	videos.get(0);
	
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/div[2]/a/div/div/div[4]")).click();
	

}}
