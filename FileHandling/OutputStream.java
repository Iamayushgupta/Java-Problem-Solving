package com.company.FileHandling;

import java.io.*;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        File obj =new File("temp.txt");
        FileOutputStream fout = new FileOutputStream(obj);
        OutputStreamWriter iwrite = new OutputStreamWriter(fout,"UTF-16");
        iwrite.write(1013);

    }
}
