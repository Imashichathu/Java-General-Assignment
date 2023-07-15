package com.mycompany.jq8;
public class SavingAccount
{
    private double annualInterestRate;
    private double savingsBalance;
    
    public SavingAccount (double balance)
    {
        this.savingsBalance = balance;
    }
    
    public void calculateMonthlyInterest()
    {
        double MonthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance +=MonthlyInterest;
    }
    
    public void modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }
    
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
}
