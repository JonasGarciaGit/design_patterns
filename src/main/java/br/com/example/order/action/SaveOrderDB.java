package br.com.example.order.action;

import br.com.example.order.Order;

public class SaveOrderDB implements ActionAfterGenerateOrder{
    public void executeAction(Order order){
        System.out.println("Saving order in database ::: " + order);
    }
}
