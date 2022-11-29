package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class LeerExcel {
    private String archivoExcel = "DatosUsuario.xlsx";
    private FileInputStream file;
    private XSSFWorkbook book;
    private XSSFSheet hoja;

    public List<Login> obtenerLogin() {
        List<Login> listlogin = new ArrayList<>();
        try {
            this.file = new FileInputStream(archivoExcel);
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("Login");
            Row row;
            int rows = hoja.getPhysicalNumberOfRows()-1;

            for (int i = 1; i <= rows; i++){
                row = hoja.getRow(i);
                listlogin.add(new Login(row.getCell(0).toString(),
                        row.getCell(1).toString(),
                        row.getCell(2).toString()));
            }
            this.book.close();
            this.file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listlogin;
    }

    public List<Article> obtenerArticle() {
        List<Article> articles = new ArrayList<>();
        try {
            this.file = new FileInputStream(archivoExcel);
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("Article");
            Row row;
            int rows = hoja.getPhysicalNumberOfRows()-1;

            for (int i = 1; i <= rows; i++){
                row = hoja.getRow(i);
                articles.add(new Article(row.getCell(0).toString(),
                        row.getCell(1).toString(),
                        row.getCell(2).toString()));
            }
            this.book.close();
            this.file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return articles;
    }
}
