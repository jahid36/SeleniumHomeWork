package com.jahidhomework.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main ( String[] args){
        firefox();


    }

    public static void firefox(){

        System.setProperty("webdriver.gecko.driver","/Users/jahidkhan/JahidProjects/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.nytimes.com");
        String pagetilte = driver.getTitle();
        System.out.println(pagetilte);
        driver.quit();


    }
}
