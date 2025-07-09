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
import com.kms.katalon.core.exception.StepFailedException


try {
//1 Open Browser
WebUI.openBrowser('')

//2 Navigate To ur
WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.maximizeWindow()

//3 Verify Home Page
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/HomePage/button_Home'))

//4 Click on 'Signup/ Login' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/HomePage/button_Signup Login'))

//6 Enter name and email address
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/LoginPage/txt_NewUser_name'),
	'AK Test ')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/LoginPage/txt_NewUser_email'),
	'akokare267@gmail.com')

//7. Click 'Signup' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/LoginPage/btn_Signup'))

//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/SignupPage/lbl_Enter Account Information'),
	FailureHandling.STOP_ON_FAILURE)

//9. Fill details: Title, Name, Email, Password, Date of birth
WebUI.click(findTestObject('Object Repository/Automation_Exercise/SignupPage/rb_Mr_title'))

WebUI.setEncryptedText(findTestObject('Object Repository/Automation_Exercise/SignupPage/pwd__password'), 'xoXFLQTYnh1tPc2mYgRi3w==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_Exercise/SignupPage/dd_Day'),
	'2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_Exercise/SignupPage/dd_Month'),
	'1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_Exercise/SignupPage/dd_Year'),
	'1996', true)

//10. Select checkbox 'Sign up for our newsletter!'
WebUI.click(findTestObject('Object Repository/Automation_Exercise/SignupPage/cb_Receive_special_offers_from_our_partners'))

//11. Select checkbox 'Receive special offers from our partners!'
WebUI.click(findTestObject('Object Repository/Automation_Exercise/SignupPage/cb_Sign_up_for_our_newsletter_option'))

//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__first_name'), 'AK')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__last_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt_company'), 'QA India LLP')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt_address_1'), 'Genda Circle')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt_address2'), 'Gujarat')

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_Exercise/SignupPage/dd_country'), 'Canada',
	true)

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__state'), 'Gujarat')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__city'), 'Vadodara')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__zipcode'), '390002')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt_mobile_number'), '9876543211')

//13. Click 'Create Account button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/SignupPage/btn_Create Account'))

WebUI.delay(3)

//14. Verify that 'ACCOUNT CREATED!' is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/AccountCreatedPage/lbl_Account Created'))

//15. Click 'Continue' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/AccountCreatedPage/lnk_Continue'))

//16. Verify that 'Logged in as username' is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/HomePage/lnk_Logged in as Ak Test'))

//17. Click 'Delete Account' button
//WebUI.click(findTestObject('Object Repository/Automation_Exercise/HomePage/button_Delete Account'))

//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/DeleteAccountPage/lbl_Account Deleted'))
WebUI.click(findTestObject('Object Repository/Automation_Exercise/AccountCreatedPage/lnk_Continue'))
System.out.println('Test Pass')

}


catch (Exception e)
{
   WebUI.comment("UNEXPECTED ERROR: " + e.getMessage())
}

catch (StepFailedException e)
{
   WebUI.comment("STEP FAILED: " + e.getMessage())
}

 finally
 {
	// ──────────────── TEARDOWN ─────────────────────
//  WebUI.closeBrowser()
 }



