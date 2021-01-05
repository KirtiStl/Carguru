/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sel.cargurus;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author deepa
 */
public class NewCarPageObject {
    
    public NewCarPageObject() {
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
     public void tesTest1PageObjectFramework() throws IOException, FileNotFoundException, InterruptedException {
         try
             
         {
         
         FileInputStream fs = new  FileInputStream ( new File ("C:\\QA\\carguru.xlsx")) ;
        Workbook wb = new XSSFWorkbook(fs);
        Sheet sh = wb.getSheetAt(0);
         String make  = sh.getRow(1).getCell(0).getStringCellValue();
         String model  = sh.getRow(1).getCell(1).getStringCellValue();
         String year  = sh.getRow(1).getCell(2).toString();
         year = year.substring(0,year.indexOf('.'));
         String zip  = sh.getRow(1).getCell(3).toString();
         zip = zip.substring(0,zip.indexOf('.'));
         
         HomePage homePage=new HomePage(driver);        
         Test1Page test1Page=homePage.getCarSearch();
         test1Page.carSearch(make,model,year,zip);
     
                
     fs.close();
         }
         catch (Exception ex) {
                         System.out.println(ex.getMessage());
         }
     
}
     
      @Test
     public void tesTest2PageObjectFramework() throws IOException, FileNotFoundException, InterruptedException {
         try
             
         {
         
         FileInputStream fs = new  FileInputStream ( new File ("C:\\QA\\carguru.xlsx")) ;
        Workbook wb = new XSSFWorkbook(fs);
        Sheet sh = wb.getSheetAt(0);
         String make  = sh.getRow(1).getCell(0).getStringCellValue();
         String model  = sh.getRow(1).getCell(1).getStringCellValue();
         String year  = sh.getRow(1).getCell(2).toString();
         year = year.substring(0,year.indexOf('.'));
         String zip  = sh.getRow(1).getCell(3).toString();
         zip = zip.substring(0,zip.indexOf('.'));
         String firstname  = sh.getRow(1).getCell(4).getStringCellValue();
         String lastname  = sh.getRow(1).getCell(5).getStringCellValue();
         String email  = sh.getRow(1).getCell(6).getStringCellValue();
         
         HomePage homePage=new HomePage(driver);        
         Test2Page test2Page=homePage.getCarDetail();
         test2Page.carDetail(make,model,year,zip,firstname,lastname,email);
     
                
     fs.close();
         }
         catch (Exception ex) {
                         System.out.println(ex.getMessage());
         }
     
}
     
       @Test
          public void tesTest3PageObjectFramework() throws IOException, FileNotFoundException, InterruptedException {
          try
             
         {
         
         FileInputStream fs = new  FileInputStream ( new File ("C:\\QA\\carguru.xlsx")) ;
         Workbook wb = new XSSFWorkbook(fs);
         Sheet sh = wb.getSheetAt(0);
         String make  = sh.getRow(1).getCell(0).getStringCellValue();
         String model  = sh.getRow(1).getCell(1).getStringCellValue();
         String year  = sh.getRow(1).getCell(2).toString();
         year = year.substring(0,year.indexOf('.'));
     
         HomePage homePage=new HomePage(driver);        
         Test3Page test3Page=homePage.getCarDetailwithoutZip();
         test3Page.carDetailwithoutZip(make,model,year);
         
        fs.close();
         }
         catch (Exception ex) {
                         System.out.println(ex.getMessage());
     
     
         }    
}
   @Test
          public void tesTest4PageObjectFramework() throws IOException, FileNotFoundException, InterruptedException {
          try
          {
              FileInputStream fs = new  FileInputStream ( new File ("C:\\QA\\carguru.xlsx")) ;
              Workbook wb = new XSSFWorkbook(fs);
              Sheet sh = wb.getSheetAt(0);
              String firstname  = sh.getRow(1).getCell(4).getStringCellValue();
              String lastname  = sh.getRow(1).getCell(5).getStringCellValue();
              String zip  = sh.getRow(1).getCell(3).toString();
              zip = zip.substring(0,zip.indexOf('.'));
              String email  = sh.getRow(1).getCell(6).getStringCellValue();
              
            HomePage homePage=new HomePage(driver);        
            Test4Page test4Page=homePage.getCarImage();
            test4Page.carImage(firstname,lastname,zip,email);
         
       
         }
         catch (Exception ex) {
                         System.out.println(ex.getMessage());  
          }       
}
}