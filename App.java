
package com.agile.CodeSamplesForAssertion;
import java.util.Scanner;

public class App {

    public void operation() 
    {
        int m, n, opt, add, sub, mul;
        double div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        m = s.nextInt();
        System.out.print("Enter second number:");
        n = s.nextInt();
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            opt = s.nextInt();
            switch(opt)
            {
                case 1:
                add = addition(m,n);
                System.out.println("Result:"+add);
                break;
 
                case 2:
                sub = subtraction (m,n);
                System.out.println("Result:"+sub);
                break;
 
                case 3:
                mul = multiply(m , n);
                System.out.println("Result:"+mul);
                break;
 
                case 4:
                div = divide (m , n);
                System.out.println("Result:"+div);
                break;    
 
                case 5:
                System.exit(0);
            }
        }
    }

    public int addition(int i, int j) {
        int k = i + j;
        return k;
    }
       
    public int subtraction(int i, int j)  {
          int  k = i - j;
        return k;
    }

    public int multiply (int i, int j)  {
           int k = i * j;
        return k;   
    }

    public double divide (double i, double j)  {
           double k = (i / j);
     return k; 
    }  
 
}