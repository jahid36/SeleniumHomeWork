package com.jahidhomework.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterFireFox {

    public static void main(String[]args) throws InterruptedException {
        firefoxHw();
    }


        public static void firefoxHw () throws InterruptedException {

            System.setProperty("webdriver.gecko.driver","/Users/jahidkhan/JahidProjects/drivers/geckodriver");
            WebDriver jahid = new FirefoxDriver();
            jahid.navigate().to("https://demo.broadleafcommerce.org/login");
            jahid.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]")).sendKeys("jahid36@gmail.com");
            jahid.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Jahid");
            jahid.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Khan");
            jahid.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jahid$2030");
            jahid.findElement(By.xpath("//*[@id=\"passwordConfirm\"]")).sendKeys("Jahid$2030");
            jahid.findElement(By.xpath("//*[@id=\"registrationForm\"]/button")).click();
            Thread.sleep(5000);
            System.out.println("click to register");



    }
}
