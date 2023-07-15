package com.mycompany.jq6;
public class JQ6
{
    public static void main(String[] args)
    {
        Date d1 = new Date(4,17,2023);
        d1.display();
        
        d1.setMonth(10);
        d1.setDay(13);
        d1.setYear(2023);
        
        System.out.print(" "+d1.getMonth());
        System.out.print("/"+d1.getDay());
        System.out.println("/"+d1.getYear());
    }
}
