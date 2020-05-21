package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePagePOM {	
	WebDriver driver; 
	public HomePagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Sales icon link 
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fa-fw']")
	private WebElement saleslink;
	
	public void clickSalesLink() {
		this.saleslink.click(); 
	}

	//Return link
	@FindBy(xpath="//li[@id='sale']//ul//li//a[contains(text(),'Returns')]")
	private WebElement returnlink;
	
	public void clickReturnLink() {
		this.returnlink.click(); 
	}

	//Customer icon link
	@FindBy(xpath="//i[@class='fa fa-user fa-fw']")
	private WebElement customerlink;
	
	public void clickCustomerLink() {
		this.customerlink.click(); 
	}

	//Customers link
	@FindBy(xpath="//li[@id='customer']//ul//li//a[contains(text(),'Customers')]")
	private WebElement customer;	
	
	public void clickCustomer() {
		this.customer.click(); 
	}
	
	//Catalog icon link
	@FindBy(xpath="//i[@class='fa fa-tags fa-fw']")
	private WebElement catalogicon;	
	
	public void clickCatalogLink() {
		this.catalogicon.click(); 
	}
	
	//Product link
	@FindBy(xpath="//a[contains(text(),'Products')]")
	private WebElement product;	
	
	public void clickProductLink() {
		this.product.click(); 
	}
	
	//Marketing link
	@FindBy(xpath="//i[@class='fa fa-share-alt fa-fw']")
	private WebElement marketlogicon;	
	
	public void clickMarketlogLink() {
		this.marketlogicon.click(); 
	}
	
	//Coupon link
	@FindBy(xpath="//a[contains(text(),'Coupons')]")
	private WebElement coupon;	
	
	public void clickCouponLink() {
		this.coupon.click(); 
	}
}