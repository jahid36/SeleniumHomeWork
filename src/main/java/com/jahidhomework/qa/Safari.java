package com.jahidhomework.qa;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {

    public static void  main ( String [] args){
        safari();

    }

    public static void safari () {

        //System.setProperty("webdriver.safari.driver","/Users/jahidkhan/JahidProjects/drivers/safari");
        WebDriver driver = new SafariDriver();
        driver.navigate().to("https://www.nytimes.com");
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        driver.quit();


    }
}
