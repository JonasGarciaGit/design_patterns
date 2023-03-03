package br.com.example.budge;

import java.math.BigDecimal;

public class ItemBudge implements Budgetable{

    private BigDecimal value;

    public ItemBudge(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}
