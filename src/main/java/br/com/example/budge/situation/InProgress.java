package br.com.example.budge.situation;

import br.com.example.budge.Budge;

import java.math.BigDecimal;

public class InProgress extends BudgeSituation {

    @Override
    public BigDecimal calculateDiscountExtraValue(Budge budge){
        return budge.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void approve(Budge budge){
        budge.setSituation(new Approved());
    }

    @Override
    public void reprove(Budge budge){
        budge.setSituation(new Reproved());
    }
}
