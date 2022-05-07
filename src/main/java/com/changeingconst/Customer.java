package com.changeingconst;

public class Customer extends Person {
    private final String loyaltyCardId;

    public Customer(String firstName, String middleName, String lastName, int age, String loyaltyCardId) {
        super(firstName, middleName, lastName, age);
        this.loyaltyCardId = loyaltyCardId;
    }

    public Customer(String firstName, String lastName, int age, String loyaltyCardId) {
        this(firstName, null, lastName, age, loyaltyCardId);
    }
    //getters, equals and hashcode
}