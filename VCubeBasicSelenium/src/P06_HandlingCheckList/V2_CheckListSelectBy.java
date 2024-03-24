package P06_HandlingCheckList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import java.util.List;



public class V2_CheckListSelectBy {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srava\\Documents\\1) Selenium Data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///E:/V-Cubes/Selenium%20Elements/Country%20Name.Htm");
	
	WebElement CheckList = driver.findElement(By.id("CheckList"));		
	Select select =new Select(CheckList);
	
	//Check if the select element supports multiple selections
	if(select.isMultiple()) {
		List<WebElement> lists= select.getOptions();
		
		for(WebElement list: lists){
			select.selectByVisibleText(list.getText());}}
}}
