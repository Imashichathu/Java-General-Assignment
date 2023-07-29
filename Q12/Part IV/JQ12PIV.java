package com.mycompany.jq12piv;
public class JQ12PIV
{
    public static void main(String[] args)
    {
        int[] n={1,2,3,4,5};
        try
        {
             n[10]=50;  //ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds Exception /" + e.getMessage());
        }
        finally 
        {
           for(int j=0; j<n.length;j++)
           {
               System.out.println(n[j]);
           }
        }
    }
}

