package br.com.example.budge;

import br.com.example.budge.situation.BudgeSituation;
import br.com.example.budge.situation.Finished;
import br.com.example.budge.situation.InProgress;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//Implementing Budgetable for pattern //Composite
public class Budge implements Budgetable{
    private BigDecimal value;
    private BudgeSituation situation;
    private List<Budgetable> itens;

    public Budge() {
        this.value = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situation = new InProgress();
    }

    //Implementando State
    public void applyExtraDiscount(){
        BigDecimal discountExtraValue = this.situation.calculateDiscountExtraValue(this);
        this.value = this.value.subtract(discountExtraValue);
    }

    public void approve(){
        this.situation.approve(this);
    }

    public void reprove(){
        this.situation.reprove(this);
    }

    public void finish(){
        this.situation.finish(this);
    }

    public BigDecimal getValue() {
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this.value;
    }
    public int getItemQuantity() {
        return itens.size();
    }

    public BudgeSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgeSituation situation) {
        this.situation = situation;
    }

    public boolean isFinished() {
        return situation instanceof Finished;
    }

    //Composite
    public void addItem(Budgetable item){
        this.value = value.add(item.getValue());
        this.itens.add(item);
    }

}
