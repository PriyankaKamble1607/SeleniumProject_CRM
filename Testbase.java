package com.CRM.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Testbase 
{
		
		public static WebDriver driver;
		public static Properties prop;
		
		public Testbase() {
			// reading property file
			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(
						System.getProperty("user.dir") + "/src/main/java/com/CRM/config/config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		
		
		
		// making browser factory
			public static void initializaion() {
				String browserName = prop.getProperty("browser");

					 if(browserName.equals("FF")) 
					{
						
					/*
						System.setProperty("webdriver.gecko.driver",
								"C:\\Windows\\System32\\chromedriver.exe");
						*/				
						driver = new FirefoxDriver();
						//driver.manage().logs().get(LogType.BROWSER);
						System.out.println("broswer open");
					
				}
					 else
					 {
						 System.out.println("could not open browser");
					 }
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
			}
			/*
			public void expliciteWait(WebElement element, int timeToWaitInSec)
			{
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(element));
			}
			*/

			public static void openCRM()
			{
				driver.get(prop.getProperty("url"));
				System.out.println("URL opened");
			}

	}

