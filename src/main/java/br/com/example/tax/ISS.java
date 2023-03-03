package br.com.example.tax;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class ISS extends Tax{

    public ISS(Tax other) {
        super(other);
    }

    public BigDecimal doCalculation(Budge budge){
        return budge.getValue().multiply(new BigDecimal("0.06"));
    }
}
