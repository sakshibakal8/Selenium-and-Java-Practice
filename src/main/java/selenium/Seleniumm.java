package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://redbus.in/?gclid=CjwKCAjwv-2pBhB-EiwAtsQZFPK327rJcMEvMsd-o9o8zDo9rPGw7qZDF1LaDto-gw542EytJj8nghoCWkYQAvD_BwE");
		
		WebElement button1 = driver.findElement(By.xpath("(//div[@class='sc-ifAKCX gLwVlD'])[1]"));
		button1.click();
		
		button1.sendKeys("Bangalore");
		WebElement city = driver.findElement(By.xpath("//li[@class='sc-iwsKbI jTMXri cursorPointing']"));
		city.click();
		
		WebElement button2 = driver.findElement(By.xpath("(//div[@class='sc-ifAKCX gLwVlD'])[2]"));
		button2.click();
		
		button2.sendKeys("Mumbai");
		
		WebElement date = driver.findElement(By.xpath("//div[@id='onwardCal']"));
		date.click();
		
		WebElement dateS = driver.findElement(By.xpath("//div[@class='sc-kAzzGY llxTcS']"));
		dateS.click();
		WebElement dateeElement = driver.findElement(By.xpath("//text[@class='dateText']"));
		dateeElement.click();
		
		WebElement search = driver.findElement(By.xpath("//button[@id='search_button']"));
		search.click();
  		

	}

}
