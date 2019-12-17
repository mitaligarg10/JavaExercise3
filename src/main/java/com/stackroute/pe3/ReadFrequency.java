package com.stackroute.pe3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ReadFrequency {
    public static void main(String[] args) throws IOException {
        File path = new File("FileDemo.txt");
        System.out.println("I have got a file : " + path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Map<String, Integer> frequency = new HashMap<>();
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println("Processing line: " + line);
            if (!line.trim().equals("")) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word == null || word.trim().equals("")) {
                        continue;
                    }
                    String processed = word.toLowerCase();
                    if (frequency.containsKey(processed)) {
                        frequency.put(processed, frequency.get(processed) + 1);
                    } else {
                        frequency.put(processed, 1);
                    }
                }
            }
            line = bufferedReader.readLine();
        }
        System.out.println("Frequency is : " + frequency);
    }
}