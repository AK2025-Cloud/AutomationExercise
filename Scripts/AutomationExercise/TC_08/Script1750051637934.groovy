import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.exception.StepFailedException

try {
//1. Launch browser
WebUI.openBrowser('')

//2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')

//3. Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Home_Page/lnk_Home'))

//4. Click on 'Products' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Home_Page/lnk_Products'))

//5. Verify user is navigated to ALL PRODUCTS page successfully
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Product_Page/lbl_All Products'))

//6. The products list is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Product_Page/lbl_Category'))

//7. Click on 'View Product' of first product
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Product_Page/lnk_View Product'))

//8. User is landed to product detail page
WebUI.verifyMatch(WebUI.getUrl(), 'https://automationexercise.com/product_details/1', false)

//9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Product_Details_Page/lbl_product_1_Blue Top'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Product_Details_Page/lbl_Category Women Tops'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Product_Details_Page/lbl_Rs. 500'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Product_Details_Page/lbl_Availability_In_Stock'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Product_Details_Page/lbl_Condition_New'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Product_Details_Page/lbl_Brand Polo'))

} 
catch(Exception e)
{
	WebUI.comment("UNEXPECTED ERROR " + e.getMessage() )
}
catch(StepFailedException e)
{
	WebUI.comment("STEPFAILED EXCEPTION" + e.getMessage())
}
finally
{
	WebUI.closeBrowser()
}



