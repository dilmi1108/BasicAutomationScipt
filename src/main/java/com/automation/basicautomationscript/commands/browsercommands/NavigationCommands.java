package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("Go Back");
        Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println("Go Forward");
        Thread.sleep(3000);
        driver.navigate().refresh();
        System.out.println("Go Refresh");


    }
}
