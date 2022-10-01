package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Automation {
	
WebDriver driver;


@Test
public void search() {
	
	driver.get("http://amazon.com");
	WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
	searchElement.sendKeys("realme pods");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
}



@Test
public void addtocart() {
	
	driver.get("https://www.amazon.in/realme-Active-Noise-Cancellation-Earphones/dp/B091G8TJ33/ref=sr_1_2?crid=17KSLUZ28WZZZ&keywords=realme%2Bpods&qid=1664629504&qu=eyJxc2MiOiI0Ljk0IiwicXNhIjoiNC45MiIsInFzcCI6IjMuMTgifQ%3D%3D&sprefix=realme%2Bpads%2Caps%2C357&sr=8-2&th=1");
	driver.findElement(By.name("submit.add-to-cart")).click();

	
}




@Test
public void login() {
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.name("email")).sendKeys("tejaswi123@gmail.com");
		driver.findElement(By.id("continue")).submit();
		
		
	}



  @Test
  public void register() {
	  
	  	driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_em_hd_re_signin&prevRID=X0PWH6ZFC1NW9PMJWVG3&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.name("customerName")).sendKeys("tejaswi");	
		driver.findElement(By.name("email")).sendKeys("tejaswi123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("tejaswi@123");
		driver.findElement(By.name("passwordCheck")).sendKeys("tejaswi@123");
		driver.findElement(By.id("continue")).submit();	
 }
  
  

  
  @BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\JavaFSD\\phase5\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
  
  
  
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
}