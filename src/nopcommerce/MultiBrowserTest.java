package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserTest {

    static String browser = "Edge";
    static String baseUrl = "https://www.nopcommerce.com/demo";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");  // set property and Chrome browser driver path
            driver=new ChromeDriver();  // Object creation for web driver
            driver.get(baseUrl);
            driver.close();
        } else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");    // set property and Chrome browser driver path
            driver = new FirefoxDriver();   // Object creation for web driver
            driver.get(baseUrl);
            driver.close();
        }else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");    // set property and Chrome browser driver path
            driver=new EdgeDriver();    // Object creation for web driver
            driver.get(baseUrl);
            driver.close();
        }else {
            System.out.println("Wrong browser name");
        }
    }
}