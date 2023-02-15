import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.logging.LogEntries
import org.openqa.selenium.logging.LogEntry

import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try {
	
	WebUI.openBrowser('')

	WebUI.navigateToUrl('http://demoaut.katalon.com/')

	WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/a_Make Disappointment'), 10)

	WebUI.closeBrowser()
	
} catch (StepFailedException ex) {
	
	if (DriverFactory.getExecutedBrowser() == WebUIDriverType.CHROME_DRIVER) {
		WebDriver driver = DriverFactory.getWebDriver()
		LogEntries logs = driver.manage().logs().get("browser")
		for (LogEntry entry : logs){
			println(">>> ${entry}")
		}
	}
}

