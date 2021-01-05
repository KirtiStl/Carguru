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

/**
 *
 * @author deepa
 */
public class Test5 {
    
    public Test5() {
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
    @Test
     public void testNewCar() throws InterruptedException {
         
         try{
         
     driver.get("http://www.cargurus.com");
     driver.findElement(By.partialLinkText("New Cars")).click();
       //  driver.findElement(By.linkText("SUV / Crossover")).click();
      Thread.currentThread().sleep(5000);   
     //driver.findElement(By.xpath("//html[1]/body[1]/div[4]/div[3]/div[1]/a[3]/div[1]/div[1]/img[1]")).click();
     driver.findElement(By.xpath("//html[1]/body[1]/div[4]/div[3]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
     Thread.currentThread().sleep(2000);      
     //driver.findElement(By.xpath("//html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")).click();
      driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")).click();
      driver.findElement(By.name("firstName")).sendKeys("Rohan");
      driver.findElement(By.name("lastName")).sendKeys("Kumar");
      driver.findElement(By.name("postalCode")).sendKeys("60504");
      driver.findElement(By.name("emailAddress")).sendKeys("insurewithrohan@gmail.com");
      driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/section[1]/div[1]/form[1]/div[3]/button[1]")).click();
      
      
         }
         
     catch (Exception ex) {
                         System.out.println(ex.getMessage());
                            }

     
     
     }
}
