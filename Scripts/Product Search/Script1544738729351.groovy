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

WebUI.openBrowser('https://www.masoko.com/')

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Search_Objects/Page_Shop Online in Kenya - Pay Con/search_product'), var_product_name)

WebUI.click(findTestObject('Object Repository/Search_Objects/Page_Shop Online in Kenya - Pay Con/button_Search'))

def success=WebUI.waitForElementPresent(findTestObject('Object Repository/Search_Objects/Page_Search results for iphone/search_indicator_reslt'), 10, FailureHandling.CONTINUE_ON_FAILURE)

if(success){
	KeywordUtil.markPassed("Successfully search for product")
}else{
	KeywordUtil.markFailed("Failed to search for specified product")

}