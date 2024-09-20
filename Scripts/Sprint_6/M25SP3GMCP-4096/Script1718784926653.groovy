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

//Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/28_VerifyText - Sector'), 'Sector')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/29_TapOnSectorDropdown- Please select'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2415314251478638344.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/30_TapOnSearchfield - Type to search'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1470703033341366458.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/31_SetIncorrectText - Type to search'), 'AAAAAAAA',
	0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/08_VerifyText - No Results Found'), 'No Results Found')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/47_VerifyText - Please select the category that is the closest match to your sector'), 
    'Please select the category that is the closest match to your sector.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2415314251478638344.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/05_Step_3/32_ClearText - AAAAAAAA'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2415314251478638344.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/33_SetSpecialChar- Type to search'), '!@#$%^', 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/08_VerifyText - No Results Found'), 'No Results Found')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/47_VerifyText - Please select the category that is the closest match to your sector'), 
    'Please select the category that is the closest match to your sector.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7771281568955216018.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/05_Step_3/34_ClearText'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2415314251478638344.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/35_SetTextEducation'), 'Education', 0)

Mobile.delay(3)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2415314251478638344.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/36_TapOn- Education'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/36_TapOn- Education'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2415314251478638344.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/37_VerifyText- Employment type'), 'Employment type')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/38_TapOnEmpDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4296127200900169494.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/39_TapOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/01_VerifyText - Step 3 of 4'), 'Step 3 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/38_TapOnEmpDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4296127200900169494.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/40_TapOn - Employer'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/41_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot560090691396218714.png')



















