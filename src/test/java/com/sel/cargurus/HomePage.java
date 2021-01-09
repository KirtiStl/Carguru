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

/**
 *
 * @author deepa
 */
public class HomePage {
    
    private WebDriver driver;
    
    public HomePage(WebDriver driver){
        
         this.driver=driver;
         driver.get("http://www.cargurus.com");
         
          }  
    
     public Test1Page getCarSearch() throws FileNotFoundException, IOException, InterruptedException{
        
        
       driver.findElement(By.partialLinkText("New Cars")).click();
        return  new Test1Page(driver);
                    
    }
      public Test2Page getCarDetail() throws FileNotFoundException, IOException, InterruptedException{
        
        
       driver.findElement(By.partialLinkText("New Cars")).click();
        return  new Test2Page(driver);
       
}
     public Test3Page getCarDetailwithoutZip() throws FileNotFoundException, IOException, InterruptedException{
        
        
       driver.findElement(By.partialLinkText("New Cars")).click();
        return  new Test3Page(driver); 
      
}
   public Test4Page getCarImage() throws FileNotFoundException, IOException, InterruptedException{
        
        
       driver.findElement(By.partialLinkText("New Cars")).click();
        return  new Test4Page(driver);    
}
}

