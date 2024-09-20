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

'Launch Application'
Mobile.startExistingApplication('com.maybank2u.life.uat')

'Verify user is on Dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/01_VerifyText - Quick Actions'), 'Quick Actions')

'Take screenshot once user is on Dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot5347227611938746106.png')

Mobile.takeScreenshot()

'Swipe Quick Actions section'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/02_SwipeQuickActions'), 0)

'Verify View All text is visible upon swipe'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/03_VerifyText - View All'), 'View All')

'Take screenshot after scrolling'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2207554862691615708.png')

Mobile.takeScreenshot()

'Tap on View All'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/04_TapOn - View All'), 0)

'Verify Text once user navigated inside View All screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/05_VerifyText - Hello'), 'Hello!')

'Take screenshot once user is inside View All screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3428554183590603750.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/06_TapOnBackIcon'), 0)

'Verify user is navigated back to the dashboard'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/03_VerifyText - View All'), 'View All')

'Take screenshot once user is on the dashboard'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot6072748855211339352.png')

Mobile.takeScreenshot()

'Tap on View all again'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/04_TapOn - View All'), 0)

'Verify Text once the user is inside View All screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/05_VerifyText - Hello'), 'Hello!')

'Take screenshot once the user is inside View All screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot3428554183590603750.png')

Mobile.takeScreenshot()

'Tap on Apply button'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/07_TapOn - Apply'), 0)

'Verify Text once user navigated inside Apply screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/08_VerifyText - ACCOUNTS'), 'ACCOUNTS')

'Take screenshot once user is on the Apply > Accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1233773325094843785.png')

Mobile.takeScreenshot()

'Verify text once the user is able to view the Global Access Account -i title'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/09_VerifyTextGAAheader- Global Access Account-i'), 
    'Global Access Account-i')

'Verify text present in the body for the Global Access Account -i tile'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/10_VerifyText_GAAbody - A multi-currency accountfor all your travel and cross-border needs'), 
    'A multi-currency account\nfor all your travel and \ncross-border needs.')

'Take screenshot for the GAA tile'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot8370836519416997467.png')

Mobile.takeScreenshot()

'Tap on the Global Access Account -i tile'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/11_TapOn - Global Access Account-i'), 0)

'Verify Text once the user navigates to the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/12_VerifyText - Global Access Account-i'), 
    'Global Access Account-i')

'Take screenshot once user navigates to product intro page'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1233773325094843785.png')

Mobile.takeScreenshot()

'Tap on back icon'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/24_TapOnBackFromApplyNow'), 0)

'Verify Text once user navigated back to the Apply screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/08_VerifyText - ACCOUNTS'), 'ACCOUNTS')

'Take screenshot once user is on the Apply > Accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1233773325094843785.png')

Mobile.takeScreenshot()

'Tap on the Global Access Account -i tile'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/11_TapOn - Global Access Account-i'), 0)

'Verify Text once the user navigates to the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/12_VerifyText - Global Access Account-i'), 
    'Global Access Account-i')

'Take screenshot once user navigates to product intro page'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1233773325094843785.png')

Mobile.takeScreenshot()

'Tap on Cross icon'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/25_TapOnCrossFromApplyNow'), 0)

'Verify Text once user lands to Apply screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/08_VerifyText - ACCOUNTS'), 'ACCOUNTS')

'Take screenshot once user is on the Apply > Accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1233773325094843785.png')

Mobile.takeScreenshot()

'Verify text once the user is able to view the Global Access Account -i title'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/09_VerifyTextGAAheader- Global Access Account-i'), 
    'Global Access Account-i')

'Verify text present in the body for the Gloval Access Account -i tile'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/10_VerifyText_GAAbody - A multi-currency accountfor all your travel and cross-border needs'), 
    'A multi-currency account\nfor all your travel and \ncross-border needs.')

'Tap on the Global Access Account -i tile'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/11_TapOn - Global Access Account-i'), 0)

'Verify Text once the user navigates to the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/12_VerifyText - Global Access Account-i'), 
    'Global Access Account-i')

'Take screenshot once user navigates to product intro page'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1233773325094843785.png')

Mobile.takeScreenshot()

'User taps on Apply Now'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/18_TapOnApplyNow'), 0)

