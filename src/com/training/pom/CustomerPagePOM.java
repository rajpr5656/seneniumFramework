package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPagePOM {
	
	WebDriver driver; 
	public CustomerPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//Customer Name check
	@FindBy(id="input-name")
	private WebElement custName;
	
	public void entercustName(String customerName) {
		this.custName.clear();
		this.custName.sendKeys(customerName); 
	}	
	
	//Filter button
	@FindBy(id="button-filter")
	private WebElement filterbtn;
	
	public void filterButton() {
		this.filterbtn.click(); 
	}
	
	//Email fields
	@FindBy(name="filter_email")
	private WebElement emailid;
	
	public void enteremailId(String emailId) {
		this.emailid.clear();
		this.emailid.sendKeys(emailId); 
	}
	
	public void selectCheckbox(String email) {
		driver.findElement(By.xpath("//td[contains(text(), '"+email+"')]/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	//Check box in Returns Page
		@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[1]//td[1]")
		private WebElement checkbx;
		
		public void checkbox1() {
			this.checkbx.click(); 
		}
}
