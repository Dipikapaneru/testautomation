package Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChapterDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "src/chromedriver");
	 WebDriver driver =new ChromeDriver();
	 
	
	//to open the url
	//driver.get("https://www.toolsqa.com");
 
	//Or
	String urll= "https://www.toolsqa.com";
  driver.get(urll);
	
	}
	
	
}
