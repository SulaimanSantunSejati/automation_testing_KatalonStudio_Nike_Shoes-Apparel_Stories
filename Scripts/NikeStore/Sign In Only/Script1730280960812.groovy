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
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

AppiumDriver driver

try {
	// Get the driver instance
	driver = MobileDriverFactory.getDriver()
} catch (Exception startApp) {
	// If driver initialization fails, start the application
	Mobile.startExistingApplication('com.nike.omega', FailureHandling.STOP_ON_FAILURE)
	driver = MobileDriverFactory.getDriver() 
} // End of app initialization

//Mobile.startApplication('C:\\Users\\sulai\\Katalon Studio\\NikeStore\\mobileapp\\Nike_ Shoes, Apparel & Stories.apk', true)
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/NikeStore/Button - Sign In'), 0)

Mobile.setText(findTestObject('Object Repository/NikeStore/inputEmail_setText'), 'fihokob723@aqqor.com', 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/NikeStore/Button - continue'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/NikeStore/inputPassword_setText'), 'Tonoyoga999', 0)

Mobile.hideKeyboard()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/NikeStore/Button - Sign In2'), 0)

Mobile.tap(findTestObject('Object Repository/NikeStore/Button - OK Notification'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

