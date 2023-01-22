package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class SmokeTest extends BaseTest {
	
	@Test
	public void smokeTest() {
		
		app.click(app.menu.blogLink);
		assertTrue(app.blogPage.verifyNumberOfBlogPosts());
		
		app.click(app.blogPage.blogPost1);
		app.sendKeys(app.blogPost1Page.comment, "Testing testing 1");
		app.sendKeys(app.blogPost1Page.name, "Bogdan");
		app.sendKeys(app.blogPost1Page.email, "bg@test.com");
		app.click(app.blogPost1Page.postComment);
		assertEquals(app.blogPost1Page.verifyNewComment(), "Your comment is awaiting moderation.");
		
		app.click(app.menu.blogLink);
		app.click(app.blogPage.blogPost2);
		app.sendKeys(app.blogPost2Page.comment, "Testing testing 2");
		app.sendKeys(app.blogPost2Page.name, "Bogdan");
		app.sendKeys(app.blogPost2Page.email, "bg@test.com");
		app.click(app.blogPost2Page.postComment);
		assertEquals(app.blogPost2Page.verifyNewComment(), "Your comment is awaiting moderation.");
		
		app.click(app.menu.blogLink);
		app.click(app.blogPage.blogPost3);
		app.sendKeys(app.blogPost3Page.comment, "Testing testing 3");
		app.sendKeys(app.blogPost3Page.name, "Bogdan");
		app.sendKeys(app.blogPost3Page.email, "bg@test.com");
		app.click(app.blogPost3Page.postComment);
		assertEquals(app.blogPost3Page.verifyNewComment(), "Your comment is awaiting moderation.");
		
		app.click(app.menu.blogLink);
		app.click(app.blogPage.blogPost4);
		app.sendKeys(app.blogPost4Page.comment, "Testing testing 4");
		app.sendKeys(app.blogPost4Page.name, "Bogdan");
		app.sendKeys(app.blogPost4Page.email, "bg@test.com");
		app.click(app.blogPost4Page.postComment);
		assertEquals(app.blogPost4Page.verifyNewComment(), "Your comment is awaiting moderation.");
	}

}
