package com.johnifegwu.DIP.Interfaces;

public interface IBankCard {

    public String getCardNumber();

    public String getExpiryDate();

    public String getCVV();

    public String getName();

    public String getCardType();

    public void processPayment(long amount);
}
