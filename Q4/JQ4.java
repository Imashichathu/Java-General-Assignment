package com.mycompany.jq4;
import java.util.Scanner;
public class JQ4
{
    public static void main(String[] args) 
    {
        int x , y, z ;
        int sum , product ;
        float average ;
        
        Scanner c =new Scanner(System.in);
        System.out.println("Enter a number for x");
        x =c.nextInt();
        System.out.println("Enter a number for y");
        y =c.nextInt();
        System.out.println("Enter a number for z");
        z =c.nextInt();
        
        sum =( x + y + z );
        System.out.println("Sum of three integers "+sum);
  
        product =( x * y * z );
        System.out.println("Product of three integers "+product);

        average = sum / 3;
        System.out.println("Average of three integers "+average);
        
        //find the smallest number
        int smallest = x;
        if (y < smallest) 
        {
            smallest = y;
        }
        if (z < smallest)
        {
            smallest = z;
        }
        
        //find the largest number
        int largest = x;
        if (y > largest) 
        {
            largest = y;
        }
        if (z > largest)
        {
            largest = z;
        }
        
        System.out.println("Smallest Integer is "+smallest);
        System.out.println("Largest Integer is "+largest);
    }
}
