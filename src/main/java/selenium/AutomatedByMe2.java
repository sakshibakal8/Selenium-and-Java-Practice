package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomatedByMe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriver driver = new EdgeDriver();
//		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
//		
//	    WebElement popup = driver.findElement(By.xpath("//span[@id='button4']"));
//	    popup.click();
//	    try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    Alert alert = driver.switchTo().alert();
//		alert.dismiss();	}
		WebDriver driver = new EdgeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		WebElement file = driver.findElement(By.xpath("//input[@id='myFile']"));
		String path = "C:\\Users\\sbakal\\Downloads\\sampleBaklu.txt";
		file.sendKeys(path);
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
		submit.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
}
}
