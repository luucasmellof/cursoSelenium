package cursoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesafioCadastro {
	
	@Test
	public void cadastroCompleto() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		// Acha os campos
		WebElement nameField = driver.findElement(By.id("elementosForm:nome"));
		WebElement lastNameField = driver.findElement(By.id("elementosForm:sobrenome"));
		WebElement sexo = driver.findElement(By.id("elementosForm:sexo:0"));
		WebElement favoriteFoodMeat = driver.findElement(By.id("elementosForm:comidaFavorita:0"));
		WebElement favoriteFoodPizza = driver.findElement(By.id("elementosForm:comidaFavorita:2"));
		WebElement schoolingCombo = driver.findElement(By.id("elementosForm:escolaridade"));
		Select schooling = new Select(schoolingCombo);
		WebElement sportSelect = driver.findElement(By.id("elementosForm:esportes"));
		Select sportToSelect = new Select(sportSelect);
		WebElement sugestion = driver.findElement(By.id("elementosForm:sugestoes"));
		WebElement registerButton = driver.findElement(By.id("elementosForm:cadastrar"));		

		// Digita nos campos
		nameField.sendKeys("Lucas");
		lastNameField.sendKeys("Ferreira");
		sexo.click();
		favoriteFoodMeat.click();
		favoriteFoodPizza.click();
		schooling.selectByIndex(4);
		sportToSelect.selectByVisibleText("Natacao");
		sportToSelect.selectByVisibleText("Corrida");
		sportToSelect.selectByVisibleText("Karate");
		sugestion.sendKeys("Sugestão");
		registerButton.click();		
		
		// Conferência de digitações
		Assert.assertEquals("Ferreira", lastNameField.getText());
		Assert.assertEquals("Lucas", nameField.getText());
		
		// Fecha o navegdor após a digitação e conferência
		driver.quit();
	}
}
