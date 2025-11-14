package DemoWeb;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLocators {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	public void demoSeleniumLocators() {

		// Find WebElement By id WebElement username =
		WebElement username= driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		// Find WebElement By name WebElement password =
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		// Find WebElement By className
		WebElement buttonLogIn = driver.findElement(By.xpath("//button[@type='submit']"));
		buttonLogIn.click();
		System.out.println("Login page launching");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

	}

}
