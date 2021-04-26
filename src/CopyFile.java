import java.io.*;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\file text\\source file.txt");
            fileOutputStream = new FileOutputStream("D:\\file text\\target file.txt");
          int check;
            while ((check = fileInputStream.read()) != -1) {
                System.out.print((char) check);
                fileOutputStream.write(check);
            }
        } catch (Exception e) {
            System.err.println("ko tim thay or loi");

        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e) {
                    System.err.println("ko tim thay or loi");
                }
            }
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}


