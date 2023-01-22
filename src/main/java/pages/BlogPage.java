package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumWrappers;

public class BlogPage extends SeleniumWrappers {

	public BlogPage(WebDriver driver) {
		super(driver);
	}
	
	public By readMore = By.xpath("//div[@class='klb-readmore entry-button']");
	public By blogPost1 = By.xpath("//a[@class='button'][@href='https://keyfood.ro/2021/05/03/but-i-must-explain-to-you-how-all-this-mistaken-idea/']");
	public By blogPost2 = By.xpath("//a[@class='button'][@href='https://keyfood.ro/2021/05/03/the-problem-with-typefaces-on-the-web/']");
	public By blogPost3 = By.xpath("//a[@class='button'][@href='https://keyfood.ro/2021/05/02/english-breakfast-tea-with-tasty-donut-desserts/']");
	public By blogPost4 = By.xpath("//a[@class='button'][@href='https://keyfood.ro/2021/05/01/on-the-other-hand-we-provide-denounce-with-righteous/']");
	
	
	public boolean verifyNumberOfBlogPosts() {
	List<WebElement> blogs = driver.findElements(readMore);
	if(blogs.size() == 4) {
		return true;
	}
	return false;
	}
}
