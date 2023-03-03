package br.com.example.descount;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class NoDiscount extends Discount{

    public NoDiscount(){
        super(null);
    }

    @Override
    protected BigDecimal doCalculation(Budge budge) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean mustApply(Budge budge) {
        return true;
    }
}
