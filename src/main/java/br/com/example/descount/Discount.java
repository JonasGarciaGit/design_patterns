package br.com.example.descount;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;
    public Discount(Discount next) {
        this.next = next;
    }

    //Template Method
    public BigDecimal calculate(Budge budge){
        if(mustApply(budge)){
            return doCalculation(budge);
        }
        return next.calculate(budge);
    }
    protected abstract BigDecimal doCalculation(Budge budge);
    protected abstract boolean mustApply(Budge budge);
}
