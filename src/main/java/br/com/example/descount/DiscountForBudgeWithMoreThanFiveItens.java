package br.com.example.descount;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class DiscountForBudgeWithMoreThanFiveItens extends Discount {

    public DiscountForBudgeWithMoreThanFiveItens(Discount next) {
        super(next);
    }
    @Override
    protected BigDecimal doCalculation(Budge budge) {
        return budge.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean mustApply(Budge budge) {
        return budge.getItemQuantity() > 5;
    }
}
