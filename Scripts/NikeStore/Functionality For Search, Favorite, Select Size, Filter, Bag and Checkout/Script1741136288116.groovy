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
}
catch (Exception startApp) {
    Mobile.startExistingApplication('com.nike.omega', FailureHandling.STOP_ON_FAILURE)

    driver = MobileDriverFactory.getDriver()
} // If driver initialization fails, start the application

//End of app initialization


///search product
Mobile.tap(findTestObject('NikeStore/Search_.Button'), 0)

Mobile.setText(findTestObject('NikeStore/set Search'), 'Air Jordan 1 Mid', 0)

Mobile.tap(findTestObject('NikeStore/Suggest - Air Jordan 1 Mid'), 0)

//choose product
Mobile.tap(findTestObject('NikeStore/Air Jordan 1 Mid SE - ChooseTypeShoes'), 0)

Mobile.scrollToText('Shown', FailureHandling.STOP_ON_FAILURE)

//select size
Mobile.tap(findTestObject('NikeStore/button - Select Size'), 0)

Mobile.tap(findTestObject('NikeStore/sice eu 35,5'), 0)

Mobile.scrollToText('Country', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//assert product details
Mobile.tap(findTestObject('NikeStore/button - View Product Details'), 0)

Mobile.getText(findTestObject('NikeStore/Get Text - Product Details'), 0)

Mobile.tap(findTestObject('NikeStore/back - button'), 0)


//assert size guide
Mobile.tap(findTestObject('NikeStore/button - SizeAndFit'), 0)

Mobile.tap(findTestObject('NikeStore/button - Size Guide'), 0)

Mobile.getText(findTestObject('NikeStore/GetText - Nike Size Charts'), 0)

Mobile.tap(findTestObject('NikeStore/back - button'), 0)

//assert reviews 
Mobile.tap(findTestObject('NikeStore/Reviews - Button'), 0)

Mobile.scrollToText('See More Review', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('NikeStore/button - See More Reviews'), 0)

//assert filter
Mobile.tap(findTestObject('NikeStore/button - Sort By (filter)'), 0)

Mobile.tap(findTestObject('NikeStore/button - Newest'), 0)

Mobile.tap(findTestObject('NikeStore/button - Sort By (filter)'), 0)

Mobile.tap(findTestObject('NikeStore/button - Oldest'), 0)

Mobile.tap(findTestObject('NikeStore/button - Sort By (filter)'), 0)

Mobile.tap(findTestObject('NikeStore/button - Highest to Lowest'), 0)

Mobile.tap(findTestObject('NikeStore/button - Sort By (filter)'), 0)

Mobile.tap(findTestObject('NikeStore/button - Lowest to Highest'), 0)

Mobile.tap(findTestObject('NikeStore/back - button'), 0)

Mobile.scrollToText('Shown', FailureHandling.STOP_ON_FAILURE)

//add product to bag and checkout
Mobile.tap(findTestObject('NikeStore/AddToBag-Button'), 0)

Mobile.tap(findTestObject('NikeStore/Button - Checkout'), 0)

Mobile.tap(findTestObject('NikeStore/Close - button'), 0)

Mobile.tap(findTestObject('NikeStore/Qty'), 0)

//bag Qty check
Mobile.tap(findTestObject('NikeStore/addMoreQty - Button - 2'), 0)

Mobile.tap(findTestObject('NikeStore/Button - Done'), 0)

Mobile.getText(findTestObject('NikeStore/getText - Qty 2'), 0)

Mobile.tap(findTestObject('NikeStore/Qty'), 0)

Mobile.tap(findTestObject('NikeStore/Qty Button - 1'), 0)

Mobile.tap(findTestObject('NikeStore/Button - Remove'), 0)

Mobile.tap(findTestObject('NikeStore/Button - Done'), 0)

Mobile.getText(findTestObject('NikeStore/GetText - Your Bag is empty'), 0)

Mobile.tap(findTestObject('NikeStore/back - button'), 0)

//add to favorite
Mobile.tap(findTestObject('NikeStore/Favorite - Button'), 0)

Mobile.getText(findTestObject('NikeStore/GetText - Removed from Favorites'), 0)

