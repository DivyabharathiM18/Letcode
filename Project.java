package Firstproject;

import java.io.File;
import java.util.logging.FileHandler;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Project {
@Test
	public void main() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chromedriver","./driver/chrome-linux64");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/");
		
		driver.findElement(By.xpath("//a[@class='button is-link is-rounded is-large']")).click();

		
	
		
		driver.findElement(By.xpath("//a[@class='cursor-pointer transition-all duration-100 border-b border-transparent hover:border-dark transform translate-y-[1px] font-cr-book text-sm flex-shrink-0']")).click();
       
		
		
		driver.findElement(By.xpath("//div[@class='w-[210px] flex']")).click();
		
		
		driver.findElement(By.id("identifierId")).sendKeys("xxx.yyy@gmail.com");
		
		Thread.sleep(2000);
	
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshot.png");

        FileUtils.copyFile(src, dest);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("identifierId")).sendKeys("xxx.yyy@gmail.com",Keys.ENTER);
		
		Thread.sleep(1000);
		
        driver.navigate().back();
		
        Thread.sleep(1000);
		

        driver.navigate().back();
        
        driver.quit();
		
			
	
	
	}

}
