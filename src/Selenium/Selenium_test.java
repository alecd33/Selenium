package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        String url=driver.getCurrentUrl();//gets url
        System.out.println(url);

        String title= driver.getTitle();//gets title
        System.out.println(title);

        driver.quit();
    }
}
