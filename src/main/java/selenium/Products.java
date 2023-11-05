package selenium;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Products {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print link of first 10 elements
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement linksElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//driver.manage().timeouts().implicitlyWait(Duration.of);
		
		linksElement.sendKeys("Kolhapuri Chappal");
		
		//Thread.sleep(1000);
//		//webdriver/Explicit wait 
		WebDriverWait webDriverWait= new WebDriverWait(driver,Duration.ofMinutes(10));
		webDriverWait.until(ExpectedConditions.visibilityOf(linksElement));
	 
		
		//implicit wait
		Wait wait1 = new FluentWait(driver)
				.withTimeout(Duration.ofMinutes(10))
				.pollingEvery(Duration.ofMinutes(10))
				.ignoring(NoSuchElementException.class);

		 WebElement element1 = (WebElement) wait1.until(ExpectedConditions.visibilityOf(linksElement));

		  
		
		
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		WebElement buttonElement = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));;
		webDriverWait.until(ExpectedConditions.visibilityOf(buttonElement));
		buttonElement.click();
        
        driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        List<WebElement> el = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        
        for(int i=0;i<10;i++) 
        {
         String S = el.get(i).getAttribute("href");
         
         System.out.println(S);
        }
        
		
	}

}
