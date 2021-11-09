package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest {

    public static void main(String[] args) {

        String baseUrl="https://www.x-cart.com/";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");    // set property and Chrome browser driver path
        WebDriver driver = new InternetExplorerDriver();    // Object creation for web driver
        driver.get(baseUrl);    // method for url
        driver.manage().window().maximize();    // maximise browser window after web page is loaded.
        String getTitle = driver.getTitle();    // print title in console
        System.out.println(getTitle);
        driver.close();
    }
}
