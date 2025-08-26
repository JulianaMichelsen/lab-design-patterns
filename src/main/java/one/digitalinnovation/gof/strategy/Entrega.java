package one.digitalinnovation.gof.strategy;

import org.springframework.stereotype.Component;

@Component
public class Entrega {

    private EntregaStrategy strategy;

    public void setStrategy(EntregaStrategy strategy) {
        this.strategy = strategy;
    }

    public void realizarEntrega(String endereco) {
        strategy.entregar(endereco);
    }
}

