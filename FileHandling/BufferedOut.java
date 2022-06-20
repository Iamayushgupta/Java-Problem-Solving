package com.company.FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOut {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufin = new BufferedInputStream(System.in);
        int data = bufin.read();
        bufin.close();
        BufferedOutputStream bufout = new BufferedOutputStream(System.out);
        bufout.write(data);
        bufout.close();
    }
}
