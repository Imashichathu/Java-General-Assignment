package com.mycompany.jq12piii;
public class JQ12PIII 
{
    public static void main(String[] args)
    {
        try
        {
            // Uncomment one of the lines below to see the different outcomes:

            // Case 1: SubClassException takes precedence
            // throw new SubClassException("SubClassException occurred!");

            // Case 2: BaseException is caught after SubClassException
            // throw new BaseException("BaseException occurred!");

        }
        catch (SubClassException e)
        {
            System.out.println("Caught SubClassException: " + e.getMessage());
        } 
        catch (BaseException e) 
        {
            System.out.println("Caught BaseException: " + e.getMessage());
        } 
        catch (Exception e)
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        
    }
}
