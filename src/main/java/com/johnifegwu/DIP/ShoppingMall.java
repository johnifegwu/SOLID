package com.johnifegwu.DIP;

import com.johnifegwu.DIP.Interfaces.IBankCard;

import java.util.Scanner;

public class ShoppingMall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amoun: ");
        String amount = sc.nextLine();

        IBankCard bankCard = new DebitCard();

        bankCard.processPayment(Long.parseLong(amount));
    }
}
