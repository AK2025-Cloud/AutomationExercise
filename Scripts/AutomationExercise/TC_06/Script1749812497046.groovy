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
//1. Launch browser
WebUI.openBrowser('')

//2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('https://automationexercise.com/')
WebUI.maximizeWindow()

//3. Verify that home page is visible successfully
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Home_Page/lnk_Home'))

//4. Click on 'Contact Us' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Home_Page/lnk_Contact us'))

//5. Verify 'GET IN TOUCH' is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Contact_US Page/lbl_Get In Touch'))

//6. Enter name, email, subject and message
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/Contact_US Page/txt_name'), 'AK Test')
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/Contact_US Page/txt_email'), 'akokare267@gmail.com')
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/Contact_US Page/txt_subject'), 'Test Sample_1')
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/Contact_US Page/txt_message_box'),'This is a first Sample Test')

//7. Upload file 
String path = "C:/Users/AXKokare/OneDrive - Express Employment Professionals/Desktop/EXP018/General/image (1).png"
WebUI.uploadFile(findTestObject('Object Repository/Automation_Exercise/Contact_US Page/input_upload_file'),path)

//8. Click 'Submit' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Contact_US Page/btn_submit'))

//9. Click OK button
WebUI.waitForAlert(10)
WebUI.acceptAlert()

//10. Verify success message 'Success! Your details have been submitted successfully.' is visible
WebUI.verifyElementfindTestObject('Object Repository/Automation_Exercise/Contact_US Page/msg_Success Your details have been submitted successfully')Visible()

//11. Click 'Home' button and verify that landed to home page successfully
WebUI.click(findTestObject('Object Repository/Automation_Exercise/Contact_US Page/link_Home'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/Home_Page/lnk_Home'))
}

catch(Exception e)
{
	WebUI.comment("UNEXPECTED ERROR " + e.getMessage())
}
catch(StepFailedException e)
{
	WebUI.comment("STEPFAILED EXCEPTION " + e.getMessage())
}
finally
{
	WebUI.closeBrowser()
}

