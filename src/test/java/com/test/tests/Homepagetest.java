package com.test.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.pages.homepage;

import Helper.BrowserFactory;


public class Homepagetest extends BrowserFactory{
//	homepage homepage;	
//	
//	@Test	
//	public void Verifylinks() throws InterruptedException{
//		System.out.println(driver);
//		homepage =  new homepage(driver);
//		homepage.hotel_tab();
//		Thread.sleep(3000);
//		homepage.where_input();
//		Thread.sleep(3000);
//		homepage.swiss_europe();
//		Thread.sleep(3000);
//		homepage.checkin();
//		Thread.sleep(3000);
//		homepage.checkout();
//		Thread.sleep(10000);
//		homepage.increase();
//		Thread.sleep(3000);
//		
//	  
////	    homepage.Registerlink();
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("name")));  
////	    AssertJUnit.assertEquals("Create new account", driver.findElement(By.className("name")).getText());
////	    driver.navigate().back();  
//	  }
//	
	homepage homepage;	
	
	@Test	
	public void Verifylinks() throws InterruptedException {
		System.out.println(driver);
		
		homepage = new homepage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(5000);
		homepage.hotel_click();
		Thread.sleep(5000);
		homepage.search("Switzerland");
		Thread.sleep(5000);
		homepage.search_result();
		Thread.sleep(10000);
		homepage.checkin_date();
		Thread.sleep(6000);
		homepage.checkout_date();
		Thread.sleep(6000);
		homepage.room_add();
		homepage.adult_add();
		Thread.sleep(5000);
		homepage.child_add();
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,50)");
		homepage.child_age();
		Thread.sleep(10000);
		homepage.child_ageselect();
		Thread.sleep(2000);
		homepage.update_info();
		Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,950)");
	    Thread.sleep(5000);
	    homepage.two_star();
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,-750)");
	    Thread.sleep(15000);
	    System.out.println(homepage.hotel_name());
	   
		
	}
	

}
