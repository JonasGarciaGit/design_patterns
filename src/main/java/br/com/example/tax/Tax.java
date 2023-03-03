package br.com.example.tax;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

//Decorator
public abstract class Tax {

    private Tax other;

    public Tax(Tax other) {
        this.other = other;
    }

    protected abstract BigDecimal doCalculation(Budge budge);
    public BigDecimal calculate(Budge budge){
        BigDecimal taxValue = doCalculation(budge);
        BigDecimal otherTaxValue = BigDecimal.ZERO;
        if (other != null){
           otherTaxValue = other.doCalculation(budge);
        }
        return taxValue.add(otherTaxValue);
    }
}
