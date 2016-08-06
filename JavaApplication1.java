/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
  int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println("The given number "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The given number "+n+" is Negative");
        }
        else
        {
            System.out.println("The given number "+n+" is neither Positive nor Negative ");
        }
    }
    }

