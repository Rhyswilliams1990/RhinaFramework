package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://curiosity.partner.testinsights.io/app/#!/module-collection/guid/57137f9e-b74e-4dff-892e-a57a59a9918d
@TestModellerModule(guid = "57137f9e-b74e-4dff-892e-a57a59a9918d")
public class Hyperon_Demo_App extends BasePage
{
	public Hyperon_Demo_App (WebDriver driver)
	{
		super(driver);
	}


	
	private By CityElem = By.xpath("//INPUT[@ng-change='ctrl.updateAddressCity()']");

	private By Date_of_BirthElem = By.xpath("//INPUT[@type='date']");

	private By Drivers_AgeElem = By.xpath("//INPUT[@min='16']");

	private By Drivers_age_when_license_was_obtainedElem = By.xpath("//INPUT[@min='16']");

	private By _Female_Elem = By.xpath("//BUTTON[@ng-click='ctrl.updateDriverGender()']");

	private By First_nameElem = By.xpath("//INPUT[@ng-change='ctrl.updateDriverFirstName()']");

	private By Last_nameElem = By.xpath("//INPUT[@ng-change='ctrl.updateDriverLastName()']");

	private By MakeElem = By.xpath("//SELECT[@class='common-input-default__select ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");

	private By _Male_Elem = By.xpath("//BUTTON[@ng-click='ctrl.updateDriverGender()']");

	private By ModelElem = By.xpath("//SELECT[@class='common-input-default__select ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");

	private By Number_of_AccidentsElem = By.xpath("//INPUT[@ng-change='ctrl.updateDriverAccidentCount()']");

	private By Number_of_traffic_ticketsElem = By.xpath("//INPUT[@ng-change='ctrl.updateDriverTrafficTicketsCount()']");

	private By Production_YearElem = By.xpath("//SELECT[@class='common-input-default__select ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");

	private By StreetElem = By.xpath("//INPUT[@ng-change='ctrl.updateAddressStreet()']");

	private By TypeElem = By.xpath("//SELECT[@class='common-input-default__select ng-pristine ng-untouched ng-valid ng-not-empty el-selection']");

	private By Zip_codeElem = By.xpath("//INPUT[@ng-change='ctrl.updateAddressZipCode()']");


	
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://motor-insurance-demo.hyperon.io/";

