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
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import com.training.pom.LoginPOM;
import com.training.pom.HomePagePOM;
import com.training.pom.RetrunsPagePOM;
import com.training.pom.CustomerPagePOM;
import com.training.pom.ProductsPagePOM;
import com.training.pom.CouponPagePOM;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private HomePagePOM homepagePOM;
	private RetrunsPagePOM retrunspagePOM;
	private CustomerPagePOM customerpagePOM;
	private ProductsPagePOM productspagePOM;
	private CouponPagePOM couponpagePOM;
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
		homepagePOM = new HomePagePOM(driver);
		retrunspagePOM = new RetrunsPagePOM(driver);
		customerpagePOM = new CustomerPagePOM(driver);
		productspagePOM = new ProductsPagePOM(driver);
		couponpagePOM = new CouponPagePOM(driver);
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
/*	@Test (priority=1)
	public void firstTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		homepagePOM.clickSalesLink();
		homepagePOM.clickReturnLink();
		retrunspagePOM.checkbox1();
		retrunspagePOM.deletebtn();
		retrunspagePOM.Okbutton();
		retrunspagePOM.successms();	
		screenShot.captureScreenShot("First");
	}
	
	@Test (priority=2)
	public void secondTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		homepagePOM.clickCustomerLink();
		homepagePOM.clickCustomer();
		customerpagePOM.entercustName("ABC DEF");
		customerpagePOM.filterButton();
		screenShot.captureScreenShot("SecondTestCustomerFilter");
		customerpagePOM.enteremailId("abc123@gmail.com");
		customerpagePOM.filterButton();
		screenShot.captureScreenShot("SecondTestEmailFilter");
	}
	@Test (priority=3)
	public void thirdTest() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		homepagePOM.clickCustomerLink();
		homepagePOM.clickCustomer();
		customerpagePOM.selectCheckbox("abhi12@gmail.com");
		retrunspagePOM.deletebtn();
		retrunspagePOM.Okbutton();
		retrunspagePOM.successms();
		screenShot.captureScreenShot("ThirdTestSelectCheckbox");
	}*/
	@Test (priority=4)
	public void discountexistingproduct() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		homepagePOM.clickCatalogLink();
		homepagePOM.clickProductLink();
		productspagePOM.productEditbutton();
		productspagePOM.clickDataTab();
		productspagePOM.Quantitytextbox("30");
		productspagePOM.clickDiscountTab();
		productspagePOM.clickAddDiscount();
		productspagePOM.Quantitydtextbox("1");
		productspagePOM.Pricetextbox("50");
		productspagePOM.clickstartCalendar();
		productspagePOM.clickendCalendar();
		productspagePOM.clickendDate();
		productspagePOM.savebutton();
		retrunspagePOM.successms();
		screenShot.captureScreenShot("UNF_056_Discountexistingproduct");
	}	
	@Test (priority=5)
	public void discountaddproduct() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		homepagePOM.clickCatalogLink();
		homepagePOM.clickProductLink();
		productspagePOM.addbutton();
		productspagePOM.sendproductName("Shoes");
		productspagePOM.sendMegatagName("Shoes for students");
		productspagePOM.clickDataTab();
		productspagePOM.sendModelName("SHS-103");
		productspagePOM.sendpricemodel("1000");
		productspagePOM.sendquantitymodel("20");
		productspagePOM.clickLinkTab();
		productspagePOM.sendcategorylink("Sports Uniform");
		productspagePOM.clickDiscountTab();
		productspagePOM.clickAddDiscount();
		productspagePOM.Quantitydtextbox("2");
		productspagePOM.Pricetextbox("1000");
		productspagePOM.clickstartCalendar();
		productspagePOM.clickstartDate();
		productspagePOM.clickendCalendar();
		productspagePOM.clickendDate1();
		productspagePOM.savebutton();
		retrunspagePOM.successms();
		screenShot.captureScreenShot("UNF_057_Discountaddproduct");
	}
	@Test (priority=6)
	public void couponsonproduct() {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		homepagePOM.clickMarketlogLink();
		homepagePOM.clickCouponLink();
		productspagePOM.addbutton();
		couponpagePOM.sendCouponName("Gift Voucher");
		couponpagePOM.sendCode("GVV");
		couponpagePOM.sendDiscount("200");
		couponpagePOM.sendProductlink("Blazer Girls");
		couponpagePOM.clickstartCalendar();
		couponpagePOM.clickstartDate();
		couponpagePOM.clickendCalendar();
		couponpagePOM.clickendCalendar();
		productspagePOM.savebutton();
		retrunspagePOM.successms();
		screenShot.captureScreenShot("UNF_058_Discountaddproduct");
	}
}