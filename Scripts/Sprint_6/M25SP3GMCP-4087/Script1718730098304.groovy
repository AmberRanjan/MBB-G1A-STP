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

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/01_VertifyText - Step 2 of 4'), 'Step 2 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/04_Step_2/02_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/01_VerifyText- Step 1 of 4'), 'Step 1 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5477520150183042140.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/20_TapOnConfirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/01_VertifyText - Step 2 of 4'), 'Step 2 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/03_VerifyText - Address line 1'), 'Address line 1')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/04_EnterSpecCharAdd1 - e.g Unit noFloorBuilding'), '!@#$%^&*',
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/05_VerifyText - Please remove invalid special characters'),
	'Please remove invalid special characters.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1279726995976301479.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/06_ClearAdd1Text'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1719307726234203765.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/07_Set45charText- e.g Unit noFloorBuilding'), 'ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot596750611063364292.png')

String add1 = Mobile.getText(findTestObject('Object Repository/Sprint_6/04_Step_2/08_GetText - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

if (add1.length() <= 40) {
	print(add1)
}

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/09_ClearTextAdd1- ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/10_SetTextAdd1 - e.g Unit noFloorBuilding'), 'Address Line 1',
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/11_VerifyText - Address line 2'), 'Address line 2')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/12_SetSpecialCharAdd2 - e.g Street name'), '!@#$%^',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4357515268223348785.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/13_VerifyText - Please remove invalid special characters'),
	'Please remove invalid special characters.')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/14_ClearTextAdd2'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8520674992796689683.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/15_Set45CharAdd2- e.g Street name'), 'ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3448864831915886155.png')

String add2 = Mobile.getText(findTestObject('Object Repository/Sprint_6/04_Step_2/16_GetAdd2Text - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

if (add2.length() <= 40) {
	print(add2)
}

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/17_ClearTextAdd2 - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3614203697523529728.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/18_SetAdd2 - e.g Street name'), 'Address Line 2', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6212573449415243570.png')


Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/19_VerifyText - Address line 3'), 'Address line 3 ')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/20_SetSpecialTextAdd3 - e.g Neighbourhood name'), '!@#$%^',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3026994104438566520.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/21_VerifyText - Please remove invalid special characters'),
	'Please remove invalid special characters.')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/22_ClearTextAdd3'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/23_SetText45Char- e.g Neighbourhood name'), 'ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8829107557989389341.png')

String add3 = Mobile.getText(findTestObject('Object Repository/Sprint_6/04_Step_2/24_GetTextAdd3 - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

if (add3.length() <= 40) {
	print(add3)
}


Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/25_VerifyText - Postcode'), 'Postcode')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/26_Enter4charPostcode- e.g 88888'), '8582', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/27_VerifyText- Postcode should not be less than 5 characters'),
	'Postcode should not be less than 5 characters.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7321476290112920921.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/28_ClearPostcode- 8582'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/29_SetText7char - e.g 88888'), '53000', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8499569493175815261.png')

/*
String post = Mobile.getText(findTestObject('Object Repository/Sprint_6/04_Step_2/30_GetText- 80005'), 0)

if (post.length() <= 40) {
	print(post)
}
*/

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/31_VerifyText- State'), 'State')

Mobile.tap(findTestObject('Object Repository/Sprint_6/04_Step_2/32_TapOnDropdown- Please select'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4735768699792071045.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/04_Step_2/33_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3224899803411420302.png')

Mobile.swipe(0, 400, 0, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/34_VerifyText - City'), 'City')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/35_SetSpecialChar- e.g Kuala Lumpur'), '!@#$%', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7595751693204551862.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/36_VerifyText - Invalid city'), 'Invalid city')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/37_ClearText'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/38_SetNumericValue- e.g Kuala Lumpur'), '123456789',
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/39_VerifyText - Invalid city'), 'Invalid city')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2947423787306444568.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/40_ClearText - 123456789'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot425285490147212005.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/41_Enter45CharCity - e.g Kuala Lumpur'), 'ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3749186300588292338.png')

String city = Mobile.getText(findTestObject('Object Repository/Sprint_6/04_Step_2/42_GetTextCity - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

if (city.length() <= 40) {
	print(city)
}

Mobile.clearText(findTestObject('Object Repository/Sprint_6/04_Step_2/43_ClearTextCity - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)


Mobile.setText(findTestObject('Object Repository/Sprint_6/04_Step_2/44_SetKualaLumpur - e.g Kuala Lumpur'), 'Kuala Lumpur',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1505256414750667401.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/04_Step_2/45_TapOnNext'), 0)


