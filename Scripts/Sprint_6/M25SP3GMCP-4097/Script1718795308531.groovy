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

Mobile.swipe(0, 400, 0, 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/42_VerifyText_ Monthly income'), 'Monthly income')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8340456292396297992.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/43_TapOnMonthlyIncomeDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4114213334572575526.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/44_TapOn - Cancel'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/42_VerifyText_ Monthly income'), 'Monthly income')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8340456292396297992.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/43_TapOnMonthlyIncomeDropdown'), 0)

Mobile.scrollToText('RM 9,000')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7120895667563554786.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/45_TapOn- RM 9,000 TO RM 9,999'), 0)

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/46_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7401656410990677998.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/48_TapOnNext'), 0)

