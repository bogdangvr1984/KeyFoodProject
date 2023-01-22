package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class OrderReceivedPage  extends SeleniumWrappers {
	
	public OrderReceivedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By orderReceivedMessage = By.xpath("//*[contains(@class, 'thankyou-order-received')]");
	public By orderNumber = By.xpath("//li[@class='woocommerce-order-overview__order order']");
	
	public String verifyThankYouMessage() {

		String thanks = driver.findElement(orderReceivedMessage).getText();
		
		return thanks;	
	}
	
	public String verifyOrderNr() {

		String nr = driver.findElement(orderNumber).getText();
		
		//return Integer.parseInt(id);
		return nr;
	}
	

}
