package com.company.FileHandling;

import java.io.*;

public class DataStream {
    public static void main(String[] args) throws IOException {
        File obj = new File("feb.txt");
        FileOutputStream fout = new FileOutputStream(obj);
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeBoolean(true);
        dout.writeInt(2);
        dout.close();

        FileInputStream fin = new FileInputStream(obj);
        DataInputStream din = new DataInputStream(fin);
        boolean f = din.readBoolean();
        int k = din.readInt();
        System.out.println(f + " " + k);

    }
}
