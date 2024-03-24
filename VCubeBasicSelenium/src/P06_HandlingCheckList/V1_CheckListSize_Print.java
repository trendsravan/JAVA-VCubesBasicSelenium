package P06_HandlingCheckList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class V1_CheckListSize_Print {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/V-Cubes/Selenium%20Elements/Country%20Name.Htm");
	
	WebElement checklist = driver.findElement(By.id("CheckList"));
		List<WebElement> listdetails = checklist.findElements(By.tagName("option"));
			System.out.println(listdetails.size());
			for (WebElement m : listdetails) {
				System.out.println(m.getText());
			}
	
	
	
		
	

}}
