//**************************************************************
//Name: cukesRunnerTest.java
//Description:
//		Support file for stepDefinitions.java

//Author: Chandra Pagadala
//Date: 11.01.2016
//**************************************************************

package com.cucumber.SelenimMavenTask;

import cucumber.api.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
  @Cucumber.Options(
	format = {
	        "pretty",
	        "html:target/cucumber-html-report",
	        "json-pretty:target/cucumber- report.json"
	       },  
			features="src/test/resource"
  )

public class cukesRunnerTest {

}
