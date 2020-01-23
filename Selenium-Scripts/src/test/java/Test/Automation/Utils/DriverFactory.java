package Test.Automation.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

	private static final String remoteHub = new PropertyReader().readProperty("remoteHub");
	protected static WebDriver driver;

	public DriverFactory()   {
		initialize();
		initializeLogging();
	}

	public void initialize()  {
		if (driver == null)
			if(new PropertyReader().readProperty("runAt").equals("local"))
			{
				createNewLocalDriverInstance();
				
			}
			else if(new PropertyReader().readProperty("runAt").equals("remote"))
			{
				createNewRemoteDriverInstance();
				
			}
	}

	private void createNewLocalDriverInstance()   {
		String browser = new PropertyReader().readProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
 
			//System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver.exe");
			
			
			
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);

			String browserExePath = new PropertyReader().readProperty("browserExePath");
			String driverExePath = new PropertyReader().readProperty("driverExePath");
			
			options.setBinary(browserExePath); 
			System.setProperty("webdriver.chrome.driver", driverExePath); 
			driver = new ChromeDriver(options);
			
			
			
			
					/*ChromeOptions chromeOptions= new ChromeOptions();
                    chromeOptions.setBinary("C:\\Users\\farhanzia.sheikh\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");*/


			//driver = new ChromeDriver(chromeOptions); 
			
			
		}  else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
            driver =  new FirefoxDriver();
            /*DesiredCapabilities dc = DesiredCapabilities.firefox();
            dc.setCapability("marionette", true);
            driver =  new FirefoxDriver(dc);*/

		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability("requireWindowFocus", true);*/
			driver = new InternetExplorerDriver();
		} else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	}

	private void createNewRemoteDriverInstance()  {
		String browser = new PropertyReader().readProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

			DesiredCapabilities capabilities = DesiredCapabilities.chrome();

			try {
				driver = new RemoteWebDriver(
						new URL(remoteHub), capabilities);
				((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		} /*else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability("requireWindowFocus", true);
            driver = new InternetExplorerDriver();
        } */else {
        	throw new IllegalArgumentException("The Browser Type is Undefined");
        }
	}

	public String getReportConfigPath(){
		String report = new PropertyReader().readProperty("reportConfigPath");
		if(report != null) return report;
		else throw new RuntimeException("Extent Report Path is not specified in the Config.properties file");
	}

	private void initializeLogging() {
		driver = new EventFiringWebDriver(driver).register(new WebDriverListeners());
	}

	public WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {
		driver.quit();
		driver = null;
	}
}
