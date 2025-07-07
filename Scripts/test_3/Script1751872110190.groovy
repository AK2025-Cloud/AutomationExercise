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


// Step 1: Launch browser
WebUI.openBrowser('')

// Step 2: Navigate to URL
WebUI.navigateToUrl('https://www.automationexercise.com/')

// Step 3: Verify that home page is visible successfully
WebUI.verifyElementPresent(findTestObject('Object Repository/Automation_Exercise/Home_Page/logo_AutomationExercise'), 10)

// Step 4: Click 'Products' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Home_Page/button_Product'))

// Step 5: Hover over first product and click 'Add to cart'
WebUI.mouseOver(findTestObject('Object Repository/Automation_Exercise/Product_Page/product_1'))

WebUI.click(findTestObject('Object Repository/Automation_Exercise/Product_Page/product_1_AddToCart'))
WebUI.delay(2)

// Step 6: Click 'Continue Shopping' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Product_Page/button_Continue Shopping'))
WebUI.delay(2)

// Step 7: Hover over second product and click 'Add to cart'
WebUI.mouseOver(findTestObject('Object Repository/Automation_Exercise/Product_Page/product_2'))
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Product_Page/product_2_AddToCart'))

// Step 8: Click 'View Cart' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Product_Page/button_ViewCart'))

// Step 9: Verify both products are added to Cart
WebUI.verifyElementPresent(findTestObject('Object Repository/Automation_Exercise/View _Cart/product_1_in_cart'), 
    0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Automation_Exercise/View _Cart/product_2_in_cart'), 
    0)

// Step 10: Verify their prices, quantity and total price
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/View _Cart/product_1_price'), 'Rs. 500')
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/View _Cart/product_1_quantity'), '1')
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/View _Cart/product_1_total'), 'Rs. 500')


WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/View _Cart/product_2_price'), 'Rs. 400')
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/View _Cart/product_2_quantity'), '1')
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/View _Cart/product_2_total'), 'Rs. 400')

// Optional: Close browser
