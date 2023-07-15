package com.mycompany.jq7;
public class JQ7 
{
    public static void main(String[] args)
    {
        Item i1 = new Item(1,"doll");
        System.out.println("Location is "+i1.getLocation());
        System.out.println("Description is "+i1.getDescription());
        
        i1.setLocation(2);
        i1.setDescription("bag");
        System.out.println("New location is "+i1.getLocation());
        System.out.println("New description is "+i1.getDescription());
        
        Monster m1 = new Monster(3,"chair");
        System.out.println("Location is "+m1.getLocation());
        System.out.println("Description is "+m1.getDescription());
        
        m1.setLocation(4);
        m1.setDescription("table");
        System.out.println("New location is "+m1.getLocation());
        System.out.println("New description is "+m1.getDescription());
    }
}
