package br.com.example;

import br.com.example.budge.Budge;
import br.com.example.budge.ItemBudge;
import br.com.example.tax.ICMS;
import br.com.example.tax.ISS;
import br.com.example.tax.TaxCalculator;

import java.math.BigDecimal;

public class TestTax {
    public static void main(String[] args) {
        Budge budge = new Budge();
        budge.addItem(new ItemBudge(new BigDecimal("100")));
        TaxCalculator taxCalculator = new TaxCalculator();

        //Decorator , pensar em arvore de natal
        System.out.println(taxCalculator.calculate(budge, new ISS(new ICMS(null))));
    }
}
