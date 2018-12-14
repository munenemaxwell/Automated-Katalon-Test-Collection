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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.masoko.com/')

WebUI.click(findTestObject('Object Repository/Cart_Objects/Page_Shop Online in Kenya - Pay Con/p_Sign In'))

WebUI.setText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s'), 'maxwellmunene007@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_1'), 
    'IoSAFDrw05c=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_2'), 
    'f+ODBdOqX5Q=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_3'), 
    'nIzuaSDACYk=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_4'), 
    'I0oX5RFPQ1w=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_5'), 
    '5o6aMgy6h/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_6'), 
    'wqFlwFYtgbE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_7'), 
    'iBT/bRb8m+U=')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_10'), 
    'N2+i4HCLyNpNLDdzQrIihg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_8'), 
    'N2+i4HCLyNoyfnV2b3En1A==')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_9'), 
    'N2+i4HCLyNo2N9S1k3lU+Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/input_If you have an account s_11'), 
    'N2+i4HCLyNpNLDdzQrIihg==')

WebUI.click(findTestObject('Object Repository/Cart_Objects/Page_Customer Login/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Cart_Objects/Page_Shop Online in Kenya - Pay Con/input_Search_q'), 'iphone')

WebUI.click(findTestObject('Object Repository/Cart_Objects/Page_Shop Online in Kenya - Pay Con/button_Search'))

WebUI.click(findTestObject('Object Repository/Cart_Objects/Page_Search results for iphone/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Cart_Objects/Page_Search results for iphone/span_My Cart'))

WebUI.click(findTestObject('Object Repository/Cart_Objects/Page_Search results for iphone/span_Go to Checkout'))

WebUI.click(findTestObject('Object Repository/Cart_Objects/Page_Checkout/label_Standard Delivery'))

