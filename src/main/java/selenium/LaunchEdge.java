package selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class LaunchEdge {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		WebElement tab =driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
//		action.moveToElement(tab).clickAndHold(tab).moveToElement(dropElement).release().perform();
		action.dragAndDrop(tab, dropElement).perform();
		
		WebElement Dclick=driver.findElement(By.xpath("//div[@id='double-click']"));
	    action.doubleClick(Dclick).build().perform();	
	    
	   WebElement hoverElement = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
	   action.moveToElement(hoverElement).perform();
	   
	   File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   Files.copy(f, new File("C:\\Screen\\s.png"));
	}

}
