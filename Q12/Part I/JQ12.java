package com.mycompany.jq12;
import java.util.Scanner;
public class JQ12
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter the size of the array: ");
            int size = s.nextInt();
            
            if(size<0)
                    {
                        throw new NegativeArraySizeException("Array Size cannot be Negative.");
                    }
            int[]array = new int[size];
            System.out.println("Array Size: "+size);
        }
        
        catch(NegativeArraySizeException e)
        {
            System.out.println("Error "+e.getMessage());
        }
        catch(Exception e)
                {
                    System.out.println("Error: Invalid Output.");
                }
        
        finally
        {
            s.close();
        }
        
    }
}
