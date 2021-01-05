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
public class Test4Page {
    private WebDriver driver;
    
    public Test4Page(WebDriver driver){
        
        this.driver=driver;
    
}

public boolean carImage(String firstname,String lastname,String zip,String email) throws InterruptedException, FileNotFoundException, IOException
    {
      
      //driver.findElement(By.xpath("//html[1]/body[1]/div[4]/div[3]/div[1]/a[3]/div[1]/div[1]/img[1]")).click();
     driver.findElement(By.xpath("//html[1]/body[1]/div[4]/div[3]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
     Thread.currentThread().sleep(2000);  
     driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")).click();
      driver.findElement(By.name("firstName")).sendKeys(firstname);
      driver.findElement(By.name("lastName")).sendKeys(lastname);
      driver.findElement(By.name("postalCode")).sendKeys(zip);
      driver.findElement(By.name("emailAddress")).sendKeys(email);
      driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/section[1]/div[1]/form[1]/div[3]/button[1]")).click();
      
     
     
     
    /* driver.findElement(By.xpath("//html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]/picture[1]/img[1]")).click();
                      
     driver.findElement(By.name("firstName")).sendKeys(firstname);
     driver.findElement(By.name("lastName")).sendKeys(lastname);
     Select inquiry = new Select(driver.findElement(By.name("inquiryType")));
     driver.findElement(By.id("ZIP")).sendKeys(zip);
     driver.findElement(By.name("emailAddress")).sendKeys(email);
     Thread.currentThread().sleep(2000);
     driver.findElement(By.xpath("//html[1]/body[1]/main[1]/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/section[1]/div[1]/form[1]/div[3]/button[1]")).click();   
*/
     return true; 
}
}

