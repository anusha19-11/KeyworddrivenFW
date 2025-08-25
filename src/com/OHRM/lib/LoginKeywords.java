package com.OHRM.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginKeywords {
	WebDriver driver;

	public void launchBrowser() {
		driver = new ChromeDriver();
		System.out.println("Launched Chrome browser");
	}

	public void navigateURL() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("ORangeHRM project opened");
	}

	public void enterUsername() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		System.out.println("Entered username");
	}

	public void enterPassword() {
		driver.findElement(By.name("password")).sendKeys("admin123");
		System.out.println("Entered password");
	}

	public void clickLogin() {
		driver.findElement(By.xpath("//button[@type='submit’]")).click();
		System.out.println("cliked on 'submit' button");
	}

}
