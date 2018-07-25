import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.logging.LogEntries
import org.openqa.selenium.logging.LogEntry

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()
if (executedBrowser == WebUIDriverType.CHROME_DRIVER &&
	System.getProperty('user.home') == 'C:\\Users\\qcq0264') {
	// kazurayam has a special reason. I am oblidged to instanciate ChromeDriver myself.
	// Here I open a ChromeDriver and let Katalon Studio to use it
	System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())
	WebDriver driver = new ChromeDriver()
	DriverFactory.changeWebDriver(driver)
} else {
	// open browser as usual
    WebUI.openBrowser('')
}

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'), 10)

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_username'), 'John Doe')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.delay(3)

// printing JavaScript Console Log
if (executedBrowser == WebUIDriverType.CHROME_DRIVER) {
	WebDriver driver = DriverFactory.getWebDriver()
	LogEntries logs = driver.manage().logs().get("browser")
	for (LogEntry entry : logs){
		println(">>> ${entry}")
	}
}

WebUI.closeBrowser()

