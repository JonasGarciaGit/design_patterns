package br.com.example.tax;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class TaxCalculator {

    //Strategy
    public BigDecimal calculate(Budge budge, Tax tax) {
        return tax.calculate(budge);
    }


}
