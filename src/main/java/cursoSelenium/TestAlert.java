package cursoSelenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class TestAlert {

	@Test
	public void deveInteragirComAlert() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement buttonAlert = driver.findElement(By.id("alert"));
		WebElement nameField = driver.findElement(By.id("elementosForm:nome"));
		buttonAlert.click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals("Alert Simples", alertText);
		alert.accept();
		nameField.sendKeys(alertText);
		
		driver.quit();
	}
	
	@Test
	public void deveInteragirComAlertConfirm() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement buttonAlert = driver.findElement(By.id("confirm"));
		//WebElement nameField = driver.findElement(By.id("elementosForm:nome"));
		buttonAlert.click();
		Alert alert = driver.switchTo().alert();
		String alertText1 = alert.getText();
		Assert.assertEquals("Confirm Simples", alertText1);
		alert.accept();
		String alertText2 = alert.getText();
		Assert.assertEquals("Confirmado", alertText2);
		alert.accept();
		//nameField.sendKeys(alertText);
		
		//driver.quit();
	}
	
	
}