package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionCommands {
    public static void main(String [] args) throws InterruptedException {
        //testKeyPressAction();
        testCopyPasteAction();

    }

    public static void testKeyPressAction() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://ecommerce-playground.lambdatest.io/");
        driver.findElement(By.xpath("(//input[@name='search'])[1]")).sendKeys("ipod");
        driver.findElement(By.xpath("(//input[@name='search'])[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }
    public static void testCopyPasteAction() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Test User1");
        driver.findElement(By.id("userEmail")).sendKeys("testuser1@testmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Test Address");

        currentAddress.sendKeys(Keys.CONTROL,"a");
        currentAddress.sendKeys(Keys.CONTROL,"c");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(Keys.CONTROL,"v");
        Thread.sleep(5000);
        
    }
}
