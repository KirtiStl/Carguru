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
public class Test3Page {
    private WebDriver driver;
    
    public Test3Page(WebDriver driver){
        
        this.driver=driver;
    
}

public boolean carDetailwithoutZip(String make,String model,String year) throws InterruptedException, FileNotFoundException, IOException
    {


      Select carmake = new Select(driver.findElement(By.id("makes")));
    carmake.selectByVisibleText("Toyota");
     Select carmodel = new Select(driver.findElement(By.id("models")));
     carmodel.selectByVisibleText("Corolla");
     Select years = new Select(driver.findElement(By.id("years")));
     years.selectByVisibleText("2020");
                     
    driver.findElement(By.xpath("//html[1]/body[1]/div[4]/main[1]/form[1]/button[1]")).click();
   
    Thread.currentThread().sleep(2000);
    driver.findElement(By.id("checkOutPopUp"));
                      
     return true;
     
    }
    
}