'Verify Text once user navigates to GAA application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/19_VerifyText - Tell us your ID type and number'), 
    'Tell us your ID type and number')

'Verify Text once user navigates to GAA application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/20_VerifyText- MyKad'), 'MyKad')

'Verify Text once user navigates to GAA application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/21_VerifyText - Passport'), 'Passport')

'Tale screenshot once user navigates to GAA application screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4977985405657186905.png')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/26_TapBackFromApplication'), 0)

'Verify Text for the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/13_VerifyText- An all-in-one multi-currency account for all your travel and cross-border needs'), 
    'An all-in-one multi-currency account for all your travel and cross-border needs.')

'Verify Text for the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/14_VerifyText - Multi-currency account with debit card'), 
    'Multi-currency account with debit card')

'Verify Text for the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/16_VerifyText - Worry-free travel with auto-sweepfeature on overseas transactions'), 
    'Worry-free travel with auto-sweep\nfeature on overseas transactions')

'Verify Text for the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/17_VerifyText - No hidden fees on banking transactions'), 
    'No hidden fees on banking transactions')

'Take screenshot once the user navigates to the product intro page'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2855578688112093863.png')

Mobile.takeScreenshot()

'Tap on Apply Now screen'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/18_TapOnApplyNow'), 0)

'Verify Text once user navigates to GAA application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/19_VerifyText - Tell us your ID type and number'), 
    'Tell us your ID type and number')

'Verify Text once user navigates to GAA application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/20_VerifyText- MyKad'), 'MyKad')

'Verify Text once user navigates to GAA application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/21_VerifyText - Passport'), 'Passport')

'Take screenshot once user navigates to GAA application screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4977985405657186905.png')

Mobile.takeScreenshot()

'Tap on Back button'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/22_TapOnBackButton'), 0)

'Verify Text once the user navigates to the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/12_VerifyText - Global Access Account-i'), 
    'Global Access Account-i')

'Take screenshot once the user navigates to the product intro page'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2855578688112093863.png')

Mobile.takeScreenshot()

'Tap on Apply Now'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/18_TapOnApplyNow'), 0)

'Verify Text once user navigates to GAA application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/19_VerifyText - Tell us your ID type and number'), 
    'Tell us your ID type and number')

'Take screenshot once user navigates to GAA application screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot2855578688112093863.png')

Mobile.takeScreenshot()

'Tap on Cross icon'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/23_TapOnCross'), 0)

'Verify Text once user lands to Apply screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/08_VerifyText - ACCOUNTS'), 'ACCOUNTS')

'Take screenshot once user is on the Apply > Accounts screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1233773325094843785.png')

Mobile.takeScreenshot()

'Verify text once the user is able to view the Global Access Account -i title'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/09_VerifyTextGAAheader- Global Access Account-i'), 
    'Global Access Account-i')

'Verify text present in the body for the Gloval Access Account -i tile'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/10_VerifyText_GAAbody - A multi-currency accountfor all your travel and cross-border needs'), 
    'A multi-currency account\nfor all your travel and \ncross-border needs.')

'Tap on the Global Access Account -i tile'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/11_TapOn - Global Access Account-i'), 0)

'Verify Text once the user navigates to the product intro page'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/12_VerifyText - Global Access Account-i'), 
    'Global Access Account-i')

'Take screenshot once user is on Product intro screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot1233773325094843785.png')

Mobile.takeScreenshot()

'Tap on Apply now button'
Mobile.tap(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/18_TapOnApplyNow'), 0)

'Verify Text present on the GAA Application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/19_VerifyText - Tell us your ID type and number'), 
    'Tell us your ID type and number')

'Verify MyKad text present on the GAA aplication screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/20_VerifyText- MyKad'), 'MyKad')

'Verify Passport text present on the GAA application screen'
Mobile.verifyElementText(findTestObject('Object Repository/Sprint_6/01_NTB_Navigation/21_VerifyText - Passport'), 'Passport')

'Take screenshot once the user is on the GAA application screen'
Mobile.takeScreenshot('C:\\Users\\AMBRAN~1\\AppData\\Local\\Temp\\screenshot4977985405657186905.png')

Mobile.takeScreenshot()

