package com.Common.practise;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonprograms 
{
	public static void main(String[] args) throws IOException, Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/rk2/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("Hitzz082");
		driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("Admin",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']/a[@href='/rk2/tasks/tasklist.do']")).click();
		driver.findElement(By.xpath("(//div[@class='taskStatusButton editable']/div[@class='open'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='item completedContainer']/div[text()='Completed']")).click();

		String ExpTaskStatus="completed";
		String ActTaskStatus=driver.findElement(By.xpath("(//div[@class='taskStatusButton editable completed']/div[@class='completed'])[1]")).getAttribute("class");

		if (ExpTaskStatus==ActTaskStatus)
		{ System.out.println("Pass"); }
		else
		{ System.out.println("Fail"); }

		/*Users screen*/
		/*driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		driver.findElement(By.xpath(".//*[@id='createUserDiv']/div/div[2]")).click();
		driver.findElement(By.xpath(".//*[@id='usersManagementBodyTagId']/div[11]/div[2]/div[1]/div")).click();
		driver.findElement(By.xpath(".//*[@id='userDataLightBox_firstNameField' and @name='firstName' and @placeholder='First Name']")).sendKeys("DemoAdmin1");
		driver.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("Demo");
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Admin");
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("DemoAdmin@mail.com");

		WebElement Scroll=driver.findElement(By.xpath(".//html"));
		Scroll.sendKeys(Keys.PAGE_DOWN);
		Scroll.sendKeys(Keys.PAGE_DOWN);
		Scroll.sendKeys(Keys.PAGE_DOWN);

		driver.findElement(By.xpath(".//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		WebDriverWait wait= new WebDriverWait(driver,200);
		WebElement close=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='userDataLightBox_accountCreatedSection']/div[5]/span[text()='Close']")));	
		close.click();*/

		//driver.findElement(By.xpath(".//*[@id='createUserDiv']/div/div[2]")).click();
		//driver.findElement(By.xpath(".//*[@id='usersManagementBodyTagId']/div[11]/div[2]/div[1]/div")).click();

		/*logout
		driver.findElement(By.xpath(".//*[@id='logoutLink']")).click();*/


	}
}

