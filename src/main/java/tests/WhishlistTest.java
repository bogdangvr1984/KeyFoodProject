package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class WhishlistTest extends BaseTest {
	
	@Test
	public void wishListTest() {
		
	app.click(app.menu.myAccountLink);
	app.myAccountPage.loingInApp("bogdan", "bogdan@123");
	assertTrue(app.myAccountPage.loginMsgIsDisplayed(app.myAccountPage.usernameGreetings));
	
	app.click(app.menu.allCategories);
	app.click(app.menu.fruitsAndVegetables);
	app.click(app.fruitsVeggies.melons);
	
	/*Actions action = new Actions(driver);
	action
	.moveToElement(app.menu.getWebElement(app.menu.allCategories)).click()
    .moveToElement(app.menu.getWebElement(app.menu.fruitsAndVegetables)).click()
    .moveToElement(app.fruitsVeggies.getWebElement(app.fruitsVeggies.melons)).click()

    .perform(); */
	
		
		
	}

}
