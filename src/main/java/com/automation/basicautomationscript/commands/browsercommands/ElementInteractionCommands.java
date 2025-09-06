package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ElementInteractionCommands {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("iphone");
        driver.findElement(By.cssSelector("div[class*=\"FPdoLc\"] [value=\"Google Search\"]")).click();
        Thread.sleep(3000);
        List<WebElement> elements = (List<WebElement>) driver.findElements(By.cssSelector("[class=\"OSrXXb\"]"));
        for (WebElement element : elements) {
            System.out.println(element.getText());

    }




    }
}
