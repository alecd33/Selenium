package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver chrome=new ChromeDriver();

        chrome.get("https://www.amazon.com/");
        String url= chrome.getCurrentUrl();
        String title= chrome.getTitle();
        System.out.println(url+" "+title);
        chrome.quit();
    }
}
