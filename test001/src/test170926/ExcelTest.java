package test170926;

import com.sun.corba.se.spi.ior.ObjectKey;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;
import sun.text.resources.cldr.uk.FormatData_uk;

import javax.jnlp.FileOpenService;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/9/30.
 */
public class ExcelTest {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("t1");
        XSSFRow row;

        Map<String,Object[]> empinfo = new TreeMap<>();
        empinfo.put("1", new Object[]{"编号","姓名","年龄"});
        empinfo.put("2", new Object[]{"1","张总","31"});
        empinfo.put("3", new Object[]{"2","杨总","31"});
        empinfo.put("4", new Object[]{"3","丹哥","30"});
        empinfo.put("5", new Object[]{"4","小伙子","25"});
        empinfo.put("6", new Object[]{"4","小伙子","25"});

        Set<String> keyid =empinfo.keySet();
        int rowid =0;
        for (String key:keyid){
            row = sheet.createRow(rowid++);
            Object[] objectArr = empinfo.get(key);
            int cellid = 0;

            XSSFCellStyle mystyle = workbook.createCellStyle();
            mystyle.setFillBackgroundColor(HSSFColor.BLUE.index);

            for(Object obj:objectArr){
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String) obj);
                cell.setCellStyle(mystyle);
            }
        }
        FileOutputStream out2 = new FileOutputStream(new File("E:\\test20170929\\abc\\20170930II.xlsx"));
        workbook.write(out2);
        out2.close();
        System.out.println("make the second test excel file success.");

        FileOutputStream out = new FileOutputStream(new File("E:\\test20170929\\abc\\20170930.xlsx"));

        workbook.write(out);
        out.close();
        System.out.println("make the test excel file success.");
    }
}
