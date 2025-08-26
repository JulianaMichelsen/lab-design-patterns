package one.digitalinnovation.gof;

import one.digitalinnovation.gof.strategy.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext ctx) {
        return args -> {
            // Pega o bean do contexto do Spring
            Entrega entrega = ctx.getBean(Entrega.class);

            // Testando cada estratégia
            entrega.setStrategy(ctx.getBean(EntregaBicicleta.class));
            entrega.realizarEntrega("Rua A, 123");

            entrega.setStrategy(ctx.getBean(EntregaCarro.class));
            entrega.realizarEntrega("Avenida B, 456");

            entrega.setStrategy(ctx.getBean(EntregaDrone.class));
            entrega.realizarEntrega("Praça C, 789");
        };
    }
}
