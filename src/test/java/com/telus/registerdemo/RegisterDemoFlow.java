package com.telus.registerdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

// Code added by Vinoth R - 17th Oct 2023
// Updated the code 
public class RegisterDemoFlow {
	
	public WebDriver driver;	
	
	//Variable Declaration
	String url = "https://nxtgenaiacademy.com/";
	String expRegistration = "Register For Demo";
	String firstName = "Ankita";
	String lastName = "Choudhary";
	String streetAddress= "300 consilium palace";
	String apartment= "Apartment Dummy";
	String state = "Ontario";
	String city = "Winsdor";
	String postalZipCode = "201301";
	String countryName= "Canada";
	String email = "ank123@gmail.com";
	String dateOfDemo = "09/06/2023";
	String hour = "08";
	String minutes = "20";
	String mobile_No = "7781537890";
	String query = "No Query";
	String expectedSucess_Msg = "Registration Form is Successfully Submitted.";
	
	@Test(priority = 1)
	public void launchApplication() {
		
		//Set the system property for the chrome driver 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create the object instance for the chromeoptions
		ChromeOptions co = new ChromeOptions();

		//Set the binary path for the chromium browser 
		co.setBinary(".\\ChromeBrowser\\chrome.exe");

		//Create the object instance for the chrome browser in the webdriver interface
		driver = new ChromeDriver(co);
		// launch the application 
		driver.get(url);

		//maximize the browser
		driver.manage().window().maximize();
		
		System.out.println("Application is launched");				
	}
		
	@Test(priority = 2)
	public void navigateToRegisterDemoPage() {
		Actions action = new Actions(driver);

		//MouseHover on the demo site
		WebElement demoSite = driver.findElement(By.linkText("Demo Sites"));
		action.moveToElement(demoSite).perform();

		//MouseHover on practice automation
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();

		//MouseHover on Demo Site � Registration Form
		WebElement registrationForm = driver.findElement(By.partialLinkText("Registration Form"));
		registrationForm.click();
		System.out.println("Register Demo Page is displayed");
	}
		
	@Test(priority = 3)
	public void registerDemo() {
		//Validating the Title of the form - Register For Demo
		WebElement registrationTitle = driver.findElement(By.xpath("//*[contains(text(),'Register For Demo')]"));

		String actualregistrationTitle = registrationTitle.getText();

		if(actualregistrationTitle.equals(expRegistration)) {
			System.out.println("The Actual and Expected title are same");
			System.out.println("The Actual title is: "+ actualregistrationTitle);
		}
		else
		{
			System.out.println("The Actual and Expected title are Not same");
			System.out.println("The Actual title is: "+ actualregistrationTitle);
			System.out.println("The Expected title is: "+ expRegistration);
		}

		//Entering  dummy details in the form

		WebElement firstNamePath = driver.findElement(By.name("vfb-5"));


		//First name is displayed or not
		if (firstNamePath.isDisplayed()) {
			System.out.println("The First Name is Displayed");

			// Entering firstName 
			firstNamePath.sendKeys(firstName);
			System.out.println("The First Name is: "+ firstName);
		}
		else
		{
			System.out.println("The First Name is Not Displayed");
		}

		//Entering LastName 
		WebElement lastNamePath = driver.findElement(By.name("vfb-7"));

		//Last name is displayed or not
		if (lastNamePath.isDisplayed()) {
			System.out.println("The Last Name is Displayed");

			// Entering the Last Name
			lastNamePath.sendKeys(lastName);
			System.out.println("The Last Name is: "+ lastName);
		}
		else
		{
			System.out.println("The Last Name is Not Displayed");
		}


		// Handling the Radio Button
		WebElement femaleRadioButton = driver.findElement(By.xpath("//*[@value='Female']"));


		// Female Radio Button is selected or not
		if(femaleRadioButton.isSelected()) {
			System.out.println("Female Radio button is selected");
		}
		else
		{
			System.out.println("Female Radio button is not Selected");


			//Selecting Radio Button
			femaleRadioButton.click();
			System.out.println("Female Radio button is clicked");
		}

		//Checking Female Radio Button is Selected or not
		if(femaleRadioButton.isSelected()) {
			System.out.println("Female Radio button is selected");
		}
		else
		{
			System.out.println("Female Radio button is Not Selected");
		}

		// Entering Street address
		WebElement streetAddressPath = driver.findElement(By.id("vfb-13-address"));

		// Street Address is displayed or not
		if (streetAddressPath.isDisplayed()) {
			System.out.println("The Street Address is Displayed");

			// Enter the Street Name
			streetAddressPath.sendKeys(streetAddress);
			System.out.println("The Street Address is: "+ streetAddress);
		}
		else
		{
			System.out.println("The Street Address is Not Displayed");
		}

		//Apt, Suite, Building
		WebElement apartmentPath = driver.findElement(By.id("vfb-13-address-2"));

		// Apartment field is displayed or not
		if (apartmentPath.isDisplayed()) {
			System.out.println("Apartment Field is Displayed");

			// Enter the Apartment Name
			apartmentPath.sendKeys(apartment);
			System.out.println("The Apartment and the building field is: "+ apartment);
		}
		else
		{
			System.out.println("Apartment Field is Not Displayed");
		}

		//Entering State
		WebElement statePath = driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]"));

