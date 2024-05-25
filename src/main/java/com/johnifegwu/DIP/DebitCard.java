package com.johnifegwu.DIP;

import com.johnifegwu.DIP.Interfaces.IBankCard;

public class DebitCard implements IBankCard {
    @Override
    public String getCardNumber() {
        return "54821*****12453";
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
        return "DebitCard";
    }

    @Override
    public void processPayment(long amount) {
        System.out.println("Payment processed, amount:  " + amount + " card type: " + getCardType() + " card number: " + getCardNumber());
    }
}
