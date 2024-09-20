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

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/02_TapOnBackIcon'), 0)

Mobile.scrollToText('Declaration')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/03_VerifyText- Declaration'), 'Declaration')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot609017745218413292.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/07_Terms/05_TapOnAgree_Confirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

//--------------------------------------------------------------------Personal Details----------------------------------------------------------------------------------------
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/04_VerifyText- Personal Details'), 'Personal Details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7466347760278830494.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/05_TapOn - Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/02_VerifyText - Please fill in your personal details'), 
    'Please fill in your personal details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5477520150183042140.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/20_TapOnConfirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/05_TapOn - Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/03_Step_1/02_VerifyText - Please fill in your personal details'), 
    'Please fill in your personal details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5477520150183042140.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/03_Step_1/21_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------Residential Details----------------------------------------------------------------------------------------
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/06_VerifyText - Residential Details'), 
    'Residential Details')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/07_TapOn - Edit'), 0)

Mobile.delay(2)

//Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/03_VerifyText - Address line 1'), 'Address line 1')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

//Mobile.clearText(findTestObject('Object Repository/Sprint_6/08_Confirmation/14_ClearAdd3 - ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDE'),	0)

//Mobile.setText(findTestObject('Object Repository/Sprint_6/08_Confirmation/15_SetText- e.g Neighbourhood name'), 'Address Line 3',	0)

//Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7242213948708978508.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/08_TapOnConfirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/07_TapOn - Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/04_Step_2/03_VerifyText - Address line 1'), 'Address line 1')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/04_Step_2/02_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------------------Employment Details----------------------------------------------------------------------------------------
Mobile.scrollToText('Branch')

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/09_VerifyText - Employment Details'), 
    'Employment Details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/10_TapOn - Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/11_VerifyText - Please fill in your employment details'), 
    'Please fill in your employment details')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/08_TapOnConfirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/10_TapOn - Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/11_VerifyText - Please fill in your employment details'), 
    'Please fill in your employment details')

Mobile.tap(findTestObject('Object Repository/Sprint_6/05_Step_3/02_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------Additional Details----------------------------------------------------------------------------------------
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/12_VerifyText - Additional Details'), 
    'Additional Details')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/13_TapOn - Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/02_VerifyText - Please fill in your preferred branchdetails'), 
    'Please fill in your preferred branch\ndetails')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5267972322322437304.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/08_TapOnConfirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/13_TapOn - Edit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/06_Step_4/02_VerifyText - Please fill in your preferred branchdetails'), 
    'Please fill in your preferred branch\ndetails')

Mobile.tap(findTestObject('Object Repository/Sprint_6/06_Step_4/03_TapOnBackButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/08_Confirmation/01_VerifyText - Confirmation'), 'Confirmation')

Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot7562670968986367074.png')

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Mobile.tap(findTestObject('Object Repository/Sprint_6/08_Confirmation/16_TapOnConfirm'), 0)
