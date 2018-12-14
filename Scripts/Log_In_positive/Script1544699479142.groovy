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

//var_username =''
//var_password ='burex007*#'

WebUI.openBrowser('https://www.masoko.com/')

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Shop Online in Kenya - Pay Con/p_Sign In'))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/email_textbox'), var_username)

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/password_textbox'), var_password)

WebUI.click(findTestObject('Object Repository/Page_Customer Login/button_Sign In'))

def success=WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Customer Login/Page_Customer Login/required_email'), 5, FailureHandling.CONTINUE_ON_FAILURE)
def success1=WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Customer Login/Page_Customer Login/required_password'),5,FailureHandling.CONTINUE_ON_FAILURE)
	
if(success){
	KeywordUtil.markFailed('Username is a required field')
}else if(success1) {
	KeywordUtil.markFailed('password is a required field')

}else{
	KeywordUtil.markPassed("Logged the user in successfully")
}
/*
//check if username or password error fields are present
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customer Login/Page_Customer Login/required_email'), 5)) {
	
	KeywordUtil.markFailed('Username is a required field')
	
}else if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Customer Login/Page_Customer Login/required_password'),5)) {
	
   KeywordUtil.markFailed('password is a required field')

}else{

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

if(WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Shop Online in Kenya - Pay Con/Page_Shop Online in Kenya - Pay Con/span_Register'), 10, FailureHandling.STOP_ON_FAILURE)){
	
	KeywordUtil.markPassed("Logged the user in successfully")
}

}

*/



