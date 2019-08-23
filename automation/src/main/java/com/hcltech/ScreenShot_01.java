package com.hcltech;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ScreenShot_01 {
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "/home/utsav-pc/Downloads/Drivers/Chrome_Driver76/chromedriver");
	 
	  

	  
	  WebDriver d = new ChromeDriver();
	  d.manage().window().maximize();
	  d.get("https://www.hcltech.com/contact-us/customer");
	  
	  
	  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //JavascriptExecutor js = (JavascriptExecutor)d;
	  //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  
	  File srcFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(srcFile, new File("/home/utsav-pc/Downloads/Copy File/s1.png"));
	  //Maven Automation_01
	  
  }
}
