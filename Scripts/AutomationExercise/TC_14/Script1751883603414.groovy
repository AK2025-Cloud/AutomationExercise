import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject


//1. Launch browser
WebUI.openBrowser('')

//2. Navigate to url 'http://automationexercise.com'
WebUI.navigateToUrl('https://www.automationexercise.com/')

WebUI.maximizeWindow()

//3. Verify that home page is visible successfully
WebUI.verifyElementPresent(findTestObject('Object Repository/Automation_Exercise/HomePage/logo_AutomationExercise'), 0)

//4. Add products to cart
WebUI.click(findTestObject('Object Repository/Automation_Exercise/HomePage/button_Product'))

WebUI.mouseOver(findTestObject('Object Repository/Automation_Exercise/ProductPage/product_1'))

WebUI.click(findTestObject('Object Repository/Automation_Exercise/ProductPage/product_1_AddToCart'))

//5. Click 'Cart' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/ProductPage/button_ViewCart'))

//6. Verify that cart page is displayed
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/HomePage/button_Cart'))

//7. Click Proceed To Checkout
WebUI.click(findTestObject('Object Repository/Automation_Exercise/CheckoutPage/btn_Proceed To Checkout'))

//8. Click 'Register / Login' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/ViewCartPage/button_Register_or_Login'))

//9. Fill all details in Signup and create account
// Enter name and email address
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/LoginPage/txt_NewUser_name'), 'AK Test ')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/LoginPage/txt_NewUser_email'), 'akokare267@gmail.com')

//Click 'Signup' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/LoginPage/btn_Signup'))

WebUI.delay(3)

//Verify that 'ENTER ACCOUNT INFORMATION' is visible
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/SignupPage/lbl_Enter Account Information'))

//Fill details: Title, Name, Email, Password, Date of birth
WebUI.click(findTestObject('Object Repository/Automation_Exercise/SignupPage/rb_Mr_title'))

WebUI.setEncryptedText(findTestObject('Object Repository/Automation_Exercise/SignupPage/pwd__password'), 'xoXFLQTYnh1tPc2mYgRi3w==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_Exercise/SignupPage/dd_Day'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_Exercise/SignupPage/dd_Month'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_Exercise/SignupPage/dd_Year'), '1996', true)

// Select checkbox 'Sign up for our newsletter!'
WebUI.click(findTestObject('Object Repository/Automation_Exercise/SignupPage/cb_Receive_special_offers_from_our_partners'))

// Select checkbox 'Receive special offers from our partners!'
WebUI.click(findTestObject('Object Repository/Automation_Exercise/SignupPage/cb_Sign_up_for_our_newsletter_option'))

// Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__first_name'), 'AK')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__last_name'), 'Test')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt_company'), 'QA India LLP')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt_address_1'), 'Genda Circle')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt_address2'), 'Gujarat')

WebUI.selectOptionByValue(findTestObject('Object Repository/Automation_Exercise/SignupPage/dd_country'), 'Canada', true)

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__state'), 'Gujarat')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__city'), 'Vadodara')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt__zipcode'), '390002')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/SignupPage/txt_mobile_number'), '9876543211')

// Click 'Create Account button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/SignupPage/btn_Create Account'))

WebUI.delay(3)

//10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/AccountCreatedPage/lbl_Account Created'))

WebUI.click(findTestObject('Object Repository/Automation_Exercise/AccountCreatedPage/lnk_Continue'))

//11. Verify ' Logged in as username' at top
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/HomePage/lnk_Logged in as Ak Test'), 'Logged in as AK Test')

//12.Click 'Cart' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/HomePage/button_Cart'))

//13. Click 'Proceed To Checkout' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/CheckoutPage/btn_Proceed To Checkout'))

//14. Verify Address Details and Review Your Order
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/CheckoutPage/h2_Review Your Order'), 'Review Your Order')

WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/CheckoutPage/h3_Your delivery address'), 'YOUR DELIVERY ADDRESS')

//15. Enter description in comment text area and click 'Place Order'
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/CheckoutPage/txt_checkout_comment'), 'No comment')

WebUI.click(findTestObject('Object Repository/Automation_Exercise/CheckoutPage/btn_Place Order'))

//16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
WebUI.setText(findTestObject('Object Repository/Automation_Exercise/PaymentPage/input_Name_on_Card'), 'AK Test')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/PaymentPage/input_Card_Number'), '321165449877')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/PaymentPage/input_CVC_cvc'), '321')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/PaymentPage/input_Expiration_expiry_month'), '08')

WebUI.setText(findTestObject('Object Repository/Automation_Exercise/PaymentPage/input_Expiration_expiry_year'), '1997')

////17. Click 'Pay and Confirm Order' button
WebUI.click(findTestObject('Object Repository/Automation_Exercise/PaymentPage/btn_Pay and_Confirm_Order'))

WebUI.back()
////18. Verify success message 'Your order has been placed successfully!'
WebUI.verifyElementText(findTestObject('Object Repository/Automation_Exercise/PaymentPage/msg_Your order has been placed successfully'), 'Your order has been placed successfully!')

//19. Click 'Delete Account' button

WebUI.click(findTestObject('Object Repository/Automation_Exercise/HomePage/button_Delete Account'))

//20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
WebUI.verifyElementVisible(findTestObject('Object Repository/Automation_Exercise/DeleteAccountPage/lbl_Account Deleted'))

WebUI.click(findTestObject('Object Repository/Automation_Exercise/AccountCreatedPage/lnk_Continue'))

System.out.println('Test Pass')

