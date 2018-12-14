import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
////mark utility
import com.kms.katalon.core.util.KeywordUtil

/*
reg_firstname='kirebu'
reg_lastname='kibonyo'
reg_mobile='702987539'
reg_email='kibo@gmail.com'
reg_pword='burex78*#'
reg_conf_pword='burex78*#'*/

WebUI.openBrowser('https://www.masoko.com/')

WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Register_Objects/Register_span'))

WebUI.setText(findTestObject('Object Repository/Register_Objects/Page_Create New Customer Account/first_name'), reg_firstname)
WebUI.setText(findTestObject('Object Repository/Register_Objects/Page_Create New Customer Account/last_name'),reg_lastname)
WebUI.setText(findTestObject('Object Repository/Register_Objects/Page_Create New Customer Account/mobile_no'),reg_mobile)
WebUI.setText(findTestObject('Object Repository/Register_Objects/Page_Create New Customer Account/email'),reg_email)
WebUI.setText(findTestObject('Object Repository/Register_Objects/Page_Create New Customer Account/password'),reg_pword)
WebUI.setText(findTestObject('Object Repository/Register_Objects/Page_Create New Customer Account/confirm_password'),reg_conf_pword)

WebUI.click(findTestObject('Object Repository/Register_Objects/Page_Create New Customer Account/create_account_btn'))
def success=WebUI.waitForElementVisible(findTestObject('Object Repository/Register_Objects/Page_Customer Login/confirm_account_success'), 10, FailureHandling.CONTINUE_ON_FAILURE)
if(success){
	KeywordUtil.markPassed("User registration successful")
}else{
    KeywordUtil.markFailed("Failed to register user")
}