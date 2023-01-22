package utils;

import org.openqa.selenium.WebDriver;

import pages.BlogPage;
import pages.BlogPost1Page;
import pages.BlogPost2Page;
import pages.BlogPost3Page;
import pages.BlogPost4Page;
import pages.CartPage;
import pages.CheckoutPage;
import pages.FruitsAndVegetablesPage;
import pages.MenuPage;
import pages.MyAccountPage;
import pages.OrderReceivedPage;
import pages.ProductPage;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public MenuPage menu = new MenuPage(driver);
	public MyAccountPage myAccountPage = new MyAccountPage(driver);
	public ProductPage productPage = new ProductPage(driver);
	public CartPage cartPage = new CartPage(driver);
	public CheckoutPage checkoutPage = new CheckoutPage(driver);
	public OrderReceivedPage orderReceivedPage = new OrderReceivedPage(driver);
	public BlogPage blogPage = new BlogPage(driver);
	public BlogPost1Page blogPost1Page = new BlogPost1Page(driver);
	public BlogPost2Page blogPost2Page = new BlogPost2Page(driver);
	public BlogPost3Page blogPost3Page = new BlogPost3Page(driver);
	public BlogPost4Page blogPost4Page = new BlogPost4Page(driver);
	public FruitsAndVegetablesPage fruitsVeggies = new FruitsAndVegetablesPage(driver);

}
