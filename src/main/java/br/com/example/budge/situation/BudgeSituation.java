package br.com.example.budge.situation;

import br.com.example.DomainException;
import br.com.example.budge.Budge;

import java.math.BigDecimal;

public abstract class BudgeSituation {

    public BigDecimal calculateDiscountExtraValue(Budge budge){
        return BigDecimal.ZERO;
    }
    public void approve(Budge budge){
        throw new DomainException("Budge cant be approved!");
    }
    public void reprove(Budge budge){
        throw new DomainException("Budge cant be reproved!");
    }

    public void finish(Budge budge){
        throw new DomainException("Budge cant be finished!");
    }
}
