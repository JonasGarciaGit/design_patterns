package br.com.example.order;

import br.com.example.budge.Budge;

import java.time.LocalDateTime;

public class Order {

    private String customer;
    private LocalDateTime date;
    private Budge budge;

    public Order(String customer, LocalDateTime data, Budge budge) {
        this.customer = customer;
        this.date = data;
        this.budge = budge;
    }

    public String getCustomer() {
        return customer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Budge getBudge() {
        return budge;
    }
}
