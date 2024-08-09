package Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	WebDriver driver;
	
	@Before
	public WebDriver setup() throws IOException
	{
		FileInputStream fis = new FileInputStream("Teladoc.properties");
		Properties property = new Properties();
		property.load(fis);
		String url = property.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		return driver;
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}
}
