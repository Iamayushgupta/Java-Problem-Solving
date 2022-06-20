package com.company.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class q15 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        while (true){
            System.out.println("1. Count the number of words in string");
            System.out.println("2. Convert character array to string");
            System.out.println("3. Find most frequently occurring character");
            System.out.print("Enter operation to be performed : ");
            int opt = sc.nextInt();
            if (opt==1){
                System.out.print("Enter the string : ");
                String s= br.readLine();
                System.out.println("Total number of words in string is/are : " + wordCount(s));
            }
            else if (opt==2){
                System.out.print("Enter the length of char array : ");
                int len = sc.nextInt();
                char[] ch = new char[len];
                System.out.println("Enter the characters : ");
                for(int i=0;i<len;i++){
                    ch[i]=sc.next().charAt(0);
                }
                System.out.println(arrayToString(ch));
            }
            else if (opt==3){
                System.out.print("Enter the string : ");
                String s= br.readLine();
                System.out.println("Most occurring character in string is : " + mostFreq(s));
            }
            else{
                break;
            }
        }
    }

    static int wordCount(String s){
        String[] arr = s.split(" ");
        int c=0;
        for (String a : arr) {
            if (a.strip().length() > 0) {
                c++;
            }
        }
        return c;
    }

    static String arrayToString(char arr[]){
        String str = new String(arr);
        return str;
    }
    static char mostFreq(String str){
        int count[] = new int[256];
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;

        int max = -1;  //
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;

    }

}

