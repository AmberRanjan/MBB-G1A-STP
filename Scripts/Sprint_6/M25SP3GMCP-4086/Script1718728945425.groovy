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
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/01_VerifyText- Step 1 of 4'), 'Step 1 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5477520150183042140.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/21_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/02_ID_Type/02_VerifyText - Full name'), 'Full name')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5477520150183042140.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/02_ID_Type/49_TapOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/02_VerifyText - Please fill in your personal details'), 
    'Please fill in your personal details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5477520150183042140.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/03_TapOnTitle - Please select'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot653027731564886813.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/04_Select - Mr  Encik'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3888316760665806802.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/05_TapOn- Done'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2555274988799563541.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/06_VerifyText- Gender'), 'Gender')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/07_TapOn - Male'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot269312464909165982.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/08_VerifyText- Mobile Number'), 'Mobile Number')

Mobile.setText(findTestObject('Object Repository/Sprint_6/03_Step_1/09_SetMobileNumber - e.g 17 205 6789'), '126788069', 
    0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot232801367605366910.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/10_VerifyText - Email address'), 'Email address')

Mobile.setText(findTestObject('Object Repository/Sprint_6/03_Step_1/11_SetEmailID - e.g danialgmail.com'), 'amber.ranjan@maybank.com', 
    0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5325859712088767204.png')

Mobile.scrollToText('Yes')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/12_VerifyText - Are you a politically exposed person (PEP) or a relativeclose associate of a PEP0'), 
    'Are you a politically exposed person (PEP) or a relative/close associate of a PEP?0')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1172564028251609055.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/13_TapOn_i_buton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/14_VerifyPopUpText1- What is PEP'), 'What is PEP?')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/16_VerifyPopUpText3 - What is RCA'), 'What is RCA?')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1165656770596365519.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/18_TapOnClose'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/19_TapOn - No'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2660895918387750465.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/20_TapOnConfirm'), 0)

