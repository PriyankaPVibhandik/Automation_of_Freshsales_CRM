package Freshsales_Automation;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class testBase {

	public static WebDriver driver;
    public static Properties prop;

    public testBase() {
        try {
            prop = new Properties();

     	   FileInputStream fips = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/Freshsales_Automation/config.properties");
     

            prop.load(fips);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialize() {
        String browser_name = prop.getProperty("browser");

        System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\PRIYANKA VIBHANDIK\\Documents\\ExcelR_folder\\edgedriver_win64\\msedgedriver.exe\"");

        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
        
        // Add implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}

