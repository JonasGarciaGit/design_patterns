package br.com.example.order.action;

import br.com.example.order.Order;

public interface ActionAfterGenerateOrder {

    public void executeAction(Order order);
}
