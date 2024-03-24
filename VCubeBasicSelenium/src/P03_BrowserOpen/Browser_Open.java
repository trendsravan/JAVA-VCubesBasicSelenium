package P03_BrowserOpen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Open {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\srava\\Desktop\\SELENIUM Things\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");			
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.close();

}}
