package youtube;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Youtubelearn {
	
	
   @Test(priority = 1)
	public  void main() throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "./driver/chrome-linux64");
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
	
		
		WebElement element = driver.findElement(By.name("search_query"));
		
		element.sendKeys("mind for math",Keys.ENTER);
		
		
		driver.findElement(By.xpath("(//button[.//div[@class='yt-spec-touch-feedback-shape__fill']])[1]")).click();

				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("(//button[.//div[@class='yt-spec-touch-feedback-shape__fill']])[1]")
		));
		button.click();
		
		System.out.println("Displayed: " + button.isDisplayed());
		System.out.println("Enabled: " + button.isEnabled());
		Thread.sleep(3000);
		
		
		driver.quit();	
	}


}