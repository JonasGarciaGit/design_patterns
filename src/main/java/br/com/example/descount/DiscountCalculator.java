package br.com.example.descount;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class DiscountCalculator {

    //Chain of responsability
    public BigDecimal calculate(Budge budge){
        Discount chainDiscount = new DiscountForBudgeWithMoreThanFiveItens(
                new DiscountForHighValueBudge(
                        new NoDiscount()));

        return chainDiscount.calculate(budge);
    }

}
