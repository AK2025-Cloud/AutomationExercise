import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.exception.StepFailedException
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

try {
//1. Launch browser
WebUI.openBrowser('')

//2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('https://automationexercise.com/')

//3. Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Home_Page/lnk_Home'))

//4. Click on 'Signup / Login' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Home_Page/lnk_Signup Login'))

//5. Verify 'Login to your account' is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Login_Page/lbl_Login to your account'))

//6. Enter correct email address and password
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/Login_Page/txt_Login_email_id'),'akokare267@gmail.com')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/Login_Page/txt_Login_password'), 'Pravin#1234')

//7. Click 'login' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Login_Page/btn_Login'))

}
catch (Exception e) {
	WebUI.comment("UNEXPECTED ERROR " + e.getMessage())
}

catch(StepFailedException e)
{
	WebUI.comment("FAILED EXCEPTION " + e.getMessage())
}

finally
{
	WebUI.closeBrowser()
}