		//State field is displayed or not
		if (statePath.isDisplayed()) {
			System.out.println("The State field is Displayed");

			// Enter the First Name
			statePath.sendKeys(state);
			System.out.println("The State is: "+ state);
		}
		else
		{
			System.out.println("The State field is Not Displayed");
		}

		//City
		WebElement cityPath = driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]"));

		//City field is displayed or not
		if (cityPath.isDisplayed()) {
			System.out.println("The City is Displayed");

			// Enter the City Name
			cityPath.sendKeys(city);
			System.out.println("The City is: "+ city);
		}
		else
		{
			System.out.println("The City is Not Displayed");
		}

		//Zip Code
		WebElement postalZipCodePath = driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]"));

		// Postal Zip Code field is displayed or not
		if (postalZipCodePath.isDisplayed()) {
			System.out.println("The Zip Code is Displayed");

			//Entering the Zip Code
			postalZipCodePath.sendKeys(postalZipCode);
			System.out.println("The Zip Code is : "+ postalZipCode);
		}
		else
		{
			System.out.println("The Zip Code is Not Displayed");
		}

		//Handling DropDown 
		WebElement dropDownCountry = driver.findElement(By.id("vfb-13-country"));

		//Country DropDown is Displayed or not
		if (dropDownCountry.isDisplayed()) {
			System.out.println("The Country DropDown is Displayed");

			// Creating object instance
			Select countryDropDown = new Select(dropDownCountry);

			countryDropDown.selectByVisibleText(countryName);
			System.out.println(countryName +" country is selected");
		}
		else
		{
			System.out.println("The Country DropDown Not is Displayed");
		}

		//Entering email
		WebElement emailPath = driver.findElement(By.cssSelector("#vfb-14"));

		// Email field is displayed or not
		if (emailPath.isDisplayed()) {
			System.out.println("Email is Displayed");

			// Enter the Email
			emailPath.sendKeys(email);
			System.out.println("Email is: "+ email);
		}
		else
		{
			System.out.println("Email is Not Displayed");
		}

		//Date Of Demo
		WebElement dateOfDemoPath = driver.findElement(By.id("vfb-18"));

		//DOD field is displayed or not
		if (dateOfDemoPath.isDisplayed()) {
			System.out.println("Date Of Demo field is Displayed");

			// Enter the Email
			dateOfDemoPath.sendKeys(dateOfDemo);
			System.out.println("Date of Demo is: "+ dateOfDemo);
		}
		else
		{
			System.out.println("Date Of Demo field is Not Displayed");
		}

		//Convenient Time DropDown
		// Hour
		WebElement hourPath = driver.findElement(By.id("vfb-16-hour"));

		//Convenient Time DropDown is displayed or Not
		if (hourPath.isDisplayed()) {
			System.out.println("Hour Dropdown is Displayed");

			//Creating object instance
			Select hourDropDown = new Select(hourPath);

			//Select by Visible Text
			hourDropDown.selectByVisibleText(hour);
			System.out.println(hour +" hour is selected");
		}
		else
		{
			System.out.println("Hour Dropdown is Not Displayed");
		}

		//MM
		WebElement minutesPath = driver.findElement(By.id("vfb-16-min"));

		//Minutes DropDown is Displayed or not
		if (minutesPath.isDisplayed()) {
			System.out.println("Minutes Dropdown is Displayed ");

			// Creating object instance for the select class
			Select minutesDropDown = new Select(minutesPath);

			// Select by visible text
			minutesDropDown.selectByVisibleText(minutes);
			System.out.println(minutes +" minutes is selected");
		}
		else
		{
			System.out.println("Minutes Dropdown is Not Displayed");
		}

		//Mobile_No
		WebElement mobileNoPath = driver.findElement(By.cssSelector("#vfb-19"));


		//Mobile_NO field is displayed or not
		if (mobileNoPath.isDisplayed()) {
			System.out.println("Mobile number is Displayed");

			// Enter the Mobile number
			mobileNoPath.sendKeys(mobile_No);
			System.out.println("Mobile number is: "+ mobile_No);
		}
		else
		{
			System.out.println("Mobile number is Not Displayed");
		}

		//CheckBox
		WebElement checkBoxTestNG = driver.findElement(By.id("vfb-20-2"));
		WebElement checkBoxCoreJava = driver.findElement(By.id("vfb-20-3"));



		//CheckBox Button is selected or not
		if(checkBoxTestNG.isSelected()) {
			System.out.println("TestNG Check Box is Selected");
		}
		else
		{
			System.out.println("TestNG Check Box Button is Not Selected");


			//Check TestNG Check Box 
			checkBoxTestNG.click();
			System.out.println("TestNG Check Box is checked");
		}

		//Verify TestNG Check Box is Selected or not
		if(checkBoxTestNG.isSelected()) {
			System.out.println("TestNG Check Box is selected ");
		}
		else
		{
			System.out.println("TestNG Check Box is Not Selected");
		}

		//Selecting Core Java checkbox 
		if(checkBoxCoreJava.isSelected()) {
			System.out.println("CoreJava Check Box is selected");
		}
		else
		{
			System.out.println("CoreJava Check Box is Not Selected");


			//Check CoreJava Check Box 
			checkBoxCoreJava.click();
			System.out.println("CoreJava Check Box is checked");
		}

		//Verify CoreJava Check Box is Selected or not
		if(checkBoxCoreJava.isSelected()) {
			System.out.println("CoreJava Check Box is selected");
		}
		else
		{
			System.out.println("CoreJava Check Box is Not Selected");
		}

		//Add Query
		WebElement queryPath = driver.findElement(By.cssSelector("#vfb-23"));

		// Query field is displayed or not
		if (queryPath.isDisplayed()) {
			System.out.println("Query field is Displayed");

			//Add Query
			queryPath.sendKeys(query);
			System.out.println("Query of the candidate is: "+ query);
		}
		else
		{
			System.out.println("Query field is Not displayed");
		}

		WebElement verification = driver.findElement(By.xpath("//*[@id='vfb-3']"));
		WebElement verificationCode = driver.findElement(By.xpath("//*[contains(text(),'Example:')]"));

		//Verification Field is displayed or not
		if (verification.isDisplayed()) {
			System.out.println("Verification field is Displayed");

			//Fetching the verification output
			String verOutput[] = verificationCode.getText().split(":");
			String verVal=verOutput[1].trim();
			System.out.println("The two digit verification Output is: "+ verVal);

			//Enter the verification two digit number
			verification.sendKeys(verVal);
		}
		else
		{
			System.out.println("Verification field is Not Displayed");
		}

		WebElement submitButton = driver.findElement(By.name("vfb-submit"));

		//Submit Button is enabled or not
		if (submitButton.isEnabled()) {
			System.out.println("Submit Button is Enabled");

			// click on submit Button 
			submitButton.click();
			System.out.println("Submit Button is clicked");
		}
		else
		{
			System.out.println("Submit Button is Disabled");
		}
	
	}
	
	@Test(priority = 4)
	public void validateSuccessfulMsg() {
		WebElement fullSuccMsg = driver.findElement(By.xpath("//div[@class='elementor-widget-container']"));

		// Fetching success message
		String success_Msg=  fullSuccMsg.getText();
		String actualSuccess_Msg [] = success_Msg.split("Verification");
		String act_Success = actualSuccess_Msg [1].trim();

		String asuccMsgSplit[] = act_Success.split("The Transaction ID :");
		String finalSuccess_Msg = asuccMsgSplit[0].trim();
		String transOutput = asuccMsgSplit[1].trim();

		if(finalSuccess_Msg.equals(expectedSucess_Msg)) {
			System.out.println("The Actual and Expected Message are same");
			System.out.println("The Actual successful messages is: "+ finalSuccess_Msg);
		}
		else
		{
			System.out.println("The Actual and Expected Message are Not same");
			System.out.println("The Actual successful messages is: "+ finalSuccess_Msg);
			System.out.println("The Expected successful messages is: "+ expectedSucess_Msg);
		}

		//Displaying the Transaction_no
		System.out.println("The Transaction ID is: "+ transOutput);

	}
	
	@Test(priority = 5,alwaysRun = true)
	public void closeApplication() {
		driver.quit();
		System.out.println("Application is closed");
	}
	
	

}
