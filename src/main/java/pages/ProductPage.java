package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ProductPage extends SeleniumWrappers{

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By salePrice = By.cssSelector("p[class='price'] ins>span[class*='woocommerce-Price-amount amount']");
	public By increaseQtyButton = By.xpath("(//i[@class='klbth-icon-plus'])[1]");
	public By addToCartButton = By.cssSelector("button[name='add-to-cart']");
	
	public By addToCartAlertMessage = By.cssSelector("div[class='woocommerce-message']");
	public By cartUpdated = By.xpath("//div[@role='alert']");
	
	public double getProductSalePrice() {
		String price = driver.findElement(salePrice).getText().replace("$", "");
		return Double.parseDouble(price);
	}
	
	public void increaseProductQty(int times) {
		
		for(int i =0; i<times; i++) {
			
			click(increaseQtyButton);
		}
	}
	
	public String getAddedToCartAlertMessage() {
		String initialString = driver.findElement(addToCartAlertMessage).getText().replace("View cart", "").substring(1);
		
		return initialString;
	}

}
