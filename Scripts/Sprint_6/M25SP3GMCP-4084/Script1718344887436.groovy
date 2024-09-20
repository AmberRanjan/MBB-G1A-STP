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

Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/01_TapOn - Passport'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8741490767371542928.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/02_VerifyText - Full name'), 'Full name')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/03_VerifyText - Passport Number'), 'Passport Number')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/04_VerifyText - Passport expiry date'), 'Passport expiry date')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/05_VerifyText - Date of Birth'), 'Date of Birth')

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/06_Set2charName'), 'AA', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/07_VerifyErrorText- Your name is too short'),
	'Your name is too short')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/08_ClearText - AA'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/09_SetTextNumeric - Please enter your full name'),
	'123456789', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/10_VerifyErrorText - Invalid full name'),
	'Invalid full name')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/11_ClearText - 123456789'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/12_SetTextSpecialChar - Please enter your full name'),
	'!@#$%^&', 0)

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/13_ClearText'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/14_Set45charText- Please enter your full name'), 'ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE',
	0)

String name = Mobile.getText(findTestObject('Object Repository/Sprint_6/02_ID_Type/18_GetTextName - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

if (name.length() <= 40) {
	print(name)
}

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/16_ClearText - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/17_SetName - Please enter your full name'), 'Amber Ranjan',
	0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/19_LessThan6 - e.g. A1234567890'), 'AB12N', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/20_LessThan6Error - The passport number you entered is invalid'),
	'The passport number you entered is invalid.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2121916207405020423.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/21_ClearText - AB12N'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2100066880877254752.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/22_SpecialCharacters- e.g. A1234567890'), '!@#$%^&&^%$',
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/23_ErrorforSpecialChar - Passport Number should not contain symbol'),
	'Passport Number should not contain symbol')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8765326432487026631.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/24_ClearText'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/25_AllString - e.g. A1234567890'), 'ABCDEFGHIJKLMN',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot45951393175160244.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/26_ClearText- ABCDEFGHIJKLMN'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/27_AllNumeric - e.g. A1234567890'), '12345678901',
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/28_VerifyText - The passport number you entered is invalid'),
	'The passport number you entered is invalid.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot273526454145374965.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/29_ClearText - 12345678901'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/31_Set21char - e.g. A1234567890'), '123456789012345678901',
	0)

String pass = Mobile.getText(findTestObject('Object Repository/Sprint_6/02_ID_Type/32_GetText- 12345678901234567890'), 0)

if (pass.length() <= 20) {
	print(pass)
}

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5347068465888922613.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/02_ID_Type/33_ClearText - 12345678901234567890'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/02_ID_Type/30_EnterCorrectPassport - e.g. A1234567890'), 'AB11J328792',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot144603972641782015.png')

//-----------------------------------Passport Expiry Date------------------------------------------------------

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/34.1_TapOnExpDate - e.g. 6 OCT 2019'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2673608809876032528.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/35_TapOn - Cancel'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1770151172619788855.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/34.1_TapOnExpDate - e.g. 6 OCT 2019'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/37_TapOnYear'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3474663679353502188.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/40_PassYear - 2035'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3474663679353502188.png')

//Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/38_TapOnSelectedYear'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/36_TapOn - Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8904363539107713749.png')
//-----------------------------------------------------------------------------------------------------------------

/*
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2673608809876032528.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/36_TapOn - Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8904363539107713749.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/34_TapOnExpiryDate- e.g. 6 OCT 2019'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2673608809876032528.png')
*/
//--------------------------------------------------Date of Birth----------------------------------------------

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/39_TapOnDOB - e.g. 6 OCT 2019'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1318762222316543796.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/35_TapOn - Cancel'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1770151172619788855.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/39_TapOnDOB - e.g. 6 OCT 2019'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1318762222316543796.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/36_TapOn - Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8904363539107713749.png')
//--------------------------------------------------------------------------------------------------------------

Mobile.scrollToText('Please select')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/41_TapNationalityDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot867370750425848896.png')

//----------------------------------------------------------------------------------Cuba------------------------------------------
/*
Mobile.scrollToText('Cuba')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/42_TapOn - Cuba'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot636402272820979314.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/43_TapOn- Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8143515064390672938.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/44_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/android.widget.TextView - Sorry, were unable to process your application. Please contact our Customer Care at 1-300-88-6688 for further assistance. CEPSC01'),
	'Sorry, we’re unable to process your application. Please contact our Customer Care at 1-300-88-6688 for further assistance. [CEPSC01]')
*/
//----------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------Iran------------------------------------------------------------------
/*
Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/41_TapNationalityDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot867370750425848896.png')

Mobile.scrollToText('Iran')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/45_TapOn - Iran'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot636402272820979314.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/43_TapOn- Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8143515064390672938.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/44_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/android.widget.TextView - Sorry, were unable to process your application. Please contact our Customer Care at 1-300-88-6688 for further assistance. CEPSC01'),
	'Sorry, we’re unable to process your application. Please contact our Customer Care at 1-300-88-6688 for further assistance. [CEPSC01]')

//-------------------------------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------North Korea------------------------------------------------------------------
Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/41_TapNationalityDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot867370750425848896.png')

Mobile.scrollToText('North Korea')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/46_TapOn - North Korea'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot636402272820979314.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/43_TapOn- Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8143515064390672938.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/44_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/android.widget.TextView - Sorry, were unable to process your application. Please contact our Customer Care at 1-300-88-6688 for further assistance. CEPSC01'),
	'Sorry, we’re unable to process your application. Please contact our Customer Care at 1-300-88-6688 for further assistance. [CEPSC01]')

//-------------------------------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------Syria------------------------------------------------------------------
Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/41_TapNationalityDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot867370750425848896.png')

Mobile.scrollToText('Syrian Arab Republic')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/47_TapOn - Syrian Arab Republic'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot636402272820979314.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/43_TapOn- Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8143515064390672938.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/44_TapOnDone'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/android.widget.TextView - Sorry, were unable to process your application. Please contact our Customer Care at 1-300-88-6688 for further assistance. CEPSC01'),
	'Sorry, we’re unable to process your application. Please contact our Customer Care at 1-300-88-6688 for further assistance. [CEPSC01]')

//-------------------------------------------------------------------------------------------------------------------------------------------------------

*/
//------------------------------------------------------------------------------India------------------------------------------------------------------
Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/41_TapNationalityDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot867370750425848896.png')

Mobile.scrollToText('India')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/48_TapOn - India'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot636402272820979314.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/43_TapOn- Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8143515064390672938.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/44_TapOnDone'), 0)

//-------------------------------------------------------------------------------------------------------------------------------------------------------

//Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/49_TapOnNext'), 0)

















