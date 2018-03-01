package com;

import java.util.Scanner;

public class SafeScanner  {

    //validate all arguments in Line while arg is not int type (count of messages = count of missed arguments)
    public static int nextInt(Scanner sc){
        int number = 0;
        while (true){
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                break;
            }
            else{
                System.out.println("Необходимо ввести число типа \'int\'");
                sc.next();
            }

        }
        return number;
    }

    //validate all arguments in Line while arg is not double type (count of messages = count of missed arguments)
    public static double nextDouble(Scanner sc){
        double number = 0;
        while (true){
            if (sc.hasNextDouble()) {
                number = sc.nextDouble();
                break;
            }
            else{
                System.out.println("Необходимо ввести число типа \'double\'");
                sc.next();
            }

        }
        return number;
    }
}
