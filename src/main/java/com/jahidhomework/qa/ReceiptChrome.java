package com.jahidhomework.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReceiptChrome {


    public static void main(String[] args) throws Exception{

        homeworkmarchend();

    }


    public static void homeworkmarchend() throws Exception{
        System.setProperty("webdriver.chrome.driver","/Users/jahidkhan/JahidProjects/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.broadleafcommerce.org/login");
        System.out.println(driver.getTitle());




        WebElement Email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[1]/div/input"));
        Email.clear();
        System.out.println("Box cleared");
        Email.sendKeys("jahid2020@gmail.com");
        System.out.println("Input Email Address");
        Thread.sleep(2000);



        WebElement Password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/div[2]/div/input"));
        Password.clear();
        System.out.println("Box cleared");
        Password.sendKeys("Jahid0000");
        System.out.println("Enter ur Password ");
        Thread.sleep(2000);


        WebElement Login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/form/button"));
        Login.click();
        System.out.println("Click Login Bottom");
        Thread.sleep(2000);

        System.out.println("Login Successfully");


        WebElement Iteam = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/div/div[2]/h4/a"));
        Iteam.click();
        System.out.println("Clicked the Iteam");
        Thread.sleep(1000);

        WebElement AddIteam = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/div[4]/div[1]/form/div/div[1]/button"));
        AddIteam.click();
        System.out.println("Iteam Added to Cart");
        Thread.sleep(1000);

        WebElement view = driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul[2]/li[4]/ul/li[3]/a"));
        view.click();
        Thread.sleep(1000);

        System.out.println("Viewed Iteam on Cart");

        WebElement Pay = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div[2]/div[5]/div[1]/a/span"));
        Pay.click();
        Thread.sleep(1000);

        WebElement Shipping = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div/div[2]/div[2]/label/span[1]"));
        Shipping.click();
        Thread.sleep(1000);

        WebElement FullName = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div/div[1]/div/div/div[1]/div/div/input"));
        FullName.clear();
        FullName.sendKeys("jahid khan");
        Thread.sleep(1000);

        WebElement Address = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div/div[1]/div/div/div[2]/div[1]/div/input"));
        Address.clear();
        Address.sendKeys("13003 hamtramck");
        Thread.sleep(1000);
        WebElement city = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div/div[1]/div/div/div[3]/div[1]/div/input"));
        city.clear();
        city.sendKeys("Hamtramck");
        Thread.sleep(2000);


        Select objstate = new Select (driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div/div[1]/div/div/div[3]/div[2]/div/select")));
        //objstate.selectByIndex(32);
        objstate.selectByValue("MI");

        Thread.sleep(1000);


        System.out.println(" State selected MI ( Michigan ) ");

        WebElement postcode = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div/div[1]/div/div/div[3]/div[3]/div/input"));
        postcode.clear();
        postcode.sendKeys("48212");
        Thread.sleep(2000);

        WebElement Mob = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/form/div/div[1]/div/div/div[4]/div/div/input"));
        Mob.clear();
        Mob.sendKeys("+1 313-123-0000");
        Thread.sleep(2000);

        WebElement continuee = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]/div[2]/a/span"));
        continuee.click();
        Thread.sleep(2000);


        WebElement card = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/ul/li[1]/a"));
        card.click();
        Thread.sleep(2000);





        WebElement billingAddress = driver.findElement(By.className("check"));
        billingAddress.click();
        Thread.sleep(2000);
        WebElement cardnumber = driver.findElement(By.id("cardNumber"));
        cardnumber.clear();
        cardnumber.sendKeys("4111111111111111");
        Thread.sleep(1000);

        WebElement cardCVV = driver.findElement(By.name("CREDIT_CARD_CVV"));
        cardCVV.clear();
        cardCVV.sendKeys("123");

        WebElement cardExp = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div[2]/div/div[3]/div/input"));
        cardExp.clear();
        cardExp.sendKeys("01/99");



        WebElement continueNext = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/a/span"));
        continueNext.click();
        Thread.sleep(2000);

        WebElement PlaceOrder = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div[2]/div[6]/a/span"));
        PlaceOrder.click();
        Thread.sleep(5000);

        System.out.println(" THANK YOU FOR YOUR SHOPPING WITH US  ");

        System.out.println(" Your Order Confirmation no # :- 202003312316024893392 ");

        System.out.println(" A confirmation email will be sent to jahid2020@gmail.com. ");



        driver.quit();

    }


}
