**********************************************************************************************************
This Folder contains 2 sub folders: 1_sourceFiles_Results and 2_project_Package

1_sourceFiles_Results folder contains 
	Sources files: stepDefinitions, cukesRunnerTest, cucumberTests 
	Test Report: cucumber-html-report

2_project_Package folder contains the whole Maven selenium project with cucumber scenario.

**********************************************************************************************************
**********************************************************************************************************
 PROJECT DETAILS

 Author: Chandra Pagadala
 Date: 11.01.2016 
 Title: Amazon Search for Nikon D3X
 Description/Steps:
		Selenium code with cucumber scenario for following actions:
		1. Open amazon.com (Url is parameter)
		2. Search Nikon and sort results from highest price to slowest.
		3. Select second product and click it for details.
		4. From details check (verify with assert) that product topic contains text "Nikon D3X"
		Test is implemented as Maven project

 Software used:
 		IDE: Eclipse Mars.1 Release (4.5.1)
 		Java: 1.8.0_65
 		Selenium: 2.48.2
 		Cucumber: 1.1.2
		Maven

 Support Files Needed:
		cucumberTest.feature
		pom.xml
		cukesRunnerTest.java


**********************************************************************************************************
**********************************************************************************************************


