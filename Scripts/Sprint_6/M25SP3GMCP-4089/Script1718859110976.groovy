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

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/01_VerifyText- Step 4 of 4'), 'Step 4 of 4')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/02_VerifyText - Please fill in your preferred branchdetails'), 
    'Please fill in your preferred branch\ndetails')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7355964537608578974.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/03_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/05_Step_3/01_VerifyText - Step 3 of 4'), 'Step 3 of 4')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/48_TapOnNext'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/01_VerifyText- Step 4 of 4'), 'Step 4 of 4')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/02_VerifyText - Please fill in your preferred branchdetails'), 
    'Please fill in your preferred branch\ndetails')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/04_TapOnStateDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1656648036030603598.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/05_TapOn - Cancel'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1656648036030603598.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/04_TapOnStateDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1656648036030603598.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/06_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1656648036030603598.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/07_VerifyText - District'), 'District')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/08_TapOnDistrictDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2764683401071097217.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/09_TapOn - Cancel'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2764683401071097217.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/08_TapOnDistrictDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2764683401071097217.png')

Mobile.scrollToText('Kuala Lumpur')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/10_TapOn - Kuala Lumpur'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7487680652222201710.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/11_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6960209780586165300.png')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/12_VerifyText - Branch'), 'Branch')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/13_TapOnBranchDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2095392370921185174.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/15_TapOn - Cancel'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8221015247998253885.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/13_TapOnBranchDropdown'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2095392370921185174.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/14_TapOn - Kuala Lumpur Main'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8221015247998253885.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/16_TapOnDone'), 0)

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8145434872468329176.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/17_TapOnNext'), 0)

