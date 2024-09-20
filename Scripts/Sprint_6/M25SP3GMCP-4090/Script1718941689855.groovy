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

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/07_Terms/01_VerifyText - Declaration'), 'Declaration')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3035403579930723253.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/07_Terms/02_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/01_VerifyText- Step 4 of 4'), 'Step 4 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3035403579930723253.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/17_TapOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/07_Terms/01_VerifyText - Declaration'), 'Declaration')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3035403579930723253.png')

Mobile.getText(findTestObject('Object Repository/Sprint_6/07_Terms/03_FirstPara - I have read and agree to be bound by the Terms and Conditions and Product Disclosure Sheet(s), and FEA Regulations'),
	0)

Mobile.swipe(0, 300, 0, 0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/07_Terms/04_TapOn - Yes, I expressly agree to be contacted'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5615338558580692825.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/07_Terms/05_TapOnAgree_Confirm'), 0)

