package com.johnifegwu.DIP;

import com.johnifegwu.DIP.Interfaces.IBankCard;

public class CreditCard implements IBankCard {
    @Override
    public String getCardNumber() {
        return "44721*****33557";
    }

    @Override
    public String getExpiryDate() {
        return "";
    }

    @Override
    public String getCVV() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getCardType() {
        return "CreditCard";
    }

    @Override
    public void processPayment(long amount) {
        System.out.println("Payment processed, amount:  " + amount + " card type: " + getCardType() + " card number: " + getCardNumber());
    }
}
