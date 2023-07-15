package com.mycompany.jq6;
public class Date
{
    private int month , day , year;

    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    //setter method
    public void setMonth(int month)
    {
        this.month = month;
    }
    public void setDay(int day)
    {
        this.day = day;
    }
    public void setYear(int year) 
    {
        this.year = year;
    }
    
    //getter method
    public int getMonth() 
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public int getYear() 
    {
        return year;
    }
    
    //display method
    public void display()
    {
        System.out.print(" "+month);
        System.out.print("/"+day);
        System.out.println("/"+year);
    }
      
}
