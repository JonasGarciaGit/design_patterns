package br.com.example.budge.situation;

import br.com.example.budge.Budge;

public class Reproved  extends BudgeSituation{
    @Override
    public void finish(Budge budge) {
        budge.setSituation(new Finished());
    }
}
