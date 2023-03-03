package br.com.example.tax;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class ICMS extends Tax {

    public ICMS(Tax other) {
        super(other);
    }

    protected BigDecimal doCalculation(Budge budge) {
        return budge.getValue().multiply(new BigDecimal("0.1"));
    }

}
