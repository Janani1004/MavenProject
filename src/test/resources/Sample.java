import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
WebDriver driver;
	
	@Test
	public void Tests() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\janani\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(100);
		
	}

}
