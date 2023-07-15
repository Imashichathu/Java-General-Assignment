package com.mycompany.jq9;
class Ford extends Car
{
    int year;
    int manufacturerDiscount;
    
    double getSalePrice()
    {
        double salePrice = super.getSalePrice();
        return salePrice - manufacturerDiscount;
    }
}
