package br.com.example.budge.situation;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class Approved extends BudgeSituation{

    @Override
    public BigDecimal calculateDiscountExtraValue(Budge budge){
        return budge.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budge budge) {
        budge.setSituation(new Finished());
    }
}
