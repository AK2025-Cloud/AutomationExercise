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







//1. Launch browser
WebUI.openBrowser('')

//2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('http://automationexercise.com')
WebUI.maximizeWindow();

//3. Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Home_Page/lnk_Home'))

//4. Scroll down to footer
WebUI.executeJavaScript('window.scrollBy(0,8000)',[])

//5. Verify text 'SUBSCRIPTION'
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Util/lbl_Subscription'))

//6. Enter email address in input and click arrow button
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/View _Cart/txt_Subscription_susbscribe_email'), 'akokare267@gmail.com')
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Util/btn_Subscription_subscribe'))

//7. Verify success message 'You have been successfully subscribed!' is visible
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/Util/msg_subsciption_successful'),
	'You have been successfully subscribed!')





