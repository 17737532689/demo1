package com.example.demo.poi;

import com.example.demo.entity.Teacher;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import sun.security.jgss.HttpCaller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @param
 * @author yangchaojie
 * @return
 */
@Controller
public class poiController {
    @RequestMapping(value = "/UserExcelDownloads", method = RequestMethod.GET)
    public ModelAndView downloadAllClassmate(HttpServletRequest request , HttpServletResponse response,ModelMap map){

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        List<Teacher> classmateList = new ArrayList<>();

        Teacher teachers = new Teacher();
        teachers.setTname("张三");
        teachers.setTno("1234");
        teachers.setType("中国");
        teachers.setTpassword("123");
        classmateList.add(teachers);
        String fileName = "userinf"  + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据
        int rowNum = 1;
        String[] headers = { "学号", "姓名", "身份类型", "登录密码"};
        //headers表示excel表中第一行的表头
        HSSFRow row = sheet.createRow(0);
        //在excel表中添加表头
        for(int i=0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (Teacher teacher : classmateList) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(teacher.getTno());
            row1.createCell(1).setCellValue(teacher.getTname());
            row1.createCell(2).setCellValue(teacher.getType());
            row1.createCell(3).setCellValue(teacher.getTpassword());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        try {
            response.flushBuffer();
            workbook.write(response.getOutputStream());
            map.put("200","ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
      return  new ModelAndView(new MappingJackson2JsonView(),map);
    }
}
