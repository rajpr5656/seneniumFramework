package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class RetrunsPagePOM {
	WebDriver driver; 
	public RetrunsPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Check box in Returns Page
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[1]")
	private WebElement checkbx;
	
	public void checkbox1() {
		this.checkbx.click(); 
	}
	
	//Delete button in Return Page
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement deletebtn;
	
	public void deletebtn() {
		this.deletebtn.click(); 
	}
	//Alert Accept
	public void Okbutton() {
		driver.switchTo().alert().accept();		
	}
	
	//Return Success message after delete in Return Page
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successmsg;	
	
	public void successms() {
		String success = this.successmsg.getText(); 
		SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertTrue(success.contains("Success"));
		softAssertion.assertAll();	
	}
	
	//
	@FindBy(id="input-name")
	private WebElement custName;
	
	public void entercustName(String customerName) {
		this.custName.clear();
		this.custName.sendKeys(customerName); 
	}
	
	//Button
	@FindBy(id="button-filter")
	private WebElement filterbtn;
	
	public void filterButton() {
		this.filterbtn.click(); 
	}

	//Filter email
	@FindBy(name="filter_email")
	private WebElement emailid;
	
	public void enteremailId(String emailId) {
		this.emailid.clear();
		this.emailid.sendKeys(emailId); 
	}

	public void selectCheckbox(String email) {
		driver.findElement(By.xpath("//td[contains(text(), '"+email+"')]/preceding-sibling::td/input[@type='checkbox']")).click();
	}	
}
