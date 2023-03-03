package br.com.example.descount;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class DiscountForHighValueBudge extends Discount {

    public DiscountForHighValueBudge(Discount next) {
        super(next);
    }
    @Override
    protected BigDecimal doCalculation(Budge budge) {
        return budge.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean mustApply(Budge budge) {
        return budge.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
