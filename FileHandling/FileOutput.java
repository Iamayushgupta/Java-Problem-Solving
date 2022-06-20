package com.company.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        File obj = new File("temp.txt");
        FileOutputStream fout = new FileOutputStream(obj);
        fout.write(104);
        fout.write(101);
        fout.write(108);
        fout.write(108);
        fout.write(110);

        fout.close();
        FileInputStream fin = new FileInputStream(obj);
        int data = fin.read();
        System.out.println((char)data);
    }
}
