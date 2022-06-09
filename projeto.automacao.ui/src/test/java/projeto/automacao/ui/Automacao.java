package projeto.automacao.ui;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	
	}

	@After
	public void tearDown() throws Exception {
	driver.quit();
	}

	@Test
	public void validarGoogle() {
		driver.get("https://www.google.com/");
		String titulo = driver.getTitle();
		assertEquals("Google", titulo);
	}
		
		@Test
		public void validarAmazon() {
			driver.get("https://www.amazon.com.br/");
			String titulo = driver.getTitle();
			assertEquals("Amazon.com.br | Tudo pra você, de A a Z.", titulo);
		
		
		}
		
		@Test
		public void validarUrlAmazon() {
			driver.get("https://www.amazon.com.br/");
			String url = driver.getCurrentUrl();
			assertEquals("https://www.amazon.com.br/", url);
		
		
		}
		@Test
		public void validarUrlGoogle() {
			driver.get("https://www.google.com/");
			String url = driver.getCurrentUrl();
			assertEquals("https://www.google.com/", url);
		
		
		}

}
