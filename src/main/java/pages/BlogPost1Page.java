package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BlogPost1Page extends SeleniumWrappers {

	public BlogPost1Page(WebDriver driver) {
		super(driver);
		
	}
	
	public By comment = By.id("comment");
	public By name = By.id("author");
	public By email = By.id("email");
	public By postComment = By.id("submit");
	public By newComment = By.xpath("//li[@class='comment odd alt thread-even depth-1']//div[@class='klb-post']//em");
	
	public String verifyNewComment() {

		String comment = driver.findElement(newComment).getText();
		
		return comment;	
	}
	

}
