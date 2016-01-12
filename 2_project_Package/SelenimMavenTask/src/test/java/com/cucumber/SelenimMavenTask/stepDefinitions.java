//**************************************************************
// Name: stepDefinitions.java
// Title: Amazon Search for Nikon D3X
// Description/Steps:
//		Selenium code with cucumber scenario for following actions:
//		1. Open amazon.com (Url is parameter)
//		2. Search Nikon and sort results from highest price to slowest.
//		3. Select second product and click it for details.
//		4. From details check (verify with assert) that product topic contains text â€œNikon D3Xâ€
//		Test is implemented as Maven project

// Software used:
// 		IDE: Eclipse Mars.1 Release (4.5.1)
// 		Java: 1.8.0_65
// 		Selenium: 2.48.2
// 		Cucumber: 1.1.2

// Support Files Needed
//		cucumberTest.feature
//		pom.xml
//		cukesRunnerTest.java

// Author: Chandra Pagadala
// Date: 11.01.2016

//**************************************************************

package com.cucumber.SelenimMavenTask;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class stepDefinitions {

	WebDriver driver;
	String baseUrl;

	// 1. In firefox browser and open amazon.com website
	@Given("^I navigated to the \"([^\"]*)\" website$")
	public void navigate_amazon(String baseUrl) throws Throwable {

		System.out.println("1. Open amazon.com in firefox");

		driver = new FirefoxDriver();
		// open baseurl
		driver.get(baseUrl);
	}

	// 2. Search Nikon in amazon.com website
	@When("^I search Nikon and click Go$")
	public void search_Nikon() throws Throwable {

		System.out.println("2. Search for Nikon");
		
		// Enter search key: 'Nikon'
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nikon");

		// Click 'Go' button
		driver.findElement(By.xpath("//*[@value='Go']")).click();
	}

	// 3. Sort the search results from highest price to lowest
	@Then("^I sort the results from highest to lowest$")
	public void highest_to_lowest() throws Throwable {

		System.out.println("3. Sort the results from highest to lowest");
		
		// sort results
		new Select(driver.findElement(By.id("sort"))).selectByVisibleText("Price: High to Low");
	}

	// 4. Click on the second item 
	@And("^select the second product and click for details$")
	public void select_second_product() throws Throwable {

		System.out.println("4. Click on the second item ");
		
		// wait
		Thread.sleep(2000);
		
		//Click on the second item , whose id is result_1 a
		WebElement simpleTable = driver.findElement(By.id("result_1"));
		List<WebElement> rows = simpleTable.findElements(By.tagName("a"));
		rows.get(0).click();
	}

	// 5. Verify if the product text contains "Nikon D3X"
	@Then("^check the product details contains Nikon D3X$")
	public void check_Nikon_model() throws Throwable {

		System.out.println("5. verify if the product details contains model Nikon D3X");
		
		// wait
		Thread.sleep(2000);

		// check if the product is Nikon D3X
		//Assert.assertTrue(driver.findElement(By.id("productTitle")).getText().contains("Nikon D3X"));
		WebElement prod = driver.findElement(By.id("productTitle"));                      
        Assert.assertTrue (prod.getText().contains("Nikon D3X"));
	}

	// 6. Close the browser
	@And("^Close the browser$")
	public void Close_browser() throws Throwable {

		System.out.println("6. Close the browser");
		
		// wait
		Thread.sleep(2000);
		
		// close browser
		driver.quit();
	}

}
