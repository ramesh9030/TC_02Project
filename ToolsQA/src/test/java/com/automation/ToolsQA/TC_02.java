package com.automation.ToolsQA;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {
	WebDriver driver;
	public void DisplayAlertBox() throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	// alert box
	driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
	Alert alert = driver.switchTo().alert();
	 String textMessage= driver.switchTo().alert().getText();
	 
	 System.out.println(textMessage);
	 if (textMessage.contains("You clicked a button"))
       {
           System.out.println(textMessage);    
       }
	 alert.accept();
	 //Alert with OK & Cancel
	 driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]")).click();
	 
	 Alert alert1 = driver.switchTo().alert();
	 String textMessage1= driver.switchTo().alert().getText();
	 
	 System.out.println(textMessage1);
	 if (textMessage1.contains("You clicked a button"))
       {
           System.out.println(textMessage1);    
       }
	 alert1.accept();
	//Alert with Textbox
	 driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
	 Alert alert2 = driver.switchTo().alert();
		
	  driver.switchTo().alert().getText();
	 
	 alert2.accept();	

 driver.close();
	 
	 
}
}
