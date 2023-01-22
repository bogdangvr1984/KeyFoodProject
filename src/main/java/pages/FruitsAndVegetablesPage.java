package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class FruitsAndVegetablesPage extends SeleniumWrappers{

	public FruitsAndVegetablesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By melons = By.xpath("//a[@title='Fresh Produce Melons Each']");

}
