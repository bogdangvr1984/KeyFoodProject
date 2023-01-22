package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class CheckoutPage extends SeleniumWrappers{

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public By termAndCondCheckbox = By.id("terms");
	public By placeOrderButton = By.id("place_order");
	public By mandatoryBillingAddressFields = By.cssSelector("ul[class='woocommerce-error']>li");
	public By firstName = By.id("billing_first_name");
	public By lastName = By.id("billing_last_name");
	public By country = By.id("billing_country");
	public By billingAddress = By.id("billing_address_1");
	public By billingCity = By.id("billing_city");
	public By state = By.id("billing_state");
	public By zipCode = By.id("billing_postcode");
	public By phone = By.id("billing_phone");
	public By email = By.id("billing_email");
	
	public void selectCountry(String value) { 
		WebElement element = driver.findElement(country);
		Select selectDropDown = new Select(element);
		selectDropDown.selectByValue(value);
		
	}
	
	public void selectCity(String value) { 
		WebElement element = driver.findElement(state);
		Select selectDropDown = new Select(element);
		selectDropDown.selectByValue(value);
		
	}
	
	

}
