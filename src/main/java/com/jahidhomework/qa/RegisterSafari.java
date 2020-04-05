package com.jahidhomework.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class RegisterSafari {
    public static void main(String [] args) throws InterruptedException {
        safarihw();



    }
    public static void safarihw () throws InterruptedException {
        //System.setProperty("webdriver.safari.driver","/Users/jahidkhan/JahidProjects/drivers/safari");
        WebDriver jahid = new SafariDriver();

        jahid.navigate().to("https://demo.broadleafcommerce.org/login");
        jahid.findElement(By.xpath("//*[@id=\"customer.emailAddress\"]")).sendKeys("jahid36@gmail.com");
        jahid.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Jahid");
        jahid.findElement(By.xpath("//*[@id=\"customer.lastName\"]")).sendKeys("Khan");
        jahid.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Jahid#2040");
        jahid.findElement(By.xpath("//*[@id=\"passwordConfirm\"]")).sendKeys("Jahid#2040");
        jahid.findElement(By.xpath("//*[@id=\"registrationForm\"]/button")).click();
        Thread.sleep(5000);
        System.out.println("click to register");


    }

}
