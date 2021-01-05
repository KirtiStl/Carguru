/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sel.cargurus;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author deepa
 */
public class Test2Page {
    private WebDriver driver;
    
    public Test2Page(WebDriver driver){
        
        this.driver=driver;
       
}
    public boolean carDetail(String make,String model,String year,String zip,String firstname,String lastname,String email) throws InterruptedException, FileNotFoundException, IOException
    {
        Select carmake = new Select(driver.findElement(By.id("makes")));
     carmake.selectByVisibleText(make);
     Select carmodel = new Select(driver.findElement(By.id("models")));
     carmodel.selectByVisibleText(model);
     Select years = new Select(driver.findElement(By.id("years")));
     years.selectByVisibleText(year);
  
     driver.findElement(By.id("ZIP")).sendKeys(zip);
     
    driver.findElement(By.xpath("//body/div[4]/main[1]/form[1]/div[4]/button[1]/*[1]")).click();
    Thread.currentThread().sleep(1000);
     
     driver.findElement(By.xpath("/html[1]/body[1]/div[4]/main[1]/form[1]/button[1]")).click();
     
     Thread.currentThread().sleep(2000);
     driver.findElement(By.xpath("//html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")).click();
     
     driver.findElement(By.name("firstName")).sendKeys(firstname);
     driver.findElement(By.name("lastName")).sendKeys(lastname);
     Select inquiry = new Select(driver.findElement(By.name("inquiryType")));
     
     driver.findElement(By.name("emailAddress")).sendKeys(email);
     Thread.currentThread().sleep(2000);
     driver.findElement(By.xpath("//html[1]/body[1]/main[1]/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/section[1]/div[1]/form[1]/div[3]/button[1]")).click();
     
        
        
      return true;  
    }
}

