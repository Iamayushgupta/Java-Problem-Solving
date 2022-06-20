package com.company.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        try{
            File obj =new File("temp.txt");
            FileWriter fiw = new FileWriter(obj);
            char c[] = {'a','y','u','s','h'};
            fiw.write(c);

            // to append characters in the given file
            FileWriter fiw2 = new FileWriter(obj,true);
            fiw.close();
            System.out.println("File writing successful");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
