package com.jahidhomework.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class RegisterChrome {
        public static void main(String[]args) throws InterruptedException {
            chromehw();



        }
        public static void chromehw() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","/Users/jahidkhan/JahidProjects/drivers/chromedriver");
            WebDriver jahid = new ChromeDriver();
            jahid.navigate().to("https://demo.broadleafcommerce.org/login");
            jahid.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]")).sendKeys("jahid2020@gmail.com");
            jahid.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("jahid");
            jahid.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("khan");
            jahid.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/form/div[4]/div[2]/input")).sendKeys("Jahid0000");
            jahid.findElement(By.xpath("//*[@id=\"passwordConfirm\"]")).sendKeys("Jahid0000");
            jahid.findElement(By.xpath("//*[@id=\"registrationForm\"]/button")).click();
            Thread.sleep(5000);
            System.out.println("click to register");
}
    }