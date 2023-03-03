package br.com.example.order;

import br.com.example.budge.Budge;
import br.com.example.budge.ItemBudge;
import br.com.example.order.action.ActionAfterGenerateOrder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

//Design pattern Command
public class GenerateOrderHandler {

    //Nosso ouvinte pro design observer
    private List<ActionAfterGenerateOrder> actions;

    public GenerateOrderHandler(List<ActionAfterGenerateOrder> actions) {
        this.actions = actions;
    }

    //Construtor com injecao de dependencias, repository, service e afins
    public void execute(GenerateOrder data){
        Budge budge = new Budge();
        budge.addItem(new ItemBudge(new BigDecimal("200")));
        Order order = new Order(data.getCustomer(), LocalDateTime.now(), budge);

        //Observer
        actions.forEach(a -> a.executeAction(order));
    }
}
