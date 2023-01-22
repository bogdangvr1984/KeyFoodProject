package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class CartPage extends SeleniumWrappers{

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public By totalPrice = By.cssSelector("td[data-title='Total'] span[class*='woocommerce-Price-amount amount']");
	public By proceedToCheckoutButton = By.linkText("Proceed to checkout");
	public By increaseQtyButtonCart = By.xpath("//i[@class='klbth-icon-plus']");
	public By salePrice = By.cssSelector("td[data-title='Price'] span[class*='woocommerce-Price-amount amount']");
	public By updateCart = By.xpath("//div[@role='alert']");
	
	public double getProductPrice() {
		String price = driver.findElement(salePrice).getText().replace("$", "");
		return Double.parseDouble(price);
	}
	
	public double getTotalPrice() {
		
		return Double.parseDouble(driver.findElement(totalPrice).getText().substring(1));
	}
	
public void increaseProductQty(int times) {
		
		for(int i =0; i<times; i++) {
			
			click(increaseQtyButtonCart);
		}
	}
	
	

}
