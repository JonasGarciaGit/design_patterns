package br.com.example;

import br.com.example.order.GenerateOrder;
import br.com.example.order.GenerateOrderHandler;
import br.com.example.order.action.OrderLog;
import br.com.example.order.action.SaveOrderDB;
import br.com.example.order.action.SendMailOrder;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestOrder {

    public static void main(String[] args) {
       String customer = "Jonas Garcia";
       BigDecimal budgeValue = new BigDecimal("300");
       int itensQuantity = Integer.parseInt("2");


       //Design pattern Command
        GenerateOrder generateOrder= new GenerateOrder(customer, budgeValue, itensQuantity);

        GenerateOrderHandler orderHandler = new GenerateOrderHandler(
                Arrays.asList(new SaveOrderDB(),
                        new SendMailOrder(),
                        new OrderLog())
        );

        //This method indirectly is a Facade!
        orderHandler.execute(generateOrder);


    }
}
