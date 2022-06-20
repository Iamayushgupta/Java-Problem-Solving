package com.company.FileHandling;

import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedStream {
    public static void main(String[] args) throws IOException {
        // takes input
        BufferedInputStream bufin = new BufferedInputStream(System.in);
        int data =bufin.read();
        System.out.println((char)data);

        byte b[]=new byte[4];
        bufin.read(b);
        for(byte c:b){
            System.out.println((char)c);
        }

        int data2= bufin.read();
        bufin.mark(1);
        byte b2[] = new byte[4];
        bufin.read(b2);
        bufin.reset();
        data2 = bufin.read();
        System.out.println((char)data2);


    }
}
