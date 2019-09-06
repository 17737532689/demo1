package com.example.demo.poi;


import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class createExcel {



public static void cExcel(String excelName) throws IOException {

    //创建工作簿
    XSSFWorkbook wb = new XSSFWorkbook();
    //创建一个sheet
    XSSFSheet sheet = wb.createSheet();
  //设计风格
    XSSFCellStyle style = wb.createCellStyle();
    style.setFillForegroundColor((short)4);
    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
  //  style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
    style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
    style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
    style.setBorderBottom(BorderStyle.THIN);
    style.setBorderLeft(BorderStyle.THIN);
    style.setBorderRight(BorderStyle.THIN);
    style.setBorderTop(BorderStyle.THIN);
   //为单元格以添加背景样式
    for(int i = 0;i < 6;i++){

        Row row = sheet.createRow(i);
        for(int j = 0;j<6;j++){
          row.createCell(j).setCellStyle(style);
        }

    }
   //合并单元格
    sheet.addMergedRegion(new CellRangeAddress(0,1,0,0));
    sheet.addMergedRegion(new CellRangeAddress(0,0,1,5));
 //填入数据

    XSSFRow  row = sheet.getRow(0);

    row.getCell(1).setCellValue("2019年期末考试");
    XSSFRow row1 = sheet.getRow(1); //获取第二行，为每一列添加字段
    row1.getCell(1).setCellValue("语文");
    row1.getCell(2).setCellValue("数学");
    row1.getCell(3).setCellValue("英语");
    row1.getCell(4).setCellValue("物理");
    row1.getCell(5).setCellValue("化学");
    XSSFRow row2 = sheet.getRow(2); //获取第三行
    row2.getCell(0).setCellValue("张三");
    XSSFRow row3 = sheet.getRow(3); //获取第四行
    row3.getCell(0).setCellValue("张三");
    XSSFRow row4 = sheet.getRow(4); //获取第五行
    row4.getCell(0).setCellValue("张三");
    XSSFRow row5 = sheet.getRow(5); //获取第五行
    row5.getCell(0).setCellValue("张三");
   //将数据写入文件
    BufferedOutputStream bos = new BufferedOutputStream(
            new FileOutputStream(new File("E:/log"+"/"+excelName)));
    wb.write(bos);
}

    public static void readExcel(String exceName) throws IOException {
        //将文件读入
        BufferedInputStream bos = new BufferedInputStream(new FileInputStream(new File("E:/log"+"/"+exceName)));
        XSSFWorkbook wb = new XSSFWorkbook(bos);

        //读取第一个sheet
        Sheet sheet =wb.getSheetAt(0);
        //获取第二行
        Row row = sheet.getRow(1);

        for(int i=1;i<6;i++){
            System.out.println(row.getCell(i));
        }

    }

    public static void main(String[] args) throws IOException {
     //   cExcel("su");
        readExcel("su");
    }

}
