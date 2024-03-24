package P09_Handling_Mouse_Keyword;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class mouse_Keyword {
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("HanumanI");
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		a.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		
		driver.findElement(By.className("gLFyf")).sendKeys("Hanuman");
		a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		 WebElement imagesLink = driver.findElements(By.linkText("Videos")).get(0);
		    imagesLink.click();
		   WebElement HanumanChalisa =  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/div[2]/a"));
		    //a.doubleClick(HanumanChalisa).perform();
		   HanumanChalisa.click();

}}
