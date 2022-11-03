package festivals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Festivals {
	
	WebDriver driver;
	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	}
  @Test
  public void f() {
	  driver.get("http://localhost:4200/festivals");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
	  driver.getTitle();
	  
	  List<WebElement> b = driver.findElements(By.xpath("li"));
	  WebElement bands;
	  System.out.println("Number of Bands :" + b.size());
	  for(int i=0; i<b.size(); i++) {
		  bands = b.get(i);
		  
		  System.out.println(bands.getText());
	  }
	//  System.out.println("Number of Bands :" + b.size());
	//  for (WebElement bands : b) {
    	
		  	
	 List<WebElement> S = driver.findElements(By.xpath("//ul/li"));
	 System.out.println("Number of Songs :" +S.size());
	  for(WebElement Songs : S) {
		  System.out.println(Songs.getText());
	  }}

	  

  @AfterClass
  public void teardown() {
  	driver.quit();
  }
}
