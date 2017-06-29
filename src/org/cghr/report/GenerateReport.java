package org.cghr.report;

/**
 * Created by mahtab on 29/6/17.
 */

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.cghr.util.RecordParser;

import java.io.*;
import java.util.Iterator;


public class GenerateReport {

    private static final String FILE_NAME = "/home/mahtab/mireille/anand/va/anand_va.xlsx";

   public static void generateReport(){
       try{

           XSSFWorkbook workbook = new XSSFWorkbook();
           XSSFSheet sheet = workbook.createSheet("eVA");

           int rowNum = 0;

           Row row = sheet.createRow(rowNum++);
           int colNum = 0;
           Cell cell = row.createCell(colNum++);  cell.setCellValue("DeathId");

           for(String key: RecordParser.records.keySet()){
               System.out.println(key);
           }

           FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
           workbook.write(outputStream);
           //workbook.close();

       }catch(Exception e){
           System.out.println(e);
       }
   }


}
