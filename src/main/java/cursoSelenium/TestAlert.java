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
	public void deveInteragirComAlertConfirmAcept() {
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
		
		driver.quit();
	}
	
	@Test
	public void deveInteragirComAlertConfirmDismiss() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement buttonAlert = driver.findElement(By.id("confirm"));
		buttonAlert.click();
		Alert alert = driver.switchTo().alert();
		String alertText1 = alert.getText();
		Assert.assertEquals("Confirm Simples", alertText1);
		alert.dismiss();
		String alertText2 = alert.getText();
		Assert.assertEquals("Negado", alertText2);
		alert.accept();
		
		driver.quit();
	}
	
	@Test
	public void deveInteragirComAlertPromptAcept() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		WebElement buttonAlert = driver.findElement(By.id("prompt"));
		
		// Clica no botão alert, escreve algo e aceita
		buttonAlert.click();
		Alert alert = driver.switchTo().alert();
		String sendKey = "5";
		alert.sendKeys(sendKey);
		alert.accept();
		
		// Verifica o texto do próximo alert e confirma
		String confirmText = alert.getText();
		Assert.assertEquals("Era " + sendKey + "?", confirmText);
		alert.accept();
		Assert.assertEquals(":D", alert.getText());
		alert.accept();
		
		driver.quit();
	}
}