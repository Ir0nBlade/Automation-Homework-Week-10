package watfordcommunityhousing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe"); // set property and Chrome browser driver path
        WebDriver driver = new EdgeDriver(); // Object creation for web driver
        driver.get(baseUrl); // method for url
        driver.manage().window().maximize(); // maximise browser window after web page is loaded.
        String getTitle = driver.getTitle(); // print title in console
        System.out.println(getTitle);
        driver.close();
    }
}

