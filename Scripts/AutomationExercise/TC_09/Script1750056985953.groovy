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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static org.junit.Assert.*

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

//6. Enter product name in search input and click search button
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/Product_Details_Page/lbl_Searched Products'), 'women')

//7. Verify 'SEARCHED PRODUCTS' is visible

// Wait for search results to load
 WebUI.delay(2)  

// Get list of all product items
List<WebElement> products = WebUI.findWebElements(findTestObject('Object Repository/Automation_Exercise/Product_Details_Page/lbl Searched Women product'), 10)

// Verify each product is displayed
for (WebElement product : products) {
	assert product.isDisplayed() : "Product is not visible!"
}


//8. Verify all the products related to search are visible