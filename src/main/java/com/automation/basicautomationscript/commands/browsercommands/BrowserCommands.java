package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserCommands {
    public  static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        Thread.sleep(5000);
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println(CurrentUrl);
        String Title = driver.getTitle();
        System.out.println(Title);


    }
}
