package be.intecbrussel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
        } catch (FileNotFoundException fnfe) {
            System.out.println("File is not found");
        }
    }
}
