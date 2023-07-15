package com.mycompany.jq9;
class Truck extends Car
{
    int weight;
    
    double getSalePrice()
    {
        if(weight>2000)
        {
            return regularPrice * 0.1;
        }
        else
        {
            return regularPrice * 0.2;
        }
    }
}
