package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class SamplePractice 
{
	@Parameters({"username","password"})
	@Test
	public void test1(@Optional("Megha") String param1,@Optional("Megha") String param2) throws InterruptedException {
	//	WebDriver driver = WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		int width = 1000;
		int height = 1000;
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
		driver.manage().window().maximize();
		
	//	((JavascriptExecutor)driver).executeScript("window.resizeTo(60,40);");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.get("https://demo.guru99.com/test/upload/");
		//driver.findElement(By.xpath("//input[@class='upload_txt']")).sendKeys("C:\\Users\\nikhi\\Downloads\\test.jpeg");
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.findElement(By.xpath("//a[@id='alert']")).click();
		Thread.sleep(5000);
		
		//js.executeScript("window.alert = function(message) { window.alertMessage = message; }");
		Alert alert = driver.switchTo().alert();

        // Inject JavaScript to capture the alert message
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "var alertText = arguments[0].textContent; return alertText;";
        String alertMessage = (String) js.executeScript(script, alert);
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
	}

}
