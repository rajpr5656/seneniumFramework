package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test (priority=1)
	public void firstTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickSalesLink();
		loginPOM.clickReturnLink();
		loginPOM.checkbox1();
		loginPOM.deletebtn();
		loginPOM.Okbutton();
		loginPOM.successms();	
		screenShot.captureScreenShot("First");
	}
	@Test (priority=2)
	public void secondTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickCustomerLink();
		loginPOM.clickCustomer();
		loginPOM.entercustName("ABC DEF");
		loginPOM.filterButton();
		screenShot.captureScreenShot("SecondTestCustomerFilter");
		loginPOM.enteremailId("abc123@gmail.com");
		loginPOM.filterButton();
		screenShot.captureScreenShot("SecondTestEmailFilter");
	}
	@Test (priority=3)
	public void thirdTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		loginPOM.clickCustomerLink();
		loginPOM.clickCustomer();
		loginPOM.selectCheckbox("abhi@gmail.com");
		loginPOM.deletebtn();
		loginPOM.Okbutton();
		loginPOM.successms();
		screenShot.captureScreenShot("ThirdTestSelectCheckbox");
	}
}