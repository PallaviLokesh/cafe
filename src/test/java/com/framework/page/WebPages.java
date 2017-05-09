package com.framework.page;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebPages {
	
	WebDriver driver;	
	
	By UN = By.xpath("//*[@id='login-form']/fieldset/label[1]/input");
    By PWD = By.xpath("//*[@id='login-form']/fieldset/label[2]/input");
    By Btnlogin = By.xpath(".//*[@id='login-form']/fieldset/button");
   
    By BtnLogout = By.xpath("/html/body/div/header/div/p[1]");
	
    By Create = By.xpath("//*[@id='bAdd']");
	By Cancel = By.xpath("//*[@id='sub-nav']/li/a");
	By FN = By.xpath("/html/body/div/div/div/form/fieldset/label[1]/input");
	By LN = By.xpath("/html/body/div/div/div/form/fieldset/label[2]/input");
	By StartDate = By.xpath("/html/body/div/div/div/form/fieldset/label[3]/input");
	By Email = By.xpath("/html/body/div/div/div/form/fieldset/label[4]/input");
	By Btnadd = By.xpath("/html/body/div/div/div/form/fieldset/div/button[2]");
	By EmpList = By.xpath("//*[@id='employee-list']/li");
	
	public WebPages (WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	// To test login feature
	public void Login() throws InterruptedException
	{
		
		driver.findElement(UN).click();
		driver.findElement(UN).sendKeys("Luke");
		
		driver.findElement(PWD).click();
		driver.findElement(PWD).sendKeys("Skywalker");
		
		driver.findElement(Btnlogin).click();
		
		boolean BtnLogoutPresent = driver.findElement(BtnLogout).isDisplayed();
		
			if (BtnLogoutPresent==true)
			{
				System.out.println(" Was able to login successfully");
			}
			else
				System.out.println(" Was not able to login successfully");
		
	}
	
	// To test logout feature
	public void Logout() throws InterruptedException
	{
		driver.findElement(BtnLogout).click();
		Thread.sleep(10000);
		boolean BtnLogoutPresent = driver.findElement(BtnLogout).isDisplayed();
		
		if (BtnLogoutPresent==true)
		{
			System.out.println(" Was not able to Logout successfully");
		}
		else
			System.out.println(" Was  able to Logout successfully");
		
		
		
	}
	
	// To create a new one
	public void Create()
	{
		driver.findElement(Create).click();
		
		driver.findElement(FN).sendKeys("Test1");
		driver.findElement(LN).sendKeys("Test11");
		driver.findElement(StartDate).sendKeys("2017-05-09");
		driver.findElement(Email).sendKeys("Test11@Test1.com");
		driver.findElement(Btnadd).click();
		
	
		
	}
	
	
}
