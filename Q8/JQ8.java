package com.mycompany.jq8;
public class JQ8 
{
    public static void main(String[] args) 
    {
        SavingAccount s1 = new SavingAccount(2000.00);
        s1.modifyInterestRate(0.04);
        s1.calculateMonthlyInterest();
        System.out.println("Saver 1 balance after one month "+s1.getSavingsBalance());
        SavingAccount s2 = new SavingAccount(3000.00);
        s2.modifyInterestRate(0.04);
        s2.calculateMonthlyInterest();
        System.out.println("Saver 2 balance after one month "+s2.getSavingsBalance());
        
        s1.modifyInterestRate(0.05);
        s1.calculateMonthlyInterest();
        System.out.println("Saver 1 balance after two months "+s1.getSavingsBalance());
        s2.modifyInterestRate(0.05);
        s2.calculateMonthlyInterest();
        System.out.println("Saver 2 balance after two months "+s2.getSavingsBalance());
    }
}
