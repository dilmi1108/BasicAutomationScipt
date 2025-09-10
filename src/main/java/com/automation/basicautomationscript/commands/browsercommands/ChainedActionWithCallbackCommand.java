package com.automation.basicautomationscript.commands.browsercommands;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ChainedActionWithCallbackCommand {
    public static void main(String [] args) throws InterruptedException {
        chainedActionWithCallback();

    }

    public static void chainedActionWithCallback() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu");

        WebElement mainMenu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        WebElement subMenu = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        WebElement subSubItem = driver.findElement(By.xpath("//a[text() = 'Sub Sub Item 1']"));

        Actions actions = new Actions(driver);

        performActionWithCallback(actions, mainMenu, subMenu,subSubItem);
        Thread.sleep(5000);

    }

    private static void performActionWithCallback(Actions actions, WebElement mainMenu, WebElement subMenu, WebElement subSubItem) {
        actions.moveToElement(mainMenu)
                .moveToElement(subMenu)
                .moveToElement(subSubItem)
                .click()
                .perform();

    }
}
