package com.mycompany.jq12pv;
public class JQ12PV 
{
    public static void main(String[] args)
    {
         try
         {
            int n1=6;
            int n2=1;
            int r=n1/n2;
            System.out.println("Result: " + r);
         } 
         catch (ArithmeticException e)
         {
            System.out.println("Arithmetic Exception| " + e.getMessage());
         }
    }

    public static int divide(int n1, int n2) throws ArithmeticException
    {
        if (n2 == 0) 
        {
            throw new ArithmeticException("Division by zero ");
        }
        return n1 / n2;
    }

}
