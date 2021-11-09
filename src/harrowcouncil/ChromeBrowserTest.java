package harrowcouncil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // set property and Chrome browser driver path
        WebDriver driver = new ChromeDriver(); // Object creation for web driver
        driver.get(baseUrl);  // method for url
        driver.manage().window().maximize(); // maximise browser window after web page is loaded.
        String getTitle = driver.getTitle(); // print title in console
        System.out.println(getTitle);
        driver.close();
    }
}
