package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        //driver.manage().window().maximize(); //opens screen full size
        driver.manage().window().fullscreen(); //full screen covers tool bar

    }
}
