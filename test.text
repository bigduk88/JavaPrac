package com.javaprac.programmersIntermediate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CharIOExam02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader
                    (new FileReader("/Users/burningyak/Desktop/BurningYak/javaprac/src/main/java/com/javaprac/programmersIntermediate/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("test.text"));
            String line = null;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }
}
