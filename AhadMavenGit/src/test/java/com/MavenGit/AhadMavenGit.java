package com.MavenGit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AhadMavenGit {

	public static void main(String[] args) {
		WebDriver chromedriver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		chromedriver.get("https://wwwapps.ups.com/doapp/signup");
		chromedriver.manage().window().maximize();
		chromedriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Three 3types of wait --Implicit, explicit, fluent wait;
		System.out.println(chromedriver.getTitle());
		
		WebElement cookies = chromedriver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button/span[1]"));
		cookies.click();
		
		//WebElement name=chromedriver.findElement(By.xpath("//*[@id=\"ups-full_name_input\"]")); 
		WebElement name=chromedriver.findElement(By.xpath("//*[contains(@id,'ups-full_name_input')]")); //dynamic x path
		name.sendKeys("Ahadzaman");  
		
		WebElement email=chromedriver.findElement(By.xpath("//*[@id=\"ups-email_input\"]"));
		email.sendKeys("md.ahadzaman@gmail.com");
		WebElement userid=chromedriver.findElement(By.xpath("//*[@id=\"ups-user_id_input\"]"));
		userid.sendKeys("ahadzaman");
		WebElement password=chromedriver.findElement(By.xpath("//*[@id=\"ups-user_password_input\"]"));
		password.sendKeys("Abfghcd1237#");
		Select country=new Select(chromedriver.findElement(By.xpath("//*[@id=\"main\"]/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[3]/div/div[1]/div/select")));
		country.selectByVisibleText(" US +1 ");
		WebElement phone=chromedriver.findElement(By.xpath("//*[@id=\"ups-phone_input\"]"));
		phone.sendKeys("6563253365");
		WebElement checkbox=chromedriver.findElement(By.xpath("//*[@id=\"ups-checkbox_group\"]/div/label")); 
		checkbox.click();
		//JavascriptExecutor js = (JavascriptExecutor)chromedriver;  //javaScript Executor
		//js.executeScript("arguments[0].click();", checkbox);
		WebElement submitbutton=chromedriver.findElement(By.xpath("//*[@id=\"main\"]/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[4]/div[3]/div/button"));
		submitbutton.click();
		
		JavascriptExecutor js = (JavascriptExecutor)chromedriver;
		js.executeScript("alert('My code has been successfully executed! #AUTHOR: MD AHAD ZAMAN RONY');"); 

	}

}
