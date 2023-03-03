package br.com.example.budge;

import br.com.example.DomainException;
import br.com.example.http.HttpAdapter;

import java.util.Map;

public class BudgeRegistry {

    private HttpAdapter http;

    public BudgeRegistry(HttpAdapter http) {
        this.http = http;
    }

    public void register(Budge budge){
        if(!budge.isFinished()){
            throw new DomainException("Budge not is finished!");
        }

        String url = "https://api.com.br";
        Map<String, Object> data = Map.of(
                "value", budge.getValue(),
                "itensQuantity", budge.getItemQuantity()
        );

        http.post(url, data);
    }

}
