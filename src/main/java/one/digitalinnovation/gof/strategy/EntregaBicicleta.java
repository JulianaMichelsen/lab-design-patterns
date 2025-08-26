package one.digitalinnovation.gof.strategy;

import org.springframework.stereotype.Component;

@Component
public class EntregaBicicleta implements EntregaStrategy {
    @Override
    public void entregar(String endereco) {
        System.out.println("Entregando em " + endereco + " usando Bicicleta 🚲");
    }
}

