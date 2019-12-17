package com.stackroute.pe3;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File path = new File("Hello.txt");
        System.out.println("I have got a file : " + path);

       /* String contentsToWrite = "Hello world";
        OutputStream outputStream = new FileOutputStream(path);
        outputStream.write(contentsToWrite.getBytes());
        outputStream.close();*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String firstLine = bufferedReader.readLine();
        String firstLine1 = firstLine.toUpperCase();
        int firstLine2 = firstLine1.length();
        bufferedReader.close();
        System.out.println("Read a line :  " + firstLine);
        System.out.println("Text in UpperCase : " + firstLine1);
        System.out.println("Length of the file : " + firstLine2);
    }
}
