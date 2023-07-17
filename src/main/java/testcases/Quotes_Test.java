package Freshsales_Automation;


import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;


public class Quotes_Test extends testBase{

	login Login_Page;
	home Home_Page;
	Quotes_and_Products element;
	
	public Quotes_Test() {
        super();
    }
	
	@BeforeMethod
    public void setup() {
        initialize();
        Login_Page = new login();
        element = new Quotes_and_Products();
    }
	
	@Test(priority = 1 , description = "To verify that once the quotes are selected , the options like assigned to, update field and delete are visible. and To verify that the assignee is able to assign the quotes.")
	public void Assign_Quotes_yes() {
		Login_Page.navigateToLoginPage(prop.getProperty("url"));
    	Home_Page = Login_Page.login_page(prop.getProperty("org"), prop.getProperty("username"), prop.getProperty("password"));
        
    	//after login 
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
        wait.until(driver -> driver.findElement(By.xpath(" /html/body/div[6]/div[4]/div[4]/div/div[1]/div/p/span")).isDisplayed()); 

		//open the quotes page
		Login_Page.quotesPage();
		Wait<WebDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
		
		//quotes page gets opened
		
     // Wait until the existing products are displayed
    	wait2.until(driver -> driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[2]")).isDisplayed());
    	
    	// Wait for 5 seconds for the user to manually click on the check boxes
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        element.assign_quotes_yes();
	
        // Assert that the element exists
    boolean isElementExists = driver.findElements(By.xpath("(//button[@class='ember-view fsa-custom-button fsa-btn-secondary'])[1]")).size() > 0;
    Assert.assertFalse(isElementExists, "The element exist!");
    	
	}
	

	
	@Test(priority = 2 , description = "To verify that the assignee is able to assign the quotes and once the cancel button is clicked user should navigate back to the parent page.")
	public void Assign_Quotes_no() {
		Login_Page.navigateToLoginPage(prop.getProperty("url"));
    	Home_Page = Login_Page.login_page(prop.getProperty("org"), prop.getProperty("username"), prop.getProperty("password"));
        
    	//after login 
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
        wait.until(driver -> driver.findElement(By.xpath(" /html/body/div[6]/div[4]/div[4]/div/div[1]/div/p/span")).isDisplayed()); 

		//open the quotes page
		Login_Page.quotesPage();
		Wait<WebDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
		
		//quotes page gets opened
		
     // Wait until the existing products are displayed
    	wait2.until(driver -> driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[2]")).isDisplayed());
    	
    	// Wait for 5 seconds for the user to manually click on the check boxes
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        element.assign_quotes_no();
    
        // Assert that the element exists
        boolean isElementExists = driver.findElements(By.xpath("(//button[@class='ember-view fsa-custom-button fsa-btn-secondary'])[1]")).size() > 0;
        Assert.assertTrue(isElementExists, "The element does not exist!");
	}
	

	
	@Test(priority = 3 , description = "To verify that the assignee is able to update a field in the quotes section.")
	public void Update_Quotes_yes() {
		Login_Page.navigateToLoginPage(prop.getProperty("url"));
    	Home_Page = Login_Page.login_page(prop.getProperty("org"), prop.getProperty("username"), prop.getProperty("password"));
        
    	//after login 
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
        wait.until(driver -> driver.findElement(By.xpath(" /html/body/div[6]/div[4]/div[4]/div/div[1]/div/p/span")).isDisplayed()); 

		//open the quotes page
		Login_Page.quotesPage();
		Wait<WebDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
		
		//quotes page gets opened
		
     // Wait until the existing products are displayed
    	wait2.until(driver -> driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[2]")).isDisplayed());
    	
    	// Wait for 5 seconds for the user to manually click on the check boxes
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        element.update_quotes_yes();
	
        // Assert that the element exists
    boolean isElementExists = driver.findElements(By.xpath("(//button[@class='ember-view fsa-custom-button fsa-btn-secondary'])[1]")).size() > 0;
    Assert.assertFalse(isElementExists, "The element exist!");
    	
		}
	
	@Test(priority = 4 , description = "To verify that the assignee is able to update a field in the quotes section and once the cancel button is clicked user should navigate back to the parent page.")
	public void Update_Quotes_no() {
		Login_Page.navigateToLoginPage(prop.getProperty("url"));
    	Home_Page = Login_Page.login_page(prop.getProperty("org"), prop.getProperty("username"), prop.getProperty("password"));
        
    	//after login 
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
        wait.until(driver -> driver.findElement(By.xpath(" /html/body/div[6]/div[4]/div[4]/div/div[1]/div/p/span")).isDisplayed()); 

		//open the quotes page
		Login_Page.quotesPage();
		Wait<WebDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
		
		//quotes page gets opened
		
     // Wait until the existing products are displayed
    	wait2.until(driver -> driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[2]")).isDisplayed());
    	
    	// Wait for 5 seconds for the user to manually click on the check boxes
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        element.update_quotes_no();
	
        // Assert that the element exists
    boolean isElementExists = driver.findElements(By.xpath("(//button[@class='ember-view fsa-custom-button fsa-btn-secondary'])[1]")).size() > 0;
    Assert.assertTrue(isElementExists, "The element exist!");
    	
		}
	

	
	@Test(priority = 5 , description = "To verify that the assignee is able to delete a field in the quotes section.")
	public void Delete_Quotes_yes() {
		Login_Page.navigateToLoginPage(prop.getProperty("url"));
    	Home_Page = Login_Page.login_page(prop.getProperty("org"), prop.getProperty("username"), prop.getProperty("password"));
        
    	//after login 
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
        wait.until(driver -> driver.findElement(By.xpath(" /html/body/div[6]/div[4]/div[4]/div/div[1]/div/p/span")).isDisplayed()); 

		//open the quotes page
		Login_Page.quotesPage();
		Wait<WebDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
		
		//quotes page gets opened
		
     // Wait until the existing products are displayed
    	wait2.until(driver -> driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[2]")).isDisplayed());
    	
    	// Wait for 5 seconds for the user to manually click on the check boxes
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        element.delete_quotes_yes();
	
        // Assert that the element exists
    boolean isElementExists = driver.findElements(By.xpath("(//button[@class='ember-view fsa-custom-button fsa-btn-secondary'])[1]")).size() > 0;
    Assert.assertFalse(isElementExists, "The element exist!");
    	
		}
	
	@Test(priority = 6 , description = "To verify that the assignee is able to delete a field in the quotes section and once the cancel button is clicked user should navigate back to the parent page.")
	public void Delete_Quotes_no() {
		Login_Page.navigateToLoginPage(prop.getProperty("url"));
    	Home_Page = Login_Page.login_page(prop.getProperty("org"), prop.getProperty("username"), prop.getProperty("password"));
        
    	//after login 
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
        wait.until(driver -> driver.findElement(By.xpath(" /html/body/div[6]/div[4]/div[4]/div/div[1]/div/p/span")).isDisplayed()); 

		//open the quotes page
		Login_Page.quotesPage();
		Wait<WebDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(Exception.class);
		
		//quotes page gets opened
		
     // Wait until the existing products are displayed
    	wait2.until(driver -> driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[4]/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[2]")).isDisplayed());
    	
    	// Wait for 5 seconds for the user to manually click on the check boxes
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        element.delete_quotes_no();
	
        // Assert that the element exists
    boolean isElementExists = driver.findElements(By.xpath("(//button[@class='ember-view fsa-custom-button fsa-btn-secondary'])[1]")).size() > 0;
    Assert.assertTrue(isElementExists, "The element exist!");
    	
		}
	

//	@Test(priority = 7 , description = "To verify that the assignee is able to delete multiple fields in the products section.")
//	public void Delete_multiple_Quotes() {
//			
//		}
//	

	@AfterMethod
    public void tearDown() {
        driver.quit();
    }
	
}
