package com.automation.basicautomationscript.fileio;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ExcelHandler {

    public static List<Object[]> studentDetails = Arrays.asList(
            new Object[] {"Dilmi,23"},
            new Object[] {"Sandun,24"},
            new Object[] {"Pahasara,26"}
    );

    public static void writeToExcel() throws IOException {
        OutputStream outputStream = new FileOutputStream("studentDetails.xlsm");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        IntStream.range(0, studentDetails.size()).forEach(index -> {
            XSSFRow row = sheet.createRow(index);
            Object[] values = studentDetails.get(index);

            List<Object> objectValues = Arrays.stream(values).toList();
            IntStream.range(0,objectValues.size()).forEach(index2 ->{
                XSSFCell cell = null;
                if(objectValues.get(index2) instanceof String) {
                    cell = row.createCell(index2, CellType.STRING);
                    cell.setCellValue((String) objectValues.get(index2));
                }else {
                    cell = row.createCell(index2, CellType.NUMERIC);
                    cell.setCellValue((int)objectValues.get(index2));

                }
            });
        });
        workbook.write(outputStream);
    }
    public static void main(String[] args) throws IOException {
        ExcelHandler.writeToExcel();
    }
}
