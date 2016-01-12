$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberTests.feature");
formatter.feature({
  "line": 1,
  "name": "Selenium web browser tests",
  "description": "",
  "id": "selenium-web-browser-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Looking for Nikon model",
  "description": "",
  "id": "selenium-web-browser-tests;looking-for-nikon-model",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigated to the \"http://www.amazon.com\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search Nikon and click Go",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I sort the results from highest to lowest",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "select the second product and click for details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "check the product details contains Nikon D3X",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.com",
      "offset": 20
    }
  ],
  "location": "stepDefinitions.navigate_amazon(String)"
});
formatter.result({
  "duration": 6349612721,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.search_Nikon()"
});
formatter.result({
  "duration": 6384714089,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.highest_to_lowest()"
});
formatter.result({
  "duration": 4231857298,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.select_second_product()"
});
formatter.result({
  "duration": 2295340440,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.check_Nikon_model()"
});
formatter.result({
  "duration": 3995148369,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.cucumber.SelenimMavenTask.stepDefinitions.check_Nikon_model(stepDefinitions.java:109)\r\n\tat ✽.Then check the product details contains Nikon D3X(cucumberTests.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinitions.Close_browser()"
});
formatter.result({
  "status": "skipped"
});
});