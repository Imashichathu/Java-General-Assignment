package com.mycompany.jq12pvi;
public class JQ12PVI
{
    public static void main(String[] args)
    {
        try
        {
            int number = -10;
            if (number < 0) 
            {
                throw new NegativeNumberException("Negative numbers not allowed.");
            }
            System.out.println("Number: " + number);
        } 
        catch (NegativeNumberException e)
        {
            System.out.println("Caught NegativeNumberException: " + e.getMessage());
        }
    }
}
