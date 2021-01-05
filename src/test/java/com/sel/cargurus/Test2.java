/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sel.cargurus;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author deepa
 */
public class Test2 {
    
    public Test2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    WebDriver driver;
    
   @Before
    public void setUp() {
        
                System.setProperty("webdriver.chrome.driver", "c:\\QA\\Drivers\\chromedriver.exe");
       
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
     public void testNewCar() throws InterruptedException {
         
         try{
     
     driver.get("http://www.cargurus.com");
     WebElement e=driver.findElement(By.partialLinkText("New Cars"));
     e.click();
     Select make = new Select(driver.findElement(By.id("makes")));
     make.selectByVisibleText("Honda");
     Select model = new Select(driver.findElement(By.id("models")));
     model.selectByVisibleText("Civic");
     Select years = new Select(driver.findElement(By.id("years")));
     years.selectByVisibleText("2020");
     //driver.findElement(By.id("ZIP")).clear();
     driver.findElement(By.id("ZIP")).sendKeys("60504");
     
    //if (driver.switchTo().alert().equals(1))
    //driver.switchTo().alert().dismiss();
    //Thread.currentThread().sleep(1000);
     driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[4]/button[1]/*[1]")).click();
    Thread.currentThread().sleep(1000);
     
     driver.findElement(By.xpath("/html[1]/body[1]/div[4]/main[1]/form[1]/button[1]")).click();
     
     Thread.currentThread().sleep(2000);
     driver.findElement(By.xpath("//html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")).click();
     
     driver.findElement(By.name("firstName")).sendKeys("Rohan");
     driver.findElement(By.name("lastName")).sendKeys("Kumar");
     Select inquiry = new Select(driver.findElement(By.name("inquiryType")));
     //inquiry.selectByVisibleText("I'd like to know your best price for this");
    // driver.findElement(By.name("postalCode")).sendKeys("60504");
     driver.findElement(By.name("emailAddress")).sendKeys("insurewithrohan@gmail.com");
     Thread.currentThread().sleep(2000);
     driver.findElement(By.xpath("//html[1]/body[1]/main[1]/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/section[1]/div[1]/form[1]/div[3]/button[1]")).click();
     
         }
         
         
     catch (Exception ex) {
                         System.out.println(ex.getMessage());
                            }
}
     
       
     
     
}

     
    
