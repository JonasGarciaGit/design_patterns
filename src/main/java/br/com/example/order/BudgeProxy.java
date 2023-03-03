package br.com.example.order;

import br.com.example.budge.Budge;
import br.com.example.budge.Budgetable;

import java.math.BigDecimal;

//Design pattern Proxy
public class BudgeProxy implements Budgetable {
    private BigDecimal value;
    private Budge budge;
    public BudgeProxy(Budge budge) {
        this.budge = budge;
    }

    @Override
    public BigDecimal getValue() {
        if(value == null){
            this.value = budge.getValue();
        }
        return value;
    }
}
