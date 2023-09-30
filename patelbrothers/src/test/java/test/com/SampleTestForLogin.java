/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author riyap
 */
public class SampleTestForLogin {

    private WebDriver driver;
    private String baseUrl;

    public SampleTestForLogin() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        //  driver.close();
    }

    @Test
    public void testCSS() throws InterruptedException {
//Maximize browser window 
        driver.manage().window().maximize();
        driver.get("https://shop.patelbros.com/login");
        driver.findElement(By.name("email")).sendKeys("riyap3231@gmail.com");
        driver.findElement(By.name("password")).sendKeys("riyap1196");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Select This Location")).click();
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li")).click();
        driver.findElement(By.xpath("//div[@id='Produce']/div/ul/li[6]/hs-product-item/div/div/div/div[2]/div/div[2]/div/a")).click();
        driver.findElement(By.xpath("//div[@id='Produce']/div/ul/li[7]/hs-product-item/div/div/div/div[2]/div/div[2]/div/a")).click();
        driver.get("https://shop.patelbros.com/cart");
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.xpath("//div[@id='fulfillment-step']/drawer/div[2]/div/div/button")).click();

    }
}
