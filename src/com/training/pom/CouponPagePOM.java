package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CouponPagePOM {
	 WebDriver driver; 
	
	public CouponPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Coupon name
	@FindBy(id="input-name")
	private WebElement couponName;
	
	public void sendCouponName(String couponName1) {
		this.couponName.clear();
		this.couponName.sendKeys(couponName1);
	}
	
	//Code text box
	@FindBy(id="input-code")
	private WebElement code;
	
	public void sendCode(String code1) {
		this.code.clear(); 
		this.code.sendKeys(code1); 
	}
	
	//Discount text box
	@FindBy(id="input-discount")
	private WebElement discount;
	
	public void sendDiscount(String discount1) {
		this.discount.clear(); 
		this.discount.sendKeys(discount1); 
	}
	
	//Products drop down
	@FindBy(xpath="//input[@id='input-product']")
	private WebElement productLink;
	
	public void sendProductlink(String productLink1) {
		this.productLink.clear();
		this.productLink.sendKeys(productLink1);
		driver.findElement(By.xpath("//a[text()='Blazer Girls(7-8)']")).click();
	}
	
	//Start date from calendar
		@FindBy(xpath="(//span[@class='input-group-btn'])")
		private WebElement startCalendar;
		
		public void clickstartCalendar() { 
			this.startCalendar.click();
		}
		
		//Select Start Date
		@FindBy(xpath="(//div[@class='datepicker-days']//td[@class='day active today'])")
		private WebElement startdate;
		
		public void clickstartDate() { 
			this.startdate.click();
		}	
		
		//End date from calendar 
		@FindBy(xpath="(//span[@class='input-group-btn'])[2]")
		private WebElement endCalendar;
		
		public void clickendCalendar() { 
			this.endCalendar.click();
		}
}