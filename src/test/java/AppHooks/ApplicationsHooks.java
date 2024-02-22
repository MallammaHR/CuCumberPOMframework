package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationsHooks 
{
	private DriverFactory driverFactory;
	private WebDriver driver;
	private Properties prop;
	private ConfigReader configReader;

    @Before(order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        prop = configReader.init_proeprties();
    }

    @Before(order = 1)
    public void LaunchBrowser() {
        String browserName = prop.getProperty("browser");

        if (browserName != null) {
            driverFactory = new DriverFactory();
            driver = driverFactory.init_Driver(browserName);
        } else {
            System.out.println("Please provide a valid value for the browser in the properties file.");
        }
    }
	
	@After(order = 0)
	public void quitebrowser()
	{
		 String tt=driver.getTitle();
		 System.out.println("tt is "+tt);
		if(driver!=null)
			driver.quit();
	}
	
	@After(order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed() && driver != null)
        {
            try
            {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
	
	
}
