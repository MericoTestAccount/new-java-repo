package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class Calculator2 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
