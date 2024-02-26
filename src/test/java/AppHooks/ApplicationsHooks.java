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
    private WebDriver driver;
    private DriverFactory drivaerFactory; 
    private ConfigReader configReader;
    Properties prop;
    
    @Before(order =0)
    public void getPropert()
    {
    	configReader=new ConfigReader();
    	prop=configReader.init_proeprties();	
    }
    
    @Before(order = 1)
    public void launchBrowser()
    {
    	String browserName=prop.getProperty("browser");
    	drivaerFactory=new DriverFactory();
    	drivaerFactory.init_Driver(browserName);
    }
    
    @After(order =0)
    public void quiteBrowser()
    {
//    	  if (driver != null) {
//              driver.quit();
//          }
    
    }
    
    @After(order = 1)
    public void tearDown(Scenario scenario)
    {
//    	if(scenario.isFailed())
//    	{
//    		String screenshotName=scenario.getName().replaceAll("", "_");
//    		byte[] sourncePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//    		scenario.attach(sourncePath, "img/png", screenshotName);
//    		
//    	}
    }
}
