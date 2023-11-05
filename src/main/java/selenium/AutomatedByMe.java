package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomatedByMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
//		driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		WebElement buttonElement = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		buttonElement.click();
		
//		WebElement dropdown = driver.findElement(By.xpath("//option[@value='c#']"));
//		dropdown.click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));	
		Select select = new Select(dropdown);
	    select.selectByVisibleText("C#");
		
//		driver.findElement(By.xpath("//input[@value=\"option-4\"]"));
		WebElement checkBoxElement = driver.findElement(By.xpath("//input[@value='option-4']"));
		checkBoxElement.click();
		
//		driver.findElement(By.xpath("//input[@value=\"option-3\']"));
		WebElement checkBoxElement2 = driver.findElement(By.xpath("//input[@value='option-3']"));
		checkBoxElement2.click();
		
//		driver.findElement(By.xpath("//input[@value='option-1']"));
		WebElement button = driver.findElement(By.xpath("//input[@value='option-1']"));
		button.click();
		
//		driver.findElement(By.xpath("//input[@value='green']"));
		WebElement button1 = driver.findElement(By.xpath("//input[@value='green']"));
		button1.click();
		
		
		
		
		
		
//		Select select = new Select(dropdown);
//		select.selectByVisibleText("JAVA");
		
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		WebElement userElement = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
//		userElement.click();
//		userElement.sendKeys("9284466044");	
//		
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		WebElement sendOTP = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
//		sendOTP.click();
	}

}
