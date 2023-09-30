/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.project.patelbrothers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author riyap
 */
public class PatelLoginPage {
    
     WebDriver driver;

    public PatelLoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
     @FindBy(xpath = ".//*[@name='email']")
    private WebElement gmail;

    @FindBy(xpath = ".//*[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitBtn;
    
    
    public void loginToPatelBrothersApplication(String gMail, String pWord)
            throws Exception {
        try {
            driver.get("https://shop.patelbros.com/login");
            gmail.sendKeys(gMail);
            password.sendKeys(pWord);
            submitBtn.click();
            //   LoginPage login = new LoginPage(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
}
