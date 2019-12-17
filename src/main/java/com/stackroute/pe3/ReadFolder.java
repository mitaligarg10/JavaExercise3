package com.stackroute.pe3;

import java.io.*;

public class ReadFolder {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/niit/IdeaProjects/JavaExercise3/MyFolder");
        String[] files = file.list(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".txt")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String fileName : files) {
            byte[] result = null;
            try (BufferedReader br = new BufferedReader(new FileReader(file.toString() + "/" + fileName))) {
                StringBuilder sb = new StringBuilder();
                InputStream is = null;
                String line;
                while ((line = br.readLine()) != null)
                    sb.append(line).append(System.getProperty("line.separator"));
                result = sb.toString().getBytes();
                System.out.println(new String(result, 0));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}