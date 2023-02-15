import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.logging.LogEntries
import org.openqa.selenium.logging.LogEntry

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut.katalon.com/')

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'), 10)

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_username'), 'John Doe')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.delay(3)

// printing JavaScript Console Log
if (DriverFactory.getExecutedBrowser() == WebUIDriverType.CHROME_DRIVER) {
	WebDriver driver = DriverFactory.getWebDriver()
	LogEntries logs = driver.manage().logs().get("browser")
	for (LogEntry entry : logs){
		println(">>> ${entry}")
	}
}

WebUI.closeBrowser()

