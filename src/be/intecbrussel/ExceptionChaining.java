package be.intecbrussel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println("BACK IN MAIN");
        }
    }

    public static void method1() throws FileNotFoundException {
//        try {
            method2();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error in method 1");
//            throw e;
//        }
    }

    public static void method2() throws FileNotFoundException {
//        try {
            method3();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error in method 2");
//            throw e;
//        }
    }

    public static void method3() throws FileNotFoundException {
        try {
            method4();
        } catch (FileNotFoundException e) {
            System.out.println("Error in method 3");
            throw e;
        }
    }

    public static void method4() throws FileNotFoundException {
        try {
            method5();
        } catch (FileNotFoundException e) {
            System.out.println("Error in method 4");
            throw e;
        }
    }

    public static void method5() throws FileNotFoundException {
        try {
            method6();
        } catch (FileNotFoundException e) {
            System.out.println("Error in method 5");
            throw e;
        }
    }

    public static void method6() throws FileNotFoundException {
        try {
            method7();
        } catch (FileNotFoundException e) {
            System.out.println("Error in method 6");
            throw e;
        }
    }

    public static void method7() throws FileNotFoundException{
        try {
            thisIsOverkill();
        } catch (FileNotFoundException e) {
            System.out.println("Error in method 7");
            throw e;
        }
    }

    public static void thisIsOverkill() throws FileNotFoundException{
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
            throw fnfe;
        }

    }

}
