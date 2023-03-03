package br.com.example;

import br.com.example.budge.Budge;
import br.com.example.budge.ItemBudge;
import br.com.example.order.BudgeProxy;

import java.math.BigDecimal;

//Composite
public class TestComposition {
    public static void main(String[] args) {
        Budge old = new Budge();
        old.addItem(new ItemBudge(new BigDecimal("200")));
        old.reprove();

        Budge newB = new Budge();
        newB.addItem(new ItemBudge(new BigDecimal("500")));
        newB.addItem(old);

        BudgeProxy proxy = new BudgeProxy(newB);

        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
    }
}
