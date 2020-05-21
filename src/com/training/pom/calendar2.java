package com.training.pom;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar2 {

public static void main(String[] args) {
// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\PrashanthNagaraj\\Old Computer\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//Login page
driver.get("http://uniform.upskills.in/admin");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin@123");
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//Home page
driver.findElement(By.xpath("//i[@class='fa fa-tags fa-fw']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
//Product page
driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[8]/a")).click();
driver.findElement(By.xpath("//a[@href='#tab-discount']")).click();
driver.findElement(By.xpath("//table[@id='discount']//i")).click();
//driver.findElement(By.xpath("(//td[@class='day active today'])[3]")).click();
driver.findElement(By.xpath("(//div[@class='datepicker-days']//td[@class='day active today'])")).click();
driver.findElement(By.xpath("(//span[@class='input-group-btn'])[3]")).click();
driver.findElement(By.xpath("(//div[@class='datepicker-days']//td[@class='day active today'])[2]/following-sibling::td[@class='day']")).click();
//WebElement day = driver.findElement(By.cssSelector(".day.active.today"));
//System.out.println(day);

//May 23

//while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='picker-switch']")).getText().contains("May"))
//{
//driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
//}

/*List<WebElement> dates= driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
int count=driver.findElements(By.className("day")).size();

for(int i=0;i<count;i++)
{
String text=driver.findElements(By.className("day")).get(i).getText();
if(text.equalsIgnoreCase("22"))
{
driver.findElements(By.className("day")).get(i).click();
break;
}

}*/
}
}