package test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.CadastroPages;

public class CadastroTest {
	
	

	static WebDriver driver;
	static CadastroPages efetuarCadastro;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://dev.socialtur.com.br/");
		efetuarCadastro = new CadastroPages (driver);
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testacessarpaginalogin() {
		efetuarCadastro.acessarpaginalogin();
		efetuarCadastro.acessarpaginacadastro();
		
	}
	

}
