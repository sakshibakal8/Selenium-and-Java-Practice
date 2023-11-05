package selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchCrome {
	
	public static void main(String args[])
	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sbakal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.Facebook.com");
	    System.out.println(driver.getTitle());
//	    driver.navigate().to("https://www.facebook.com");
//	    driver.navigate().back();
	    
	    driver.getWindowHandle();
	    Set<Object> Ids = new HashSet<Object>();
//	    driver.manage();
	    
	    Set<String> Idss = driver.getWindowHandles();
	    
	    for(String S :Idss )
	    {
	      driver.switchTo().window(S);
	      String title=driver.getTitle();
	      System.out.println(title);
	      
	      if(title.equals("Facebook"))
	      {
	    	  break;
	      }
	    }
	    
	    driver.findElement(By.xpath("(//div[@class='react-contextmenu-wrapper']//span[text()='Site-3'])[2]//parent::label//preceding-sibling::img//parent::div[@class='react-contextmenu-wrapper']")).getAttribute("href");
	    driver.findElements(By.xpath("//a"));
	    List<String> s1=new ArrayList<String>();
	    List<WebElement> Wb =  driver.findElements(By.xpath("//a"));
	    
	    
	    //Handle popups
	    Alert alert = driver.switchTo().alert();
	    alert.getText();
	    WebElement country = driver.findElement(By.xpath(""));
	    
	    //select dropdown
	    Select select = new Select(country);
	    select.selectByVisibleText("India");	
	    
	    
	    for(WebElement Web: Wb )
	    {
	    	Web.getAttribute("href");
	    	String Prop = Web.getAttribute("href");
			
			if(!Prop.contains("https"))
			{
				s1.add(Prop);
				
			}
	    System.out.println(s1);	 
	    
	    
	    }
	    //	    WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
//	    searchBar.sendKeys("Saree");
//	    
//	    WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
//	    searchButton.click();
	    
//	    WebElement searchBar1 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
//	    searchBar1.sendKeys("Paijama for mens");
//	    
//	    WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
//	    searchButton.click();
//	    
//	    WebElement clickItem = driver.findElement(By.xpath("//*[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
//	    clickItem.click();
//	    (//div[@class='react-contextmenu-wrapper']//img[@role='presentation']//following-sibling::label//span[text()='Site-3'])[2]
	
//	    		(//*[@class='react-contextmenu-wrapper']//span[text()='Site-3'])[2]//parent::label//preceding-sibling::img//parent::div[@class='react-contextmenu-wrapper']
	}

	
	
}
