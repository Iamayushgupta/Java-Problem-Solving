package com.company.FileHandling;

import java.io.*;

public class InputStream {
    public static void main(String[] args) throws IOException {
        File obj =new File("temp.txt");
        FileInputStream fin = new FileInputStream(obj);
        //InputStreamReader for reading 16b its
        InputStreamReader iread = new InputStreamReader(fin,"UTF-16");
        int data = iread.read();
        System.out.println((char)data);
    }
}
