package br.com.example;

import br.com.example.budge.Budge;
import br.com.example.budge.BudgeRegistry;
import br.com.example.budge.ItemBudge;
import br.com.example.http.JavaHttpClient;

import java.math.BigDecimal;

public class TestAdapter {

    public static void main(String[] args) {
        Budge budge = new Budge();
        budge.addItem(new ItemBudge(new BigDecimal("200")));
        budge.approve();
        budge.finish();

        BudgeRegistry registry = new BudgeRegistry(new JavaHttpClient());
        registry.register(budge);
    }
}
