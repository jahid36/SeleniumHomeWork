package com.jahidhomework.qa;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
        public static void main ( String[] args){
            chrome();

        }

        public static void chrome(){


            System.setProperty("webdriver.chrome.driver","/Users/jahidkhan/JahidProjects/drivers/chromeriver");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.nytimes.com");
            String pagetilte = driver.getTitle();
            System.out.println(pagetilte);
            driver.quit();


        }

    }



