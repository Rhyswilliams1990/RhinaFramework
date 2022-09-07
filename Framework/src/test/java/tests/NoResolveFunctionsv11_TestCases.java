package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://curiosity.partner.testinsights.io/app/#!/model-engine/guid/f06852e8-8218-42e4-8ad6-3569adcf2c14
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 7580, profileId = 115886)
public class NoResolveFunctionsv11_TestCases extends TestBase
{
    

    
    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "0368f3e4-adf3-4e78-be1b-dc3eab63ec9c")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("0390019b-31d4-4d7d-85bc-46b4011bd105");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("100.2.22");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "bdb7a7ab-a85c-42aa-8fa4-790593579ad8")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree1()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/2023");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("0390019b-31d4-4d7d-85bc-46b4011bd105");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("-100");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "9947bf5f-eb03-4c41-8675-fa9556cb55d1")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree2()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "aa8b43f1-b9e9-4bba-a09e-59c1839a530c")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree3()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("f3fed197-08fd-428a-8cb9-7f21067a2e81");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("100.2.22");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "54042246-7197-4d39-9469-329afc21e510")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree4()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("f3fed197-08fd-428a-8cb9-7f21067a2e81");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("-100");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "4a084140-1b39-4baa-b7aa-4ead69764791")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree5()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "0d0ca98a-3a1b-449d-a6dc-620a0e9d70fa")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree6()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "e32dc8a8-d2c1-43b2-b01d-7ca2b39eadab")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree7()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "f1cd63a2-ddfd-4448-b5c3-210255e95288")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStree8()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "84614971-e73b-4c80-a7c4-f7fdb9aa2078")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "46abc287-92c4-4977-8cbf-4cb58f04b9dd")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre1()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "aca4e66d-68cf-470b-88bb-661811527326")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre2()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "b52b5e58-682c-44d8-8fe2-7a9fe174d9cc")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre3()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "fa3f0bb7-2702-4fff-852a-683cb30073cf")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre4()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "1d772d2f-9e9b-46c5-9ef0-db45efa73dbf")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre5()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "76aa5b26-a1c1-41a0-bc26-8f359c1abd84")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre6()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "2ce0e8b8-b9d1-478e-884d-ca6c49956bd7")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre7()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "d50bed65-e37f-4105-992a-685eaea6bfce")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre8()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "6261920d-898c-4a72-96ac-0042edea316e")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre9()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "2794df62-e1fb-44cd-a419-8383171e2876")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre10()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "7d6829a2-f2c0-48ea-ac65-4fc396bddfd6")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre11()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "01dcb467-91d3-4fd9-a817-c0e6d53644e3")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre12()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "d8973d87-b3f8-462e-86a5-e2fee84e4668")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre13()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "550e6094-f63d-457d-9f2f-9e1890743817")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre14()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "421da563-aae0-4c6d-a458-b3672795c8bc")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre15()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "a8157e2e-893d-46a3-aa65-eb5c86b0e5ca")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre16()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "823e239c-ef5e-43cb-8966-fa35211086c0")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre17()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "48f3321e-0d57-4628-9d16-6f78117bc39c")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre18()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "27b0bf7f-0486-4094-805e-8661b7aca1e7")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre19()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "6d782d7f-4c30-440a-ba1c-e56501d7e859")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre20()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "516e2657-0372-457c-abf0-66daefc5cfea")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre21()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "f261d0c9-8a7c-493c-87be-70e896b99cb8")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickFemaleEnterZipcodeEnterCityEnterStre22()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("00b75226-bc33-4ebc-afe2-d91182ebda85");
    _Hyperon_Demo_App.Click__Female_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("a1796f10-4073-497b-9898-bb2ce2ac95a1");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("0");

    TestModellerLogger.SetLastNodeGuid("c4ccf916-f85c-4b5d-af8e-a67907d81887");
    _Hyperon_Demo_App.Enter_Number_of_traffic_tickets("0");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "9d11375c-7c11-4c00-8190-3bd71062b59e")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthClickMaleEnterZipcodeEnterCityEnterStreet()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    TestModellerLogger.SetLastNodeGuid("3c53fe85-a96c-49be-8af6-291e63cf3c85");
    _Hyperon_Demo_App.Click__Male_();

    TestModellerLogger.SetLastNodeGuid("4d14060f-41fb-4a48-8e29-ad47d17e0956");
    _Hyperon_Demo_App.Enter_Zip_code("77898-8632");

    TestModellerLogger.SetLastNodeGuid("3677286f-9e26-4629-88a3-d03b648725a9");
    _Hyperon_Demo_App.Enter_City("South Akeem");

    TestModellerLogger.SetLastNodeGuid("cf4169ef-864f-48d3-a227-55727924fcaf");
    _Hyperon_Demo_App.Enter_Street("5386 Lehner Centers");

    TestModellerLogger.SetLastNodeGuid("e53b4f21-2bc2-4707-8359-4e73354a99ce");
    _Hyperon_Demo_App.Enter_Drivers_age_when_license_was_obtained("22");

    TestModellerLogger.SetLastNodeGuid("0390019b-31d4-4d7d-85bc-46b4011bd105");
    _Hyperon_Demo_App.Enter_Number_of_Accidents("100.2.22");

    }


    @Test  (groups= {"No Resolve Functions v1.1","No Resolve Functions v1.1 - Test Cases"})
    @TestModellerPath(guid = "3f690a47-c73b-4a8f-95f3-ce1fc2c2620b")
    public void GoToUrlEnterFirstnameEnterLastnameEnterDateofBirthUnsuccessful()
    {
        
        pages.Hyperon_Demo_App _Hyperon_Demo_App = new pages.Hyperon_Demo_App(driver);
    TestModellerLogger.SetLastNodeGuid("958b65cd-1559-4bf6-9d69-32b156832e0d");
    _Hyperon_Demo_App.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("11a0cf6d-8b83-4247-a198-97404f533524");
    _Hyperon_Demo_App.Enter_First_name("Coby");

    TestModellerLogger.SetLastNodeGuid("9a6f2696-03e1-4ede-90d6-3f5139ad945f");
    _Hyperon_Demo_App.Enter_Last_name("Baumbach");

    TestModellerLogger.SetLastNodeGuid("309ce5f4-d464-475e-8bc2-33dbb94a78e0");
    _Hyperon_Demo_App.Enter_Date_of_Birth("20/10/1964");

    }


}