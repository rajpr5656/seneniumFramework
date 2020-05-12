package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement userName; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fa-fw']")
	private WebElement saleslink;

	@FindBy(xpath="//i[@class='fa fa-user fa-fw']")
	private WebElement customerlink;
	
	@FindBy(xpath="//li[@id='sale']//ul//li//a[contains(text(),'Returns')]")
	private WebElement returnlink;

	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[1]")
	private WebElement checkbx;
	
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement deletebtn;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successmsg;	
	
	@FindBy(xpath="//li[@id='customer']//ul//li//a[contains(text(),'Customers')]")
	private WebElement customer;	
	
	@FindBy(id="input-name")
	private WebElement custName;

	@FindBy(id="button-filter")
	private WebElement filterbtn;

	@FindBy(name="filter_email")
	private WebElement emailid;
		
	public void filterButton() {
		this.filterbtn.click(); 
	}

	public void selectCheckbox(String email) {
		driver.findElement(By.xpath("//td[contains(text(), '"+email+"')]/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public void enteremailId(String emailId) {
		this.emailid.clear();
		this.emailid.sendKeys(emailId); 
	}	
	public void entercustName(String customerName) {
		this.custName.clear();
		this.custName.sendKeys(customerName); 
	}
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void clickSalesLink() {
		this.saleslink.click(); 
	}
	public void clickCustomerLink() {
		this.customerlink.click(); 
	}
	public void clickCustomer() {
		this.customer.click(); 
	}	
	public void clickReturnLink() {
		this.returnlink.click(); 
	}
	public void checkbox1() {
		this.checkbx.click(); 
	}
	public void deletebtn() {
		this.deletebtn.click(); 
	}
	public void Okbutton() {
		driver.switchTo().alert().accept();		
	}
	public void successms() {
		String success = this.successmsg.getText(); 
		SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertTrue(success.contains("Success"));
		softAssertion.assertAll();	
	}
}
