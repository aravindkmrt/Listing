package org.ListingHomebase;

import java.io.IOException;
import java.util.List;

import org.jsoup.nodes.Document.QuirksMode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Listing extends BaseListing {
	@Test(priority = 1)
	public void user_have_to_enter_into_comunity_matrimony_page() {
		launchBrowser();
driver.manage().deleteAllCookies();
	}

	@Test(priority = 2)
	public void user_have_to_enter_the_login_url() throws Throwable {
		
		loadUrl("https://www.communitymatrimony.com/login/");
		waitingWeb();

	}

	@Test(priority = 3)
	public void user_have_to_enter_valid_username_and_password() {
		driver.findElement(By.xpath("//*[@id='idEmail']")).sendKeys("aravindkmrt@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//*[@id='password']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','Aravind1723')", pass);

	}

	@Test(priority = 4)
	public void user_have_to_click_the_submit_button() {
		driver.findElement(By.xpath("(//*[@value='Login'])[2]")).click();
	}

	@Test(priority = 5,retryAnalyzer=RetryAnalyzerImp.class)
	public void user_have_to_enter_skip() throws Throwable {
		waitingWeb();
		
		driver.findElement(By.xpath("//*[@class=\"clr7 font16\"]"))
				.click();

		
try {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@alt='close']")).click();
} catch (org.openqa.selenium.NoSuchElementException e) {
	System.out.println("Element is not found");
}

		
	try {
		Thread.sleep(5000);
		    driver.findElement(By.xpath("(//*[@class=\"popupclose\"])[2]/img")).click();
				
			
				
		} catch (org.openqa.selenium.NoSuchElementException e) {
		        System.out.println("Element is not found");
		}
	
	}
	
	@Test(priority = 6,retryAnalyzer=RetryAnalyzerImp.class)
	public void user_have_to_click_profile_prefered_aearch() throws Throwable {
	//	try {

		waitingWeb();
		WebElement l1 = driver.findElement(By.xpath("(//*[@class=\"fleft posrelative\"])[4]/a"));
		toMove(l1);
		WebElement sear1 = driver.findElement(By.xpath("(//*[@class=\"clr9\"])[18]"));
		toMove(sear1);
		btnClick(sear1);
		WebElement se1 = driver.findElement(By.xpath("//*[@value=\"Search\"]"));
		downScroll(se1);
		toMove(se1);
		btnClick(se1);
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//	        System.out.println("Element is not found");
//	}
	}
	
	@Test(priority = 7)
	public void user_have_to_click_profile_prefered_bearch() throws Exception {
		try {
			waitingWeb();
		 List<WebElement> ref=driver.findElements(By.xpath("//*[@class=\"clr6 font14  boldtxt\"]"));
	 
	   for (int i = 1; i < 10; i++) {
		waitingWeb();
		   WebElement ref3Element=driver.findElement(By.xpath("(//*[@class=\"clr6 font14  boldtxt\"])["+i+"]"));
			   String abc=ref3Element.getText();
			   System.out.println(abc);
			   
	//		   List<WebElement> ref2=driver.findElements(By.xpath("(//*[@class=\"clr6 font14  boldtxt\"])["+i+"]"));
//		  WebElement a= ref2.get(i);
//			  
	//		 System.out.println(a);	
			   
		
		
		toMove(ref3Element);	
		
		btnClick(ref3Element);
		
		switchWindow(i);		
		Thread.sleep(3000);
		alertAccept1();
		Thread.sleep(3000);
		
			switchWindow(0);
	   } 	
	   
	   
		}
	   catch (org.openqa.selenium.NoSuchElementException e) {
		   System.out.println("Element is not found");
		}
	}
	
	@Test(priority = 10)
	public void user_have_to_click_profile_prefered_first_profile_z() throws Exception {	
		waitingWeb();
		WebElement z12 = driver.findElement(By.xpath("(//*[@class=\"fleft posrelative\"])[1]/a"));
		toMove(z12);
		driver.findElement(By.xpath("(//*[@class=\"clr9\"])[1]")).click();
		 List<WebElement> ref=driver.findElements(By.xpath("//*[@class=\"clr6 font14  boldtxt\"]"));
	 
	   for (int i = 10; i <=20; i++) {
		waitingWeb();
		   WebElement ref3Element=driver.findElement(By.xpath("(//*[@class=\"clr6 font14  boldtxt\"])["+i+"]"));
			   String abc=ref3Element.getText();
			   System.out.println(abc);
			   
	//		   List<WebElement> ref2=driver.findElements(By.xpath("(//*[@class=\"clr6 font14  boldtxt\"])["+i+"]"));	
		   
//		  WebElement a= ref2.get(i);
//			  
	//		 System.out.println(a);
		
		
	
		btnClick(ref3Element);
		
		switchWindow(i);		
		
		
		Thread.sleep(500);
		alertAccept1();
		
	try {
    WebElement m13 = driver.findElement(By.xpath("//*[@class=\"vp-mobileIcon\"]"));
		toMove(m13);
		btnClick(m13);
		screenShot("(mobile click)["+i+"]");
		back();
		Refresh();
		alertAccept1();
} catch (org.openqa.selenium.NoSuchElementException e) {
        System.out.println("Element is not found");
}

	
//		WebElement m13 = driver.findElement(By.xpath("//*[@class=\"vp-mobileIcon\"]"));
//		toMove(m13);
//		btnClick(m13);
//		screenShot("mobile click");
//		back();
//		Refresh();
//		alertAccept1();
	   try {
		   WebElement a13 = driver.findElement(By.xpath("//*[@class=\"vp-horoIcon\"]"));
			toMove(a13);
			btnClick(a13);
			screenShot("(horo click)["+i+"]");
			back();
			Refresh();
			alertAccept1();
		} catch (org.openqa.selenium.NoSuchElementException e) {
		        System.out.println("Element is not found");
		}
		
		
//		WebElement a13 = driver.findElement(By.xpath("//*[@class=\"vp-horoIcon\"]"));
//		toMove(a13);
//		btnClick(a13);
//		screenShot("horo click");
//		back();
//		Refresh();
//		alertAccept1();
		WebElement s13 = driver.findElement(By.xpath("//*[@class=\"vp-shortlistIcon\"]"));
		toMove(s13);
		btnClick(s13);
		
		WebElement al13 = driver.findElement(By.xpath("(//*[@alt=\"a\"])[1]"));
		toMove(al13);
		btnClick(al13);
		
		WebElement y13 = driver.findElement(By.xpath("(//*[@class=\"send-active-btn reply1 ng-scope\"])[1]"));
		toMove(y13);
		btnClick(y13);
		switchWindow(0);	
		
		}
		

		
}
	
	
//	@Test(priority = 11)
//	public void user_have_to_click_profile_prefered_second_profile() throws Exception {
//	try {
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@type='radio' and @value='true']")).click();
//        sleep();
//
//        driver.findElement(By.xpath("//input[@type='submit' and @value='>> valider <<']")).click();
//        sleep();
// } catch (org.openqa.selenium.NoSuchElementException e) {
//           System.out.println("Element is not found");
// }
//}
	
}