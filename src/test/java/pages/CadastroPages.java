package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroPages {
	
	static WebDriver driver;
	
	public CadastroPages(WebDriver driver) {
		CadastroPages.driver = driver;
	}
	
	public void acessarpaginalogin() {
		
		WebElement acessologin = driver.findElement(By.xpath("/html/body/div/nav/div/div/ul/li/a"));
		acessologin.click();
		
	}
	
	public void acessarpaginacadastro() {
		
		WebElement acessocadastro = driver.findElement(By.xpath("/html/body/div/main/section/div/div/div/div/div/div/div[2]/a"));
		acessocadastro.click();
	}
}
