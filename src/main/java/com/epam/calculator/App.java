package com.epam.calculator;
import java.util.*;
import java.lang.*;

import java.util.*;

class Calculator {
    public Double addition(Double x, Double y) {
        return(x+y);
    }

    public Double subtraction(Double x, Double y) {
        return(x-y);
    }

    public Double multiplication(Double x, Double y) {
        return(x*y);
    }

    public Double division(Double x, Double y) {
        return(x/y);
    }
}

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Calculator cl = new Calculator();

        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        Double a = sc.nextDouble();
        
        System.out.print("Enter the second number: ");
        Double b = sc.nextDouble();
    
        System.out.println("Enter '+' for Addition \nEnter '-' for Subtraction \nEnter '*' for Multiplication \nEnter '/' for Division");

        System.out.print("Enter your choice: ");
        String choice = st.nextLine();

        Double cal = 0.0;
        int check = 0;
       
        switch(choice) {
            case "+": {
                cal = cl.addition(a, b); check = 1; break;
            }

            case "-": {
                cal = cl.subtraction(a, b); check = 1; break;
            }

            case "*": {
                cal = cl.multiplication(a, b); check = 1; break;
            }

            case "/": {
                cal = cl.division(a, b); check = 1; break;
            }
            default: System.out.println("Invalid Choice");
        }

        if(check == 1) {
            System.out.println("Result: " + cal);
        }
    }
}