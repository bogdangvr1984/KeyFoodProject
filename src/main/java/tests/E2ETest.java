package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class E2ETest extends BaseTest {
	
	@Test
	public void endToEndTest() throws InterruptedException {
		
		app.click(app.menu.myAccountLink);
		app.myAccountPage.loingInApp("bogdan", "bogdan@123");
		assertTrue(app.myAccountPage.loginMsgIsDisplayed(app.myAccountPage.usernameGreetings));
		
		app.sendKeys(app.menu.searchField, "Pretzels");
		app.sendEnter();
		assertEquals(driver.getCurrentUrl(), "https://keyfood.ro/product/rold-gold-tiny-twists-pretzels/");
				
		app.click(app.productPage.addToCartButton);
        System.out.println(app.productPage.getAddedToCartAlertMessage());
		assertEquals(app.productPage.getAddedToCartAlertMessage(), "“Rold Gold Tiny Twists Pretzels” has been added to your cart.");
		
		app.click(app.menu.cartLink);
		app.cartPage.increaseProductQty(1);		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.visibilityOfElementLocated(app.cartPage.updateCart));
		
		Double pricePerPiece = app.cartPage.getProductPrice();
		
		DecimalFormat df = new DecimalFormat();
		assertEquals(app.cartPage.getTotalPrice(), Double.parseDouble(df.format(pricePerPiece*2)));
		
		app.click(app.cartPage.proceedToCheckoutButton); 
		
		Actions action = new Actions(driver);
		
		action
	     .moveToElement(app.checkoutPage.getWebElement(app.checkoutPage.firstName))
	     .doubleClick()
	     .sendKeys("Bogdan")
	     .sendKeys(Keys.TAB, "Gavriluta")
	     .sendKeys(Keys.TAB)
	     .sendKeys(Keys.TAB)
	     .sendKeys(Keys.TAB, "Str Gura Ialomitei Nr 22")
	     .sendKeys(Keys.TAB)
	     .sendKeys(Keys.TAB, "Bucuresti")
	     .sendKeys(Keys.TAB)
	     .sendKeys(Keys.TAB, "032595")
	     .sendKeys(Keys.TAB, "0744111222")
	     .sendKeys(Keys.TAB, "test@test.com")
	     .perform();
		
		app.checkoutPage.selectCountry("RO");
		app.checkoutPage.selectCity("B");
		app.click(app.checkoutPage.termAndCondCheckbox);
		app.click(app.checkoutPage.placeOrderButton);
		
		assertEquals(app.orderReceivedPage.verifyThankYouMessage(), "Thank you. Your order has been received.");
		assertTrue(true, app.orderReceivedPage.verifyOrderNr());
		System.out.println(app.orderReceivedPage.verifyOrderNr());
		
		
	}

}
