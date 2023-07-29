package com.mycompany.jq12pii;
import java.util.Scanner;
public class JQ12PII
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a number ");
        String input = s.nextLine();
        
        try
        {
            int num = Integer.parseInt(input);
            int r = 10/num;
            System.out.println("Result: "+r);
        }
        
        catch(NumberFormatException e)
        {
            System.out.println("Invalid input,Please enter a valid number.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch(Exception e)
        {
            System.out.println("An unexcepted error occurred:"+e.getMessage());
        }
        
        finally
        {
            System.out.println("The program execution is complete.");
            s.close();
        }
    }
}
