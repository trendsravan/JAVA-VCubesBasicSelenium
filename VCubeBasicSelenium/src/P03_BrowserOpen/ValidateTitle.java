package P03_BrowserOpen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidateTitle {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Desktop\\SELENIUM Things\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
			
			String logintitle = driver.getTitle();
			if(logintitle.equals("OrangeHRM - New Level of HR Management")) {
				System.out.println("Login page title is as expected");
			}
			else
				System.out.println("Invalid Loginpage Title");
			
			driver.findElement(By.name("txtUserName")).sendKeys("selenium");
			driver.findElement(By.name("txtPassword")).sendKeys("selenium");
			driver.findElement(By.name("Submit")).click();
			
			String hometitle = driver.getTitle();
			if(hometitle.equals("OrangeHRM")) {
				System.out.println("Home page title is as expected");
			}
			else
				System.out.println("Invalid Homepage Title");
			
	
	

}}
