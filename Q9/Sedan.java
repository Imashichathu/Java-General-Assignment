package com.mycompany.jq9;
class Sedan extends Car 
{
    int length;
    
    double getSalePrice()
    {
        if(length > 20)
        {
            return regularPrice * 0.95;//5% discount
        }
        else
        {
            return regularPrice *0.9;//10% discount
        }      
    }
}
