package com.test.framework.login;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.framework.page.WebPages;
import java.util.concurrent.TimeUnit;
			// RUN THIS CLASS FILE

public class Launchpage {
	
	
	 @Test
	public void launchpage() throws InterruptedException
	{
		
		File classpathRoot = new File(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver" , classpathRoot+ "/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);	
		driver.get("http://cafetownsend-angular-rails.herokuapp.com/login");
		
		WebPages enter = new WebPages(driver);
		
			enter.Login();
		
				Thread.sleep(10000);
			
			enter.Create();
				
				Thread.sleep(10000);
			
			enter.Logout();
				
		    driver.quit();
		
	}

	
}
