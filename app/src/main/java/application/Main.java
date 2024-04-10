package application;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        
        Scanner scn = new Scanner(System.in);
        try {
            int valor = scn.nextInt();
        } catch(NoSuchElementException ex) {
            System.out.println("Exception Ocorreu");
        } catch(Exception ex) {
            System.out.println("IOException");
        } finally {
            scn.close();
        }
    }
}

