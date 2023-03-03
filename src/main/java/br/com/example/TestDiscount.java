package br.com.example;

import br.com.example.budge.Budge;
import br.com.example.budge.ItemBudge;
import br.com.example.descount.DiscountCalculator;
import br.com.example.tax.ICMS;
import br.com.example.tax.TaxCalculator;

import java.math.BigDecimal;

public class TestDiscount {
    public static void main(String[] args) {
        Budge firstBudge = new Budge();
        firstBudge.addItem(new ItemBudge(new BigDecimal("200")));
        Budge secondBudge = new Budge();
        secondBudge.addItem(new ItemBudge(new BigDecimal("1000")));

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(firstBudge).toString());
        System.out.println(calculator.calculate(secondBudge).toString());
    }
}