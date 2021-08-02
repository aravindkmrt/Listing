package org.ListingHomebase;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.jsoup.nodes.Document.QuirksMode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class listing1 extends BaseListing {
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
		driver.findElement(By.xpath("//*[@id='idEmail']")).sendKeys("MRT641772");
		WebElement pass = driver.findElement(By.xpath("//*[@id='password']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','cbstest')", pass);

	}

	@Test(priority = 4)
	public void user_have_to_click_the_submit_button() {
		driver.findElement(By.xpath("(//*[@value='Login'])[2]")).click();
	}

	@Test(priority = 5, retryAnalyzer = RetryAnalyzerImp.class)
	public void user_have_to_enter_skip() throws InterruptedException, AWTException {
pageLoadTime();
alertAccept2();
		// WebElement sk = driver.findElement(By.xpath("//*[@class=\"clr7 font16\"]"));
		// toMove(sk);
		// btnClick(sk);
		// WebElement sk1 = driver.findElement(By.xpath("//*[@class=\"clr7 font16\"]"));
		// boolean b = sk1.isDisplayed();
		// if (b==true) {
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@class=\"clr7 font16\"]")).click();
		// }
		Thread.sleep(6000);
		alertAccept1();

	}

	@Test(priority = 6, retryAnalyzer = RetryAnalyzerImp.class)
	public void user_have_to_click_profile_prefered_aearch() throws Exception {
		waitingWeb();
		WebElement l1 = driver.findElement(By.xpath("(//*[@class='fleft posrelative'])[4]/a"));
		toMove(l1);
		WebElement sear1 = driver.findElement(By.xpath("(//*[@class=\"clr9\"])[18]"));
		toMove(sear1);
		btnClick(sear1);
		WebElement se1 = driver.findElement(By.xpath("//*[@value=\"Search\"]"));
		downScroll(se1);
		toMove(se1);
		btnClick(se1);
	}

	@Test(priority = 7)
	public void user_have_to_click_profile_prefered_bearch() throws Exception {

		waitingWeb();
		for (int i = 1, j = 1; i < 10; i++, j++) {
			waitingWeb();
			WebElement ref3Element = driver.findElement(By.xpath("(//*[@class=\"clr6 font14  boldtxt\"])["+i+"]"));
			String abc = ref3Element.getText();
			System.out.println(abc);
			toMove(ref3Element);
			btnClick(ref3Element);
			switchWindow(i);
			Thread.sleep(3000);
			alertAccept1();
			Thread.sleep(3000);

			switchWindow(0);
		}

	}

	@Test(priority = 8, retryAnalyzer = RetryAnalyzerImp.class)
	public void user_have_to_click_profile_prefered_March() throws Throwable {
		waitingWeb();
		WebElement z12 = driver.findElement(By.xpath("(//*[@class=\"fleft posrelative\"])[1]/a"));
		toMove(z12);
		driver.findElement(By.xpath("(//*[@class=\"clr9\"])[1]")).click();
	}
	
	@Test(priority = 9)
	public void user_have_to_click_profile_prefered_first_profile_viewed() throws Throwable {
		waitingWeb();
		for (int i = 10, j = 1; i < 20; i++, j++) {
			switchWindow(0);
			Thread.sleep(4000);
			WebElement ref3Element = driver.findElement(By.xpath("(//*[@class=\"clr6 font14  boldtxt\"])["+j+"]"));
			String abc = ref3Element.getText();
			System.out.println(abc);
			toMove(ref3Element);
			btnClick(ref3Element);
			switchWindow(i);
			Thread.sleep(4000);
			alertAccept1();
			try {
				waitingWeb();
				WebElement m13 = driver.findElement(By.xpath("//*[@class=\"vp-mobileIcon\"]"));
				toMove(m13);
				btnClick(m13);
				// WebElement c1 =
				// driver.findElement(By.xpath("//*[@class=\"gmg_chat_close\"]"));
				// boolean d1 = c1.isDisplayed();
				// if (d1==true) {
				// toMove(c1);
				// btnClick(c1);
				// Thread.sleep(3000);
				// }
				screenShot("(mobile clickj1)["+abc+"]");
				back();
				Thread.sleep(4000);
				Refresh();
				alertAccept1();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found mobileicon"+abc);
			}
			try {
				waitingWeb();
				WebElement a13 = driver.findElement(By.xpath("//*[@class=\"vp-horoIcon\"]"));
				toMove(a13);
				btnClick(a13);
				back();
				Thread.sleep(4000);
				Refresh();
				alertAccept1();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found horoicon"+abc);
			}
			Thread.sleep(4000);
			try {
				WebElement s13 = driver.findElement(By.xpath("//*[@class=\"vp-shortlistIcon\"]"));
				toMove(s13);
				btnClick(s13);

				WebElement al13 = driver.findElement(By.xpath("(//*[@alt=\"a\"])[1]"));
				toMove(al13);
				btnClick(al13);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found shortlisticon"+abc);
			}
			try {
				WebElement y13 = driver.findElement(By.xpath("(//*[@class=\"send-active-btn reply1 ng-scope\"])[1]"));
				toMove(y13);
				btnClick(y13);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found interest" + abc);
			} catch (org.openqa.selenium.ElementNotInteractableException e) {
				System.out.println("Element is not found interest" + abc);
			}
		}
		alertAccept1();
		Thread.sleep(4000);
		switchWindow(0);
	}
	

	@Test(priority = 11, retryAnalyzer = RetryAnalyzerImp.class)
	public void user_have_to_click_profile_prefered_shortlist() throws Throwable {
		waitingWeb();
		pageLoadTime();
		WebElement z12 = driver.findElement(By.xpath("(//*[@class=\"fleft posrelative\"])[1]/a"));
		toMove(z12);
		driver.findElement(By.xpath("(//*[@class=\"clr9\"])[2]")).click();
	}

	@Test(priority = 12)
	public void user_have_to_click_profile_prefered_first_profile_shorlist() throws Throwable  {
		waitingWeb();


		for (int i=20,j=1; i<30; i++,j++) {
			WebElement shortl = driver.findElement(By.xpath("(//*[@class=\"clr6 font14  boldtxt\"])["+j+"]"));
			String abc = shortl.getText();
			System.out.println(abc);
			WebElement shortlist = driver.findElement(By.xpath("(//*[@class=\"fleft padl10\"])["+j+"]"));

			toClick(shortlist);
			switchWindow(i);
			Thread.sleep(5000);
			alertAccept1();

			try {
				waitingWeb();
				WebElement m14 = driver.findElement(By.xpath("(//*[@class=\"send-active-btn reply1\"])[1]"));

				toMove(m14);
				btnClick(m14);
				getScreenshot(driver,"(mobile click1)["+abc+"]");
				back();
				Thread.sleep(4000);
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found send mail" + abc);
			}
			try {
				waitingWeb();
				WebElement m13 = driver.findElement(By.xpath("//*[@class=\"vp-mobileIcon\"]"));
				toMove(m13);
				btnClick(m13);
				screenShot("(mobile clickj1)[" + abc + "]");
				back();
				Thread.sleep(4000);
				Refresh();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found mobileicon" + abc);
			}
			try {
				waitingWeb();
				WebElement a13 = driver.findElement(By.xpath("//*[@class=\"vp-horoIcon\"]"));
				toMove(a13);
				btnClick(a13);
				screenShot("(horo clickj1)[" + j + "]");
				back();
				Thread.sleep(4000);
				Refresh();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found horoicon" + abc);
			}
			Thread.sleep(4000);
			switchWindow(0);
			try {
				Thread.sleep(4000);
				waitingWeb();
				WebElement m13 = driver.findElement(By.xpath("(//*[@class=\"msg1-on\"])[" + j + "]"));
				toMove(m13);
				btnClick(m13);
				back();
				
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found msg");
			}
			Thread.sleep(5000);
			try {
				waitingWeb();

				WebElement s13 = driver.findElement(By.xpath("(//*[@class=\"send-active-btn reply\"])["+j+ "]"));
				toMove(s13);
				btnClick(s13);
				alertAccept1();
				WebElement s14 = driver.findElement(By.xpath("(//*[@class=\"popupclose popup-close-off\"])[5]"));

				toMove(s14);
				btnClick(s14);
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found remainder"+ abc);
			}
			Thread.sleep(4000);
		}

		Thread.sleep(6000);

	}

	@Test(priority = 13, retryAnalyzer = RetryAnalyzerImp.class)
	public void user_have_to_click_profile_prefered_mobileview() throws Throwable {
		Thread.sleep(3000);
		waitingWeb();
		pageLoadTime();
		WebElement z12 = driver.findElement(By.xpath("(//*[@class=\"fleft posrelative\"])[1]/a"));
		toMove(z12);
		driver.findElement(By.xpath("(//*[@class=\"clr9\"])[3]")).click();
	}

	@Test(priority = 14)
	public void user_have_to_click_profile_prefered_first_profile_mobile() throws Throwable {
		waitingWeb();

		List<WebElement> ref = driver.findElements(By.xpath("//*[@class=\"clr6 font14  boldtxt\"]"));

		for (int i = 30, j = 1; i < 40; i++, j++) {

			switchWindow(0);
			WebElement mobile = driver.findElement(By.xpath("(//*[@class=\"clr1 font16 boldtxt padr8\"])[" + j + "]"));
			String abc = mobile.getText();
			System.out.println(abc);
			Thread.sleep(4000);
			try {
				waitingWeb();
				WebElement m13 = driver.findElement(By.xpath("(//*[@class=\"srch1 phone-icon1-on\"])[" + j + "]"));

				toMove(m13);
				btnClick(m13);
				back();
				Thread.sleep(4000);
				Refresh();
				alertAccept1();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found phone icon" + abc);
			}
			try {
				waitingWeb();
				WebElement a13 = driver.findElement(By.xpath("(//*[@class=\"srch1 horo-off\"])[" + j + "]"));
				toMove(a13);
				btnClick(a13);
				alertAccept1();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found phone click" + abc);
			}
			Thread.sleep(4000);

			// List<WebElement> ref2=driver.findElements(By.xpath("(//*[@class=\"clr6 font14
			// boldtxt\"])["+i+"]"));

			// WebElement a= ref2.get(i);
			//
			// System.out.println(a);
			WebElement mobile1 = driver.findElement(By.xpath("(//*[@class=\"clr6 boldtxt\"])[" + j + "]"));
			btnClick(mobile1);
			switchWindow(i);
			Thread.sleep(4000);
			alertAccept1();
			try {
				waitingWeb();
				WebElement m13 = driver.findElement(By.xpath("//*[@class=\"vp-mobileIcon\"]"));
				toMove(m13);
				btnClick(m13);
				// WebElement c1 =
				// driver.findElement(By.xpath("//*[@class=\"gmg_chat_close\"]"));
				// boolean d1 = c1.isDisplayed();
				// if (d1==true) {
				// toMove(c1);
				// btnClick(c1);
				// Thread.sleep(3000);
				// }
				screenShot("(mobile clickj1)[" + abc + "]");
				back();
				Thread.sleep(4000);
				Refresh();
				alertAccept1();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found mobileicon" + abc);
			}
			try {
				waitingWeb();
				WebElement a13 = driver.findElement(By.xpath("//*[@class=\"vp-horoIcon\"]"));
				toMove(a13);
				btnClick(a13);
				// WebElement c1 =
				// driver.findElement(By.xpath("//*[@class=\"gmg_chat_close\"]"));
				// boolean d1 = c1.isDisplayed();
				// if (d1==true) {
				// toMove(c1);
				// btnClick(c1);
				// Thread.sleep(3000);
				// }
				screenShot("(horo clickj1)[" + j + "]");
				back();
				Thread.sleep(4000);
				Refresh();
				alertAccept1();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found horoicon" + abc);
			}
			Thread.sleep(4000);
			try {
				WebElement s13 = driver.findElement(By.xpath("//*[@class=\"vp-shortlistIcon\"]"));
				toMove(s13);
				btnClick(s13);

				WebElement al13 = driver.findElement(By.xpath("(//*[@alt=\"a\"])[1]"));
				toMove(al13);
				btnClick(al13);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found shortlisticon" + abc);
			}
			try {
				WebElement y13 = driver.findElement(By.xpath("(//*[@class=\"send-active-btn reply1 ng-scope\"])[1]"));
				toMove(y13);
				btnClick(y13);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found interest" + abc);
			} catch (org.openqa.selenium.ElementNotInteractableException e) {
				System.out.println("Element is not found interest" + abc);
			}
		}
		alertAccept1();
		Thread.sleep(4000);
			

	}

	@Test(priority = 16, retryAnalyzer = RetryAnalyzerImp.class)
	public void user_have_to_click_profile_prefered_Who_viewed_my_profile() throws Throwable {
		waitingWeb();
		pageLoadTime();
		WebElement z12 = driver.findElement(By.xpath("(//*[@class=\"fleft posrelative\"])[1]/a"));
		toMove(z12);
		driver.findElement(By.xpath("(//*[@class=\"clr9\"])[5]")).click();
	}

	@Test(priority = 17)
	public void user_have_to_click_profile_prefered_first_profile_who_viewed_myprofile() throws Throwable {
		waitingWeb();

		List<WebElement> ref = driver.findElements(By.xpath("//*[@class=\"clr6 font14  boldtxt\"]"));

		for (int i = 40, j = 1; i < 50; i++, j++) {
			switchWindow(0);
			Thread.sleep(4000);
			WebElement ref3Element = driver.findElement(By.xpath("(//*[@class=\"clr6 font14  boldtxt\"])[" + j + "]"));
			String abc = ref3Element.getText();
			System.out.println(abc);

			// List<WebElement> ref2=driver.findElements(By.xpath("(//*[@class=\"clr6 font14
			// boldtxt\"])["+i+"]"));

			// WebElement a= ref2.get(i);
			//
			// System.out.println(a);

			btnClick(ref3Element);

			switchWindow(i);

			Thread.sleep(4000);
			alertAccept1();

			try {
				waitingWeb();
				WebElement m13 = driver.findElement(By.xpath("//*[@class=\"vp-mobileIcon\"]"));
				toMove(m13);
				btnClick(m13);
				// WebElement c1 =
				// driver.findElement(By.xpath("//*[@class=\"gmg_chat_close\"]"));
				// boolean d1 = c1.isDisplayed();
				// if (d1==true) {
				// toMove(c1);
				// btnClick(c1);
				// Thread.sleep(3000);
				// }
				screenShot("(mobile clickj1)[" + abc + "]");
				back();
				Thread.sleep(4000);
				Refresh();
				alertAccept1();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found mobileicon" + abc);
			}
			try {
				waitingWeb();
				WebElement a13 = driver.findElement(By.xpath("//*[@class=\"vp-horoIcon\"]"));
				toMove(a13);
				btnClick(a13);
				// WebElement c1 =
				// driver.findElement(By.xpath("//*[@class=\"gmg_chat_close\"]"));
				// boolean d1 = c1.isDisplayed();
				// if (d1==true) {
				// toMove(c1);
				// btnClick(c1);
				// Thread.sleep(3000);
				// }
				screenShot("(horo clickj1)[" + j + "]");
				back();
				Thread.sleep(4000);
				Refresh();
				alertAccept1();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found horoicon" + abc);
			}
			Thread.sleep(4000);
			try {
				WebElement s13 = driver.findElement(By.xpath("//*[@class=\"vp-shortlistIcon\"]"));
				toMove(s13);
				btnClick(s13);

				WebElement al13 = driver.findElement(By.xpath("(//*[@alt=\"a\"])[1]"));
				toMove(al13);
				btnClick(al13);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found shortlisticon" + abc);
			}
			try {
				WebElement y13 = driver.findElement(By.xpath("(//*[@class=\"send-active-btn reply1 ng-scope\"])[1]"));
				toMove(y13);
				btnClick(y13);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("Element is not found interest" + abc);
			} catch (org.openqa.selenium.ElementNotInteractableException e) {
				System.out.println("Element is not found interest" + abc);
			}
		}
		alertAccept1();
		Thread.sleep(4000);
		switchWindow(0);
	}

}
