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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author deepa
 */
public class Test4 {
    
    public Test4() {
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
     driver.findElement(By.partialLinkText("New Cars")).click();
     Select make = new Select(driver.findElement(By.id("makes")));
     make.selectByVisibleText("Toyota");
     Select model = new Select(driver.findElement(By.id("models")));
     model.selectByVisibleText("Corolla");
     Select years = new Select(driver.findElement(By.id("years")));
     years.selectByVisibleText("2020");
   //  driver.findElement(By.id("ZIP"));
   //Thread.currentThread().sleep(5000);
                      
    driver.findElement(By.xpath("//html[1]/body[1]/div[4]/main[1]/form[1]/button[1]")).click();
   
   //  driver.findElement(By.id("ZIP")).submit();
    Thread.currentThread().sleep(2000);
    driver.findElement(By.id("checkOutPopUp"));
     //  driver.switchTo().defaultContent();
       //  System.out.println("reached");
      // driver.findElement(By.id("ZIP")).sendKeys("60504");
     // driver.findElement(By.id("ZIP")).submit();
      
         }
         
     catch (Exception ex) {
                         System.out.println(ex.getMessage());
                            }

              
     
}
}
