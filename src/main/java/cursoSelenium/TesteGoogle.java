package cursoSelenium;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {

	@Test
	public void teste() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/python-selenium-to-run-web-automation-test");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Selenium with Python Tutorial: How to run Automated Tests | BrowserStack", driver.getTitle());
		driver.quit();
	}
	
}
