package com.level.intelligence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IntellTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/BigSong/Downloads/chromedriver");
        //WebDriver是一个接口，每一种浏览器都有一个实现类（多态）
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        //与浏览器同步非常重要，必须等待浏览器加载完毕
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //下面这句等价于webDriver.navigate().to("www.baidu.com");
        webDriver.get("http://www.baidu.com");
        //在输入框中填写要搜索的内容
        WebElement tel = webDriver.findElement(By.id("usrTel"));
        tel.sendKeys("13808451925");
        WebElement usrPass = webDriver.findElement(By.id("usrPass"));
        usrPass.sendKeys("1234");
        WebElement login = webDriver.findElement(By.id("login"));
        login.click();
    }
}
