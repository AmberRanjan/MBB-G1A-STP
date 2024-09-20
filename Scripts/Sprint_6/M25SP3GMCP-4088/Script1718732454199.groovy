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

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/01_VerifyText - Step 3 of 4'), 'Step 3 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/02_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/01_VertifyText - Step 2 of 4'), 'Step 2 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/04_Step_2/45_TapOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/01_VerifyText - Step 3 of 4'), 'Step 3 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/03_TapOnOccDropdown - Please select'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/04_VerifyText - Accountants'), 'Accountants')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8814552224982380129.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/05TapOnBackButton'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/03_TapOnOccDropdown - Please select'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/04_VerifyText - Accountants'), 'Accountants')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8814552224982380129.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/06_TapOn - Type to search'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2717024182662843254.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/07_SetIncorrectText'), 'AAAAAAAAAAA', 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/08_VerifyText - No Results Found'), 'No Results Found')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/09_VerifyText - Please select the category that is the closest match to your occupation'),
	'Please select the category that is the closest match to your occupation.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8471457731262981824.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/05_Step_3/10_ClearText- AAAAAAAAAAA'), 0)

Mobile.delay(3)

//Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/08_VerifyText - No Results Found'), 'No Results Found')

//Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/09_VerifyText - Please select the category that is the closest match to your occupation'),
//	'Please select the category that is the closest match to your occupation.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8471457731262981824.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/11_SetSpecialCharacter'), '!@#$%^', 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/08_VerifyText - No Results Found'), 'No Results Found')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/09_VerifyText - Please select the category that is the closest match to your occupation'),
	'Please select the category that is the closest match to your occupation.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8471457731262981824.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/05_Step_3/12_ClearText'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7715529633894337685.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/13_SetNumeric'), '12345679', 0)

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/08_VerifyText - No Results Found'), 'No Results Found')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/09_VerifyText - Please select the category that is the closest match to your occupation'),
	'Please select the category that is the closest match to your occupation.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8471457731262981824.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/05_Step_3/14_ClearText- 12345679'), 0)

Mobile.delay(3)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5043424149250409543.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/15_SearchEngin'), 'Engin', 0)

Mobile.delay(3)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7144541378406073148.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/16_TapOn - Engineering Professionals (including Electrotechnology)'),
	0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/16_TapOn - Engineering Professionals (including Electrotechnology)'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/17_VerifyText- Employer Name'), 'Employer Name')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5685815304093452031.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/18_SetSpChar - e.g Maybank'), '!@#$%^', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/19_Verifytext - Employer name is invalid'),
	'Employer name is invalid.')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot85414749969051652.png')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/05_Step_3/20_ClearSpChar'), 0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/21_Set3char - e.g Maybank'), 'ABC', 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/22_VerifyError- Employer name is too short'),
	'Employer name is too short.')

Mobile.clearText(findTestObject('Object Repository/Sprint_6/05_Step_3/23_ClearText- ABC'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot459943536376037653.png')

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/24_Enter55char- e.g Maybank'), 'ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE',
	0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot459943536376037653.png')

String empnam = Mobile.getText(findTestObject('Object Repository/Sprint_6/05_Step_3/25_GetText- ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

if (empnam.length() <= 50) {
	print(empnam)
}

Mobile.clearText(findTestObject('Object Repository/Sprint_6/05_Step_3/26_ClearText- ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),
	0)

Mobile.setText(findTestObject('Object Repository/Sprint_6/05_Step_3/27_SetText - e.g Maybank'), 'Maybank', 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot459943536376037653.png')




























