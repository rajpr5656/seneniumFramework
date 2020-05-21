package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsPagePOM {
	 WebDriver driver; 
	
	public ProductsPagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Edit link
	@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[8]/a")
	private WebElement edit;
	
	public void productEditbutton() {
		this.edit.click();
	}
	
	//Navigate to Data tab
	@FindBy(xpath="//a[@href='#tab-data']")
	private WebElement datatb;
	
	public void clickDataTab() { 
		this.datatb.click();
	}
	
	//Quality Test box in Data tab
	@FindBy(css="#input-quantity")
	private WebElement quantitytextbox; 
	
	public void Quantitytextbox(String value) {
		this.quantitytextbox.clear();
		this.quantitytextbox.sendKeys(value);	
	}
	
	//Navigate Discount tab
	@FindBy(xpath="//a[@href='#tab-discount']")
	private WebElement discounttb;
	
	public void clickDiscountTab() { 
		this.discounttb.click();
	}
	
	//Click on Add Discount icon
	@FindBy(xpath="//table[@id='discount']//i")
	private WebElement adddiscount;
	
	public void clickAddDiscount() { 
		this.adddiscount.click();
	}
	
	//Enter value in Quality Test box in Discount tab
	@FindBy(xpath="//input[@name='product_discount[0][quantity]']")
	private WebElement quantitydtextbox; 
	
	public void Quantitydtextbox(String value1) {
		this.quantitydtextbox.clear();
		this.quantitydtextbox.sendKeys(value1);	
	}
	
	//Enter value in Price Test box in Discount tab
	@FindBy(xpath="//input[@name='product_discount[0][price]']")
	private WebElement pricetextbox; 
	
	public void Pricetextbox(String value2) {
		this.pricetextbox.clear();
		this.pricetextbox.sendKeys(value2);	
	}
	
	//Start date from calendar in discount tab
	@FindBy(xpath="(//span[@class='input-group-btn'])[2]")
	private WebElement startCalendar;
	
	public void clickstartCalendar() { 
		this.startCalendar.click();
	}
	
	//Select Start Date in discount tab
	@FindBy(xpath="(//div[@class='datepicker-days']//td[@class='day active today'])[2]")
	private WebElement startdate;
	
	public void clickstartDate() { 
		this.startdate.click();
	}	
	
	//End date from calendar in discount tab	 
	@FindBy(xpath="(//span[@class='input-group-btn'])[3]")
	private WebElement endCalendar;
	
	public void clickendCalendar() { 
		this.endCalendar.click();
	}
	
	//Select End Date in discount tab
	@FindBy(xpath="(//div[@class='datepicker-days']//td[@class='day today'])[2]/following-sibling::td[@class='day']")
	private WebElement enddate;
	
	public void clickendDate() { 
		this.enddate.click();		
	}
	
	//Select End Date in discount tab new product scenario
	@FindBy(xpath="(//div[@class='datepicker-days']//td[@class='day active today'])[3]/following-sibling::td[@class='day']")
	private WebElement enddate1;
	
	public void clickendDate1() { 
		this.enddate1.click();		
	}
	
	//Click on Save button 
	@FindBy(xpath="//div[@class='pull-right']//button[@class='btn btn-primary']")
	private WebElement save;
	public void savebutton() { 
		this.save.click();		
	}
	
	//Click on Add button
	@FindBy(css=".fa.fa-plus")
	private WebElement add;
	public void addbutton() { 
		this.add.click();		
	}
	
	//Product Name in General tab
	@FindBy(id="input-name1")
	private WebElement productName;
	
	public void sendproductName(String productName) {
		this.productName.clear();
		this.productName.sendKeys(productName);
	}
	//MegaTag Name in General tab
	@FindBy(id="input-meta-title1")
	private WebElement megaTagName;
	
	public void sendMegatagName(String megaTagName) {
		this.megaTagName.clear();
		this.megaTagName.sendKeys(megaTagName);
	}
	
	//Model Name in Data tab
	@FindBy(id="input-model")
	private WebElement modelName;
	
	public void sendModelName(String modelName) {
		this.modelName.clear();
		this.modelName.sendKeys(modelName);
	}
	
	//Price in Data tab
	@FindBy(id="input-price")
	private WebElement priceModel;
	
	public void sendpricemodel(String priceModel) {
		this.priceModel.clear();
		this.priceModel.sendKeys(priceModel);
	}
	
	//Quantity in Data tab
	@FindBy(id="input-quantity")
	private WebElement quantityModel;
	
	public void sendquantitymodel(String quantityModel) {
		this.quantityModel.clear();
		this.quantityModel.sendKeys(quantityModel);
	}
	
	//Navigate Link tab
	@FindBy(xpath="//a[@href='#tab-links']")
	private WebElement linktb;
	
	public void clickLinkTab() { 
		this.linktb.click();
	}
	
	//Category in link tab
	@FindBy(xpath="//input[@id='input-category']")
	private WebElement categoryLink;
	
	public void sendcategorylink(String categoryLink1) {
		this.categoryLink.clear();
		this.categoryLink.sendKeys(categoryLink1);
		driver.findElement(By.xpath("//a[text()='Sports Uniform']")).click();
	}
	
}