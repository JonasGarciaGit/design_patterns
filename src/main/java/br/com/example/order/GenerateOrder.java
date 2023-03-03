package br.com.example.order;

import java.math.BigDecimal;

public class GenerateOrder {

    private String customer;
    private BigDecimal budgeValue;
    private int itensQuantity;

    public GenerateOrder(String customer, BigDecimal budgeValue, int itensQuantity) {
        this.customer = customer;
        this.budgeValue = budgeValue;
        this.itensQuantity = itensQuantity;
    }

    public String getCustomer() {
        return customer;
    }

    public BigDecimal getBudgeValue() {
        return budgeValue;
    }

    public int getItensQuantity() {
        return itensQuantity;
    }

}
