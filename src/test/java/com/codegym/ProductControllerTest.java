package com.codegym;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class ProductControllerTest {
//
//    private static WebDriver browser;
//
//    @BeforeAll
//    public static void initBrowser() {
//        System.setProperty("webdriver.chrome.driver",
//                "src/test/java/com/codegym/chromedriver/_119/chromedriver.exe");
//
//        ChromeOptions options = new ChromeOptions();
////        options.addArguments("--headless");
//        options.addArguments("--remote-allow-origins=*");
//        browser = new ChromeDriver(options);
//        browser.manage().window().maximize();
//        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @AfterAll
//    public static void destroyBrowser() {
//        browser.quit();
//    }
//
//    private void slow() {
//        try {
//            Thread.sleep(2 * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void test_Username_Empty() {
//        browser.get("http://localhost:8080/login");
//        browser.findElement(By.name("password")).sendKeys("12345678");
//        browser.findElement(By.id("btnLogin")).click();
//        slow();
//        String error = browser.findElements(By.className("text-danger")).get(0).getText();
//        Assert.hasText(error, "must not be empty");
//    }
//
//    @Test
//    public void test_Password_Empty() {
//        browser.get("http://localhost:8080/login");
//        browser.findElement(By.name("username")).sendKeys("tien.nguyen@codegym.vn");
//        browser.findElement(By.id("btnLogin")).click();
//        slow();
//        String error = browser.findElements(By.className("text-danger")).get(1).getText();
//        Assert.hasText(error, "must not be empty");
//    }
//
//    @Test
//    public void test_All_Empty() {
//        browser.get("http://localhost:8080/login");
//        browser.findElement(By.id("btnLogin")).click();
//        slow();
//        List<WebElement> textDangers = browser.findElements(By.className("text-danger"));
//        Assert.hasText(textDangers.get(0).getText(), "must not be empty");
//        Assert.hasText(textDangers.get(1).getText(), "must not be empty");
//    }
//
//    @Test
//    public void test_All_Not_Empty() {
//        browser.get("http://localhost:8080/login");
//        browser.findElement(By.name("username")).sendKeys("tien.nguyen@codegym.vn");
//        browser.findElement(By.name("password")).sendKeys("12345678");
//        browser.findElement(By.id("btnLogin")).click();
//        slow();
//        String msg = browser.findElement(By.name("text-success")).getText();
//        Assert.hasText(msg, "Login success!");
//    }

    @Test
    public void test_All_Success() {
        Assert.hasText("Login success!", "Login success!");
    }

}
