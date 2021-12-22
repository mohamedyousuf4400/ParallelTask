package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenMoreURL {
	public WebDriver driver;
	
	//Open Google
	@Test(priority = 0)
	public void OpenGoogle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	}
	
	//Open Youtube
	@Test(priority = 1)
	public void OpenYoutube() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();

	}

	//Open Gmail
	@Test(priority = 2)
	public void OpenGmail() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();

	}
	
	//Open yahoo
	@Test(priority = 3)
	public void OpenYahoo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();

	}
}