        if (!currentUrl.equals("https://motor-insurance-demo.hyperon.io/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click  Female 
     * @name Click  Female 
     */
	public void Click__Female_()
	{
        
		WebElement elem = getWebElement(_Female_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Female_", "Click__Female_ failed. Unable to locate object: " + _Female_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Female_", "Click__Female_ failed. Unable to locate object: " + _Female_Elem.toString());

			Assert.fail("Unable to locate object: " + _Female_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Female_");

		TestModellerLogger.PassStep(m_Driver, "Click__Female_");
	}
     
	/**
 	 * Click  Male 
     * @name Click  Male 
     */
	public void Click__Male_()
	{
        
		WebElement elem = getWebElement(_Male_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Male_", "Click__Male_ failed. Unable to locate object: " + _Male_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Male_", "Click__Male_ failed. Unable to locate object: " + _Male_Elem.toString());

			Assert.fail("Unable to locate object: " + _Male_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Male_");

		TestModellerLogger.PassStep(m_Driver, "Click__Male_");
	}
      
	/**
 	 * Enter City
     * @name Enter City
     */
 	public void Enter_City(String City)
 	{
 	    
 		WebElement elem = getWebElement(CityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_City", "Enter_City failed. Unable to locate object: " + CityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_City", "Enter_City failed. Unable to locate object: " + CityElem.toString());

 			Assert.fail("Unable to locate object: " + CityElem.toString());
         }

 		elem.sendKeys(City);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_City " + City);

  		TestModellerLogger.PassStep(m_Driver, "Enter_City " + City);
 	}
      
	/**
 	 * Enter Date of Birth
     * @name Enter Date of Birth
     */
 	public void Enter_Date_of_Birth(String Date_of_Birth)
 	{
 	    
 		WebElement elem = getWebElement(Date_of_BirthElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date_of_Birth", "Enter_Date_of_Birth failed. Unable to locate object: " + Date_of_BirthElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date_of_Birth", "Enter_Date_of_Birth failed. Unable to locate object: " + Date_of_BirthElem.toString());

 			Assert.fail("Unable to locate object: " + Date_of_BirthElem.toString());
         }

 		elem.sendKeys(Date_of_Birth);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Date_of_Birth " + Date_of_Birth);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date_of_Birth " + Date_of_Birth);
 	}
      
	/**
 	 * Enter Driver's Age
     * @name Enter Driver's Age
     */
 	public void Enter_Drivers_Age(String Drivers_Age)
 	{
 	    
 		WebElement elem = getWebElement(Drivers_AgeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Drivers_Age", "Enter_Drivers_Age failed. Unable to locate object: " + Drivers_AgeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Drivers_Age", "Enter_Drivers_Age failed. Unable to locate object: " + Drivers_AgeElem.toString());

 			Assert.fail("Unable to locate object: " + Drivers_AgeElem.toString());
         }

 		elem.sendKeys(Drivers_Age);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Drivers_Age " + Drivers_Age);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Drivers_Age " + Drivers_Age);
 	}
      
	/**
 	 * Enter Driver's age when license was obtained
     * @name Enter Driver's age when license was obtained
     */
 	public void Enter_Drivers_age_when_license_was_obtained(String Drivers_age_when_license_was_obtained)
 	{
 	    
 		WebElement elem = getWebElement(Drivers_age_when_license_was_obtainedElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Drivers_age_when_license_was_obtained", "Enter_Drivers_age_when_license_was_obtained failed. Unable to locate object: " + Drivers_age_when_license_was_obtainedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Drivers_age_when_license_was_obtained", "Enter_Drivers_age_when_license_was_obtained failed. Unable to locate object: " + Drivers_age_when_license_was_obtainedElem.toString());

 			Assert.fail("Unable to locate object: " + Drivers_age_when_license_was_obtainedElem.toString());
         }

 		elem.sendKeys(Drivers_age_when_license_was_obtained);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Drivers_age_when_license_was_obtained " + Drivers_age_when_license_was_obtained);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Drivers_age_when_license_was_obtained " + Drivers_age_when_license_was_obtained);
 	}
      
	/**
 	 * Enter First name
     * @name Enter First name
     */
 	public void Enter_First_name(String First_name)
 	{
 	    
 		WebElement elem = getWebElement(First_nameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_First_name", "Enter_First_name failed. Unable to locate object: " + First_nameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_First_name", "Enter_First_name failed. Unable to locate object: " + First_nameElem.toString());

 			Assert.fail("Unable to locate object: " + First_nameElem.toString());
         }

 		elem.sendKeys(First_name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_First_name " + First_name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_First_name " + First_name);
 	}
      
	/**
 	 * Enter Last name
     * @name Enter Last name
     */
 	public void Enter_Last_name(String Last_name)
 	{
 	    
 		WebElement elem = getWebElement(Last_nameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Last_name", "Enter_Last_name failed. Unable to locate object: " + Last_nameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Last_name", "Enter_Last_name failed. Unable to locate object: " + Last_nameElem.toString());

 			Assert.fail("Unable to locate object: " + Last_nameElem.toString());
         }

 		elem.sendKeys(Last_name);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Last_name " + Last_name);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Last_name " + Last_name);
 	}
      
	/**
 	 * Enter Number of Accidents
     * @name Enter Number of Accidents
     */
 	public void Enter_Number_of_Accidents(String Number_of_Accidents)
 	{
 	    
 		WebElement elem = getWebElement(Number_of_AccidentsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Number_of_Accidents", "Enter_Number_of_Accidents failed. Unable to locate object: " + Number_of_AccidentsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Number_of_Accidents", "Enter_Number_of_Accidents failed. Unable to locate object: " + Number_of_AccidentsElem.toString());

 			Assert.fail("Unable to locate object: " + Number_of_AccidentsElem.toString());
         }

 		elem.sendKeys(Number_of_Accidents);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Number_of_Accidents " + Number_of_Accidents);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Number_of_Accidents " + Number_of_Accidents);
 	}
      
	/**
 	 * Enter Number of traffic tickets
     * @name Enter Number of traffic tickets
     */
 	public void Enter_Number_of_traffic_tickets(String Number_of_traffic_tickets)
 	{
 	    
 		WebElement elem = getWebElement(Number_of_traffic_ticketsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Number_of_traffic_tickets", "Enter_Number_of_traffic_tickets failed. Unable to locate object: " + Number_of_traffic_ticketsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Number_of_traffic_tickets", "Enter_Number_of_traffic_tickets failed. Unable to locate object: " + Number_of_traffic_ticketsElem.toString());

 			Assert.fail("Unable to locate object: " + Number_of_traffic_ticketsElem.toString());
         }

 		elem.sendKeys(Number_of_traffic_tickets);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Number_of_traffic_tickets " + Number_of_traffic_tickets);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Number_of_traffic_tickets " + Number_of_traffic_tickets);
 	}
      
	/**
 	 * Enter Street
     * @name Enter Street
     */
 	public void Enter_Street(String Street)
 	{
 	    
 		WebElement elem = getWebElement(StreetElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Street", "Enter_Street failed. Unable to locate object: " + StreetElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Street", "Enter_Street failed. Unable to locate object: " + StreetElem.toString());

 			Assert.fail("Unable to locate object: " + StreetElem.toString());
         }

 		elem.sendKeys(Street);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Street " + Street);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Street " + Street);
 	}
      
	/**
 	 * Enter Zip code
     * @name Enter Zip code
     */
 	public void Enter_Zip_code(String Zip_code)
 	{
 	    
 		WebElement elem = getWebElement(Zip_codeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Zip_code", "Enter_Zip_code failed. Unable to locate object: " + Zip_codeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Zip_code", "Enter_Zip_code failed. Unable to locate object: " + Zip_codeElem.toString());

 			Assert.fail("Unable to locate object: " + Zip_codeElem.toString());
         }

 		elem.sendKeys(Zip_code);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Zip_code " + Zip_code);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Zip_code " + Zip_code);
 	}
	public void GoToUrl()
	{
		m_Driver.get("https://motor-insurance-demo.hyperon.io/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://motor-insurance-demo.hyperon.io/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://motor-insurance-demo.hyperon.io/");
	}

    
	/**
 	 * Select Make
     * @name Select Make
     */
    public void Select_Make(String Make)
 	{
 	    
 		WebElement elem = getWebElement(MakeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Make", "Select_Make failed. Unable to locate object: " + MakeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Make", "Select_Make failed. Unable to locate object: " + MakeElem.toString());

 			Assert.fail("Unable to locate object: " + MakeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Make);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Make " + Make);

 		TestModellerLogger.PassStep(m_Driver, "Select_Make " + Make);
 	}
    
	/**
 	 * Select Model
     * @name Select Model
     */
    public void Select_Model(String Model)
 	{
 	    
 		WebElement elem = getWebElement(ModelElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Model", "Select_Model failed. Unable to locate object: " + ModelElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Model", "Select_Model failed. Unable to locate object: " + ModelElem.toString());

 			Assert.fail("Unable to locate object: " + ModelElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Model);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Model " + Model);

 		TestModellerLogger.PassStep(m_Driver, "Select_Model " + Model);
 	}
    
	/**
 	 * Select Production Year
     * @name Select Production Year
     */
    public void Select_Production_Year(String Production_Year)
 	{
 	    
 		WebElement elem = getWebElement(Production_YearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Production_Year", "Select_Production_Year failed. Unable to locate object: " + Production_YearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Production_Year", "Select_Production_Year failed. Unable to locate object: " + Production_YearElem.toString());

 			Assert.fail("Unable to locate object: " + Production_YearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Production_Year);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Production_Year " + Production_Year);

 		TestModellerLogger.PassStep(m_Driver, "Select_Production_Year " + Production_Year);
 	}
    
	/**
 	 * Select Type
     * @name Select Type
     */
    public void Select_Type(String Type)
 	{
 	    
 		WebElement elem = getWebElement(TypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + TypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Type", "Select_Type failed. Unable to locate object: " + TypeElem.toString());

 			Assert.fail("Unable to locate object: " + TypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Type);
 		

 		ExtentReportManager.passStep(m_Driver, "Select_Type " + Type);

 		TestModellerLogger.PassStep(m_Driver, "Select_Type " + Type);
 	}}